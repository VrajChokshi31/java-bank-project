import java.util.*;

public class Main{


public static int Extract(int balance,int value)
{
 if(balance<value)
   {
     System.out.println("faulty transcation");
     return 0;
   }
 else{
      System.out.println("debited"+" "+value+" "+"from account");
      balance=balance-value;
      System.out.println("Current balance="+balance);
      return balance;
     }
}

public static int Add(int balance,int value)
{
  System.out.println("credited"+" "+value+" "+"from account");
  balance=balance+value;
  System.out.println("Current balance="+balance);
  return balance;
}
public static void Display(int balance)
{
 System.out.println("Final Balance=" + balance);
}

public static void main(String[] argrs)
{
  System.out.println("Select 0 to continue ");

 // System.out.println("Select 1 for checking ");
  System.out.println("Select -1 for exit");
  Scanner obj = new Scanner(System.in);
  int flag = obj.nextInt();
 int balance = 10000;
int Cbalance = 10000;
  while(flag!=-1)
  {
   System.out.println("Enter 1 for saving and 2 for checking");
   int f = obj.nextInt();
   if(f==1)
    {
    System.out.println("Saving Account");
   
    System.out.println("enter 3 for credit and 4 for debit");
    int i=0;
   int c = obj.nextInt(); 
    if(c==4)
   {
    //int balance1=balance2=balance3=0;
    System.out.println("Enter Amount to be debited");
    int value=obj.nextInt();
    if(value%500!=0)
    {
     System.out.println("Enter correct value");
     i++;
    }

    int balance1=Extract(balance,value);
    balance=balance1;
    if(i==0)
    {
       Display(balance);
    }
     else{
        System.out.println("Invalid Transcation");
        }
   }
   if(c==3)
{
    System.out.println("Enter Amount to be credited");
    int value1=obj.nextInt();
    if(value1%500!=0)
    {
      System.out.println("Enter correct value");
      i++;

    }
    int balance2=Add(balance,value1);
     balance=balance2;
   if(i==0)
    {
       Display(balance);
    }
     else{
        System.out.println("Invalid Transcation");
        }
}
    
    
}   

 

  if(f==2)
 {
    System.out.println("Checkingg Account");
   
    System.out.println("enter 3 for credit and 4 for debit");
    int i=0;
   int c = obj.nextInt(); 
    if(c==4)
   {
    //int balance1=balance2=balance3=0;
    System.out.println("Enter Amount to be debited");
    int value=obj.nextInt();
    if(value%500!=0)
    {
     System.out.println("Enter correct value");
     i++;
    }

    int balance1=Extract(Cbalance,value);
     Cbalance=balance1;
    if(i==0)
    {
       Display(Cbalance);
    }
     else{
        System.out.println("Invalid Transcation");
        }
   }
   if(c==3)
{
    System.out.println("Enter Amount to be credited");
    int value1=obj.nextInt();
    if(value1%500!=0)
    {
      System.out.println("Enter correct value");
      i++;

    }
    int balance2=Add(Cbalance,value1);
     Cbalance=balance2;
   if(i==0)
    {
       Display(Cbalance);
    }
     else{
        System.out.println("Invalid Transcation");
        }
}
    
    
} 
   System.out.println("Enter value of flag");
   flag=obj.nextInt();
  }
 }
}