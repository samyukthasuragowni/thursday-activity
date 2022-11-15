package com;

public class Bdetails {
	private Bank[] account;
    private int entry;
    Bankdetails() 
    {
  	  account=new Bank[4];
    }
   void checkBalance(Bank input)
  	{
  		if(entry<account.length)
  		{
  			account[entry]=input;
  			entry++;
  			
  			if(input.getBalance()<(10000))
         System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance());
  		}
  	}
    
	public static void main(String[] args) {
 Bank b1=new Bank("sam",525,981.00);
 Bank b2=new Bank("rahul",246,682.00);
 Bank b3=new Bank("arun",127,584.00);
 Bank b4=new Bank("prinky",248,565.00);

 Bankdetails myBank = new Bankdetails();
 myBank.checkBalance(b1);
 myBank.checkBalance(b2);
 myBank.checkBalance(b3);
 myBank.checkBalance(b4);

	}
}

}

}
