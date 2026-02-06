package src;


public class User{
    //Class to add each user login
    private String name;
    private double balance = 0;
    private String account;
    private String password;

    public User(String account, String password){
        setAccount(account);
        setPassword(password);
    }

    //GETTERS & SETTERS

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        Scanner pass = new Scanner(System.in);
        while(true){
            boolean isValid = isValidPassword(password);
            if(isValid){
                this.password = password;
                break;
            }
            else{
                this.password = "WEAK PASSWORD";
                System.out.println("Weak password!\nUse capital letter\nUse special characters\n");
                System.out.print("Try again: ");
                password = pass.nextLine();
            }
        }
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/]).{8,}$";

        return password.matches(regex);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void addBalance(double balance){
        this.balance += balance;
    }

    public void payBalance(double balance){
        if(this.balance >= balance) this.balance -= balance;
        else System.out.println("Purchase denied: Not enough balance");   
    }


} {
    
}
