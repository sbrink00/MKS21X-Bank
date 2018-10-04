public class Driver{
  public static void main(String[] args){
    BankAccount output = new BankAccount(10101, 1000.00, "qwerty");
    System.out.println(output);

    output.setPassword("qwertybad");
    System.out.println(output.getPassword());

    if (output.deposit(1000)){
      System.out.println("Deposit successful, balance is now " + output.getBalance());
    }
    else{
      System.out.println("Deposit fialed");
    }

    if (output.deposit(-1000)){
      System.out.println("Deposit successful, balance is now " + output.getBalance());
    }
    else{
      System.out.println("Deposit fialed");
    }

    if (output.withdraw(500)){
      System.out.println("Withdraw successful, balance is now " + output.getBalance());
    }
    else{
      System.out.println("Withdraw fialed");
    }

    if (output.withdraw(254534)){
      System.out.println("Withdraw successful, balance is now " + output.getBalance());
    }
    else{
      System.out.println("Withdraw fialed");
    }

    System.out.println(output);

  }
}
