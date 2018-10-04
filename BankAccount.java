public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

/*Sole constructor requires all field's values*/
   public BankAccount( int newaccountID, double newbalance, String newpassword){
     balance = newbalance;
     accountID = newaccountID;
     password = newpassword;
   }
  /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
   public String toString(){
     return "Balance: " + balance + "\nAccount ID: " + accountID;
   }
  /*standard accessor methods*/
   public double getBalance(){
     return balance;
   }
   public int getAccountID(){
     return accountID;
   }
   public String getPassword(){
     return password;
   }
  /*Change the value of password to the specified value
   *@param newPass The value to replace the old password with*/
    public void setPassword(String newPass){
      password = newPass;
    }
  /*Only when amount is positive: Increase balance by amount and return true.
   *@return When amount is positive: Return true, otherwise return false.
   *@param amount The amount is how much to change the balance by.
   */
    public boolean deposit(double amount){
      if (amount >= 0){
        balance += amount;
        return true;
      }
      else{
        return false;
      }
    }
  /*Only when amount is positive and the amount does not exceed the balance:
   *Decrease balance by amount and return true, return false otherwise.
   *Make no change if the amount is too large to withdraw
   *@param amount The amount is how much to change the balance by.
   *@return true when the balance is large enough, false otherwise.
   */
    public boolean withdraw(double amount){
      if (amount >= 0 && amount <= balance){
        balance -= amount;
        return true;
      }
      else{
        return false;
      }
    }

    private boolean authenticate(String password){
      return password.equals(this.password);
    }

    public boolean transferTo(BankAccount other, double amount, String password){
      return authenticate(password) && this.withdraw(amount) && other.deposit(amount);
    }

}
