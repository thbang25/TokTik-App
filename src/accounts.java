import java.util.Scanner;
import java.io.*;
import java.util.*;
 
// Class
public class accounts {
 
    // Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
    BinarySearchAccount<Account> bst = new BinarySearchAccount<Account>();
 
 
    // Method 1
 
    public void addAccount(){
                    System.out.print("Enter the account name: ");
                    String accountName = input.nextLine();
                    System.out.print("Enter the account description: ");
                    String desc = input.nextLine();
                    bst.insert(new Account(accountName, desc));
                    }

 
    // Method 2
  
    public void showDescription(){
                    System.out.print("Enter the account name: ");
                    String accountName1 = input.nextLine();
                    Account acc = bst.find(accountName1);
                        if(acc != null){
                        System.out.println("Account Name : " + acc.getName());
                        System.out.println("Account description : " + acc.getDescription());
                    }
                    else{
                        System.out.println("Account does not exist");
                    }
                    

    }

    public void showAccount(){
     bst.inorder();
    }

    public void showAccountFile(){
        bst.inorder();
    }


        // Method 3
    // To create menu
    public void displayMenu(){
 
        // Displaying menu
        System.out.println("Choose an action from the menu:");
        System.out.println("1. Find the profile description for a given account");
        System.out.println("2. List all accounts");
        System.out.println("3. Create an account");
        System.out.println("4. Delete an account");
        System.out.println("5. Display all posts for a single account");
        System.out.println("6. Add a new post for an account");
        System.out.println("7. Load a file of actions from disk and process this");
        System.out.println("8. Quit");
        System.out.print("Enter your choice: ");
        }
 

    
//method 4
public void readFile() throws IOException {
        
		//connect the program with the text file for reading.
		File file = new File("../data/dataset.txt");
		Scanner readFile = new Scanner(file);
		
		
		StringTokenizer token = null;
        String create;
	    String name; 
	    String d1;
	    String d2;
	    String d3;
		 


		while(readFile.hasNextLine()) {
			 token  = new StringTokenizer(readFile.nextLine(), " ");
		     
	
			 create = token.nextToken();
			 name = token.nextToken(); 
			 d1 = token.nextToken();
			 d2 = token.nextToken();
			 d3 = token.nextToken();
             String d = d1+" "+d2+" "+d3;
			 
			 if(create.equals("Create")){
                 bst.insert(new Account(name, d));}
			 
		
		}
}

        public void showDescriptionFile(){
                    System.out.print("Enter the account name: ");
                    String accountName2 = input.nextLine();
                    Account acc2 = bst.find(accountName2);
                    if(acc2 != null){
                        System.out.println("Account Name : " + acc2.getName());
                        System.out.println("Account description : " + acc2.getDescription());
                        
                    }
                    else{
                        System.out.println("Account does not exist");
                    }
                    

    }

        public void DeleteAccount(){
                    System.out.print("Enter the account name: ");
                    String accountName3 = input.nextLine();
                    Account acc3 = bst.delete(accountName3);
                    System.out.println("Account has been successfully deleted");
                        
        }

        public void DeleteFileAccount(){
            System.out.print("Enter the account name: ");
            String accountName4 = input.nextLine();
            Account acc4 = bst.delete(accountName4);
            System.out.println("Account has been successfully deleted");
                
}

 
}
