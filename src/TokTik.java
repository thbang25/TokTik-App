import java.io.*;
import java.util.*;

//thabang sambo
//my main
//14 april 2023
public class TokTik{
public static void main(String[] args) throws Exception {
    
    Scanner input = new Scanner(System.in);
    accounts a = new accounts();
    posts p = new posts();
    int choice;
    int cnt =0;
    int cnt2 = 0;
    int cnt3 = 0;


        do{
            a.displayMenu();
            choice = input.nextInt();

            switch(choice){

                case 4:
                   if(cnt2>0){
                   a.DeleteAccount();}
                   if(cnt>0){
                    a.DeleteFileAccount();}
                    break;

                case 2:
                if(cnt2>0){
                    a.showAccount();}
                    if(cnt>0){
                     a.showAccountFile();}
                     break;
                
                case 3:
                    a.addAccount();
                    cnt2++;
                    break;

                    
                case 1:
                   if(cnt2>0){
                   a.showDescription();}
                   if(cnt>0){
                    a.showDescriptionFile();
                   }
                    break;
                    
                case 7:
                    a.readFile();
                    p.loadFile();
                    cnt++;
                    break;
                
                case 5:
                    if(cnt3>0){
                            p.showPost();}
                    if(cnt>0){
                        p.showPostFile();
                    }
                    break;

                case 6:
                    p.addPost();
                    cnt3++;
                    break;

                case 8:
                 System.out.println("Bye!");

            }


        }

    while(choice !=8);
   }
}