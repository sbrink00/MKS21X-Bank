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

    BankAccount b1 = new BankAccount(1000, 500.00, "pass1");
    BankAccount b2 = new BankAccount(2000, 0.00, "pass2");
    System.out.println(b1.transferTo(b2, 250.00, "urmom"));
    System.out.println(b1.transferTo(b2, -1098097.00, "pass1"));
    System.out.println(b1.transferTo(b2, 501.00, "pass1"));
    System.out.println(b1.transferTo(b2, 250.00, "pass1"));
    System.out.println(b1);
    System.out.println(b2);
  }
}
