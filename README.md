# cis-project

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
