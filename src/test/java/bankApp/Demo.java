package bankApp;

public class Demo {
    public static void main(String[] args) {



    Bank cbk = new Bank("Commercial BAnk of Kyrgystan");

    Account sanirasAccount = new Account(12345,"san@gmail.com",1000);

  cbk.registerAccount(sanirasAccount);

    Account aidanasAccount = new Account(11111,"aidana@gmail.com",2000);
cbk.registerAccount(aidanasAccount);


}}
