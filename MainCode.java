/*Samuel Doan
 * Alan Yang
 * CIS 3260
 * Main Project
 */

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class MainCode
{
        static Customer c1 = new Customer("Jane",5000);
        static Customer c2 = new Customer("Jone",8000);
        static Customer c3 = new Customer("mmmm", 1000000);
        
        static Casino asdf = new Casino();
        static Casino qwer = new Casino("JimmyJOnes", 500000);
        static Casino zxcv = new Casino("Brusters",123456);
        static Scanner input = new Scanner(System.in);
        static Random rand = new Random();
    public static void main(String[] args)
    {
        //User is given a choice in what command they get to do.
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please choose a program from below to start:");
        System.out.println("1. Create a new customer");
        System.out.println("2. Create a new casino");
        System.out.println("3. Change a customer's name");
        System.out.println("4. Change a casino's name");
        System.out.println("5. Play games as customer");
        System.out.println("6. Display customer details");
        System.out.println("7. Display casino details");
        int answer = input.nextInt();*/
        
        
        //asdf playing against c1
        asdf.slots();
        
    }
    
    public static class Customer
    {
        String name;
        double balance;
        int id;
        static int nextId;
        
        public Customer(String n, int bal)
        {
             name = n;
             balance = bal;
             id = nextId++;
        }
        
        public Customer()
        {
            name = "default customer";
            balance = 1000;
            id = nextId++;
        }
        
        public double getBalance()
        {
            return balance;
        }
        
        public boolean checkBalance(double bet){
            //I made this for a reason but i forgot.
            if((balance - bet) <0){
                System.out.println("Not enough funds");
                return false;
            }
            return true;
        }
        
        public String getName()
        {
            return name;
        }
        
        public void setName(String n)
        {
            name = n;
        }
        
        public int getId()
        {
            return id;
        }
        
        public void setBalance(int bal)
        {
            balance = bal;
        }
        
        public void showBalance()
        {
            System.out.println("Current Balance: "+balance);
        }
        
        public void addBalance(int a)
        {
            balance += a;
        }
       
        public void removeBalance(int a)
        {
            balance -= a;
        }
        
        public void changeBalance(double a)
        {
            balance += a;//Special code will be used at each game to make sure the variable runs with both winning or lossing results
        }
        
        void details()
        {
             System.out.println("Customer name: "+ name);
             System.out.println("Customer ID: "+id);
             System.out.println("Current Balance: "+balance);
             System.out.println();
        }
        
    }
    
    public static class Casino
    {
        private String name;
        double balance;
        int id;
        static int nextCid;
        
        public Casino(String n, double bal)
        {
            name = n;
            balance = bal;
            id = nextCid++;
        }
        
        public Casino(){
            name = "default casino";
            id = nextCid++;
            balance = 1000;
        }
        
        public boolean checkBalance(double bet)
        {
            
            if((getBalance()-bet)<0){
                System.out.println("Casino does not have enough funds");
                return false;
            }
            return true;
        }
        
        public void changeBalance(double a){
            balance += a;
        }
        
        public double getBalance(){
            return balance;
        }
        
        public void changeName(String n){
            double check = balance - 15000;
            if(check<0){
              name = name;
              System.out.println("not enough funds to change name");
            }
            balance =check;
            name = n;
        }
        
        public void details(){
            System.out.println("Casino's name: "+name);
            System.out.println("Casino's balance "+ balance);
            System.out.println();
        }
        
        public void sevenEleven(){
            Random rand = new Random();
            //boolean to use to re-roll and loop until winner is decided.
            boolean noWinner = true;
            //boolean expression to check if the customer and casino have enouh funds.
            boolean goodEnough = true;
            
            c1.details();
            asdf.details();
            System.out.println("Let's start a game of Seven/Eleven.");
            Scanner keyboard = new Scanner(System.in);
            //Placing bet Amout
            System.out.println("Place your bet:");
            double betAmount = keyboard.nextDouble();
            if(betAmount <=0){
                System.out.println("Need to actually put in money");
                betAmount = keyboard.nextDouble();
            }
                //line of code that will check if the player has enough money.
                //line of code for the casino to match the bet the player placed.
                goodEnough = c1.checkBalance(betAmount);
                while(goodEnough != true)
                {
                    System.out.println("Please place a bet within your funds");
                    System.out.println("You have funds of " + c1.getBalance());
                    goodEnough = c1.checkBalance(keyboard.nextDouble());
                }
                //the bet amount is negative to annotate that the moeny will be taken out of the account.
                c1.changeBalance(-betAmount);
                
                //check to make sure the casino has enough funds
                goodEnough = asdf.checkBalance(betAmount);
                while(goodEnough!=true)
                {
                    System.out.println("This is the current funds for the Casino: " + asdf.getBalance());
                     goodEnough = asdf.checkBalance(keyboard.nextDouble());
                }
                asdf.changeBalance(-betAmount);
            //Roll the dice
        
            while(noWinner){
                //rolling for customer
                int roll1 = rand.nextInt(6)+1;
                int roll2 = rand.nextInt(6)+1;
                int cuTotal = roll1 + roll2;
                System.out.println("You rolled a " + cuTotal);
                //rolling for casino.
                roll1 = rand.nextInt(6)+1;
                roll2 = rand.nextInt(6)+1;
                int caTotal = roll1 + roll2;
                System.out.println("Casino rolled a "+ caTotal);
                //if customer rolled a 7 but the casino didn't roll a 7 or 11
                //customer wins
                if(cuTotal==7){
                    if(caTotal!=7&&caTotal!=11){
                        System.out.println("Player wins");
                        noWinner = false;
                    }   
                }
                //if the customer rolled an 11 but the casino didn't roll an 11
                //customer wilns
                if(cuTotal==11){
                    if(caTotal!=11){
                        System.out.println("Player wins");
                        noWinner = false;
                    }   
                }
                
                //if the casino rolled an 11 but the customer didn't roll an 11
                if(caTotal==11){
                    if(cuTotal!=11)
                    {
                        System.out.println("Casino wins!");
                        noWinner = false;
                    }
                }
                //if the casino rolled  7 but the casino didn't roll a 7 or 11
                //casino wins
                if(caTotal==7){
                    if(cuTotal!=7&&cuTotal!=11)
                    {
                        System.out.println("Casino wins!");
                        noWinner = false;
                    }
                }            
             }

        } 
        
        public void slots()
        {
            int spins = 0;
            double bet = 0;
            
            System.out.println("Your current balance is " + c1.getBalance());
            System.out.println("the casino's balance is "+asdf.getBalance());
            System.out.println("Now it's time to play a game of slots");
            System.out.println("How many time would you like to spin?");
            System.out.println("It costs 5 per spin.");
            spins = input.nextInt();
            if(spins <=0){
                System.out.println("We need a number greater than 0");
                spins = input.nextInt();
            }
            bet = spins*5;
            
            boolean goodEnough = true;
            
            //line of code that will check if the player has enough money.
            //line of code for the casino to match the bet the player placed.
            goodEnough = c1.checkBalance(bet);
            while(goodEnough != true)
            {
                System.out.println("Please place a bet within your funds");
                System.out.println("Therefore, you can do " +c1.getBalance()/5+" spins");
                System.out.println("You have funds of " + c1.getBalance());
                goodEnough = c1.checkBalance(input.nextDouble());
            }
            //the bet amount is negative to annotate that the moeny will be taken out of the account.
            c1.changeBalance(-bet);
            asdf.changeBalance(bet);
            
            for(int i=0; i<spins; i++){
                int chance = rand.nextInt(100)+1;
                if(chance <=70){
                    System.out.println("You've one 1 from the casino");
                    c1.changeBalance(1);
                    asdf.changeBalance(-1);
                }
                
                if(chance >70&&chance<=90){
                    System.out.println("You've one 5 from the casino");
                    c1.changeBalance(5);
                    asdf.changeBalance(-5);
                }
                
                if(chance >90&&chance<=99){
                    System.out.println("You've one 10 from the casino");
                    c1.changeBalance(10);
                    asdf.changeBalance(-10);
                }
                
                if(chance==100){
                    System.out.println("You've one 100 from the casino");
                    c1.changeBalance(100);
                    asdf.changeBalance(-100);
                }
            }
            
            System.out.println("Your new balance is " + c1.getBalance());
            System.out.println("the casino's new balance is "+asdf.getBalance());
        }//slots
    }//casino
   
}//public 
