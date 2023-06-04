/* When you login to the account 4 options will be available
 *  1) Check Balance on the Account
 *  2) Deposit Money on the Account
 *  3) Transfer Money from one Account to another Account
 *  4) History of Transactions
 */
public class Login {
    // 
    private String username;
    private String password;
    private int balance;
    
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdrawal(int amount){
        this.balance -= amount;
    }

    public void transfer(String accNumb_from,String accNumb_to, int amount){

    }

    // Encrypt the password on the account
     public String encryption(String accountN){
        
        return "";
    }
    // Decrypt the password on the account
    public String decryption(String accountN){

        return "";
    }   
}