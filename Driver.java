public class Driver{
 /*Sole constructor requires all field's values*/

 public BankAccount( int accountID, double balance, String password){...} 


/*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */ 

 public String toString(){...} 


/*standard accessor methods*/ 

 public double getBalance(){...} 

 public int getAccountID(){...} 


/*Change the value of password to the specified value 

 *@param newPass The value to replace the old password with*/ 

  public void setPassword(String newPass){...} 


/*When amount is positive: Increase balance by amount and return true. 

 *@return When amount is positive: Return true, otherwise return false. 

 *@param amount The amount is how much to change the balance by.

 */ 

  public boolean deposit(double amount){...} 

  

/*When amount is positive and the amount is at least as much as the balance: 

 *Decrease balance by amount if the balance is large enough.

 *Make no change if the amount is too large to withdraw 

 *@param amount The amount is how much to change the balance by.

 *@return true when the balance is large enough, false otherwise.

 */ 

  public boolean withdraw(double amount){... }




}
