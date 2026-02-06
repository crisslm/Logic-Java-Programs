package src.bank;
import java.util.Scanner;

import src.User;

public class Bank{

    public static Node searchPassword(LinkedList users, String account){
        Node first = users.head;
        while(first != null){
            if((first.user.getName()).equals(account)){
                return first;
            }
            first = first.next;
        }
        return null;
    }


    public static void enterOptions(){
        System.out.println("Options available:\n\n1)Login\n2)Create new account\n");
        System.out.print("What would you like to do?: ");
    }
    public static void main(String [] args){
        //The main interface
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bank!");
        System.out.println("---------------------");

        LinkedList users = new LinkedList();
    
        enterOptions();
        int options = sc.nextInt();

        while(true){
            switch(options){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter your account: ");
                    String account = sc.nextLine();
                    Node resp = searchPassword(users, account);
                    if(resp == null){
                        System.out.println("\nAccount not found!\n");
                    } else{
                        System.out.println("Account found!\n");
                        System.out.print("Enter the paswsword: ");
                        String password = sc.nextLine();
                        if(password.equals(resp.user.getPassword())){
                            System.out.println("Welcome " + resp.user.getName() + "!");
                        } else{
                            System.out.println("Wrong password!");
                        }
                    }
                    enterOptions();
                    options = sc.nextInt();

                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Create a new account: ");
                    String account2 = sc.nextLine();
                    Node resp2 = searchPassword(users, account2);
                    if(resp2 != null){
                        System.out.println("This account already exist! ");
                        enterOptions();
                        options = sc.nextInt();
                        break;
                    }
                    System.out.print("Create a new password: ");
                    String password2 = sc.nextLine();

                    User newUser = new User(account2, password2);
                    System.out.print("\nHello! How do we call you?: ");
                    String name = sc.nextLine();
                    newUser.setName(name);
                    System.out.println("\nWelcome " + name + "!\n");
                    users.add(newUser);
                    enterOptions();
                    options = sc.nextInt();
                    break;
                default:
                    System.out.print("Invalid input, try again: ");
                    options = sc.nextInt();
                    break;
            }
        }
        


}

}

class LinkedList {
    Node head;

    // Add element at the end
    public void add(User user) {
        Node newNode = new Node(user);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print the user name
    public void printUserName() {
        Node current = head;
        while (current != null) {
            System.out.print(current.user.getName() + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}
