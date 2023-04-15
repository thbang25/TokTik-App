import java.util.Scanner;
import java.io.*;
import java.util.*;
 
// CLass
public class posts {
 
    // Class data members
    Scanner input = new Scanner(System.in);
    BinarySearch<Post> bst2 = new BinarySearch<Post>();
 
    // Method 1
    public void addPost(){
        System.out.println("Enter Account Name:");
        String accountName = input.nextLine();
        System.out.println("Enter Video Name:");
        String videoName = input.nextLine();
        System.out.println("Enter Quantity of Likes:");
        int Likes = input.nextInt();
        input.nextLine();
        System.out.println("Enter Tittle Name:");
        String Tittle = input.nextLine();
        bst2.insert(new Post(accountName, videoName,Likes, Tittle));
 }

     public void showPost(){
                    System.out.print("Enter the account name: ");
                    String accountName2 = input.nextLine();
                    Post pos = bst2.find(accountName2);
                    if(pos != null){
                    System.out.println(" ");
                    System.out.println("Video Name : " + pos.getVideoName());
                    System.out.println("Number of Likes : " + pos.getLikes());
                    System.out.println("the title of the video : " + pos.getTittle());
                    System.out.println(" ");
                    }
                    else{
                        System.out.println("No such account");
                    }
                    

    }



public void loadFile() throws IOException {
        
		//connect the program with the text file for reading.
		File file = new File("../data/dataset.txt");
		Scanner readFile = new Scanner(file);

        Scanner scan = new Scanner(file);
		
		
        String add;
	    String AccName; 
	    String vidName;
	    String like;
	    String t1;
        String t2;
        String t3;
        String t4;
		
        while(scan.hasNextLine()){
        String line = scan.nextLine();
        String [] arr = line.split(" ");
        if(arr[0].equals("Add")){
            AccName = arr[1];
            vidName = arr[2];
            like = arr[3];
            t1 = arr[4];
            t2 = arr[5];
            t3 = arr[6];
            t4 = arr[7];
            String title = t1 + " " + t2 + " " + t3 + " " + t4;
            int likes = Integer.parseInt(like);
            
                bst2.insert(new Post (AccName, vidName,likes,title));
        
        }
    }
}

            public void showPostFile(){
                    System.out.print("Enter the account name: ");
                    String accountName2 = input.nextLine();
                    Post pos = bst2.find(accountName2);
                    if(pos != null){
                    System.out.println("Video Name : " + pos.getVideoName());
                    System.out.println("Number of Likes : " + pos.getLikes());
                    System.out.println("the title of the video : " + pos.getTittle());
                    System.out.println(" ");
                    }
                    else{
                        System.out.println("No Such Account ");
                    }
                    

    }
}