import java.util.*;
class Prickrr 
{ 
    public Scanner sc = new Scanner(System.in);

   public ArrayList<String> A1=new ArrayList<String>();
   public HashMap<String,Integer> H1=new HashMap<String,Integer>(); 

   void InsertCity(String s1)
   {
       if(A1.contains(s1))
       {
         System.out.println("Record Already Present In our Database");

       }
       else
       {
          A1.add(s1);
          System.out.println("SuccessFully Completed your request");

          
       }
   }
   
   void RemoveCity(String s1)
   {
       if(A1.contains(s1))
       {
           A1.remove(s1);
           System.out.println("SuccessFully Completed your request");
           System.out.println();
       }
       else
       {
          System.out.println("Sorry Your Request Cannot be Completed As the City which want to delete is Already Not present in Our DataBase");
          System.out.println();

       }
       
   }
   void addDistance()
   {
       System.out.println("Enter the city for which you want to add Distance");
       String city=sc.next();
       System.out.println("Enter Distance");
       int n=sc.nextInt();
       
       if(H1.containsKey(city))
       {
           
           H1.replace(city,n);
       }
       else
       {
           H1.put(city,n);
       }
   }
   
     void Booking()
    {
        System.out.println("Please Enter The City Where You want Your item to be dispatched");
        String s2=sc.next();
        if(H1.containsKey(s2))
        {
            if(H1.get(s2)>0)
            {
                
                System.out.println("Please Enter Your First Name");
                String firstname=sc.next();
                System.out.println("Please Enter Your Last Name");
                String lastname=sc.next();
                System.out.println("Please Enter Your Mobile Number");
                long mobileno=sc.nextLong();
                System.out.println("Please Enter Your Address ");

                String Address=sc.next();
                
                String Id=Character.toString(firstname.charAt(0))+Character.toString(firstname.charAt(1));
                Id=Id+lastname.charAt(lastname.length()-1);
                Id=Id+String.valueOf(mobileno);
                
                
                
                
                
                
                System.out.println("Thankyou, Booking Confirmed");
                System.out.println("Do You want to Generate A booking label");
                System.out.println("1-) Yes");
                System.out.println("2-) No");
                int asq=sc.nextInt();
                if(asq==1)
                {
                System.out.println("Here is Your live Booking Label on Successfull Confirmation of Your Booking");
                System.out.println("Dont forget collect your booking Receipts");
                System.out.println("The item will be shipped in 4-6 Bussiness Days");
                System.out.println("Use This ID for future references like Tracking live Details of your order");
                }
                System.out.println("Do You want to Generate A receipt of Your Booking");
                System.out.println("1-) Yes");
                System.out.println("2-) No");
                int asp=sc.nextInt();
                if(asp==1)
                {
                    GenerateReceipt();
                    System.out.println("First Name:"+firstname);
                    System.out.println("Last Name:"+lastname);
                    System.out.println("MobileNo:"+mobileno);
                    System.out.println("Unique Id:"+Id);
                    System.out.println("Address"+Address);
                }

                


                
                
                H1.replace(s2,H1.get(s2)-1);
            }
           
        }
         else
            {
                System.out.println("Sorry we are unable to provide you the booking facility at this moment");
                System.out.println();

            }
        
    }
    void AvailableCities()
    {
        if(A1.isEmpty())
        {
            System.out.println("The Services is Not Available At Present Situation");
        }
        System.out.println("The Facility of Prickrr Courier Services Includes The following Cities");
        for(int i=0;i<A1.size();i++)
        {
            System.out.println(A1.get(i));
            
            
        }
        System.out.println();
    }
    
    void GenerateReceipt()
    {
                System.out.println();

                System.out.println();

        System.out.println();
        System.out.println("Pickrr Receipts");
        System.out.println("Thankyou For Using Pickrr Services");
        System.out.println();
       
                

        
        
    }
    
    void DeliveryFareCalculator()
    {
        System.out.println("Enter The city Whose Fare You want to check");
        String Fare_city=sc.next();
        if(H1.containsKey(Fare_city))
        {
            int distance=H1.get(Fare_city);
            int Distanceperkm=12;
            int Totalfare= distance*Distanceperkm;
            System.out.println("The Estimated Delivery Charges for Your location will Be "+Totalfare);
            
        }
    }
}
class test
{
        static Scanner sc =new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Welcome to the Pickrr Courier Services");
        System.out.println("**************************************");

        Prickrr adm=new Prickrr();
        int count=1;

        while(true)
        {
                System.out.println();  
                 System.out.println("1-) Press 1 to continue");
                 System.out.println("2-) Press 2 to exit");

            
            

            int ansss=sc.nextInt();
            if(ansss==1)
            {
             System.out.println();  

        System.out.println("Please Choose any one of the option Given Below");
        System.out.println("1-) Admin Login");
        System.out.println("2-) Customer Login");
        System.out.println("3-) Available Cities to which we Provide Services");
        System.out.println("4-) Calculate Estimated Delivery Charges");
        System.out.println("5-) Exit");
        System.out.println();
        int ans=sc.nextInt();
        
        
            
        
        switch(ans)
        {
            case 1:
                System.out.println();  
                System.out.println("1-)To Insert a City to Database");
                System.out.println("2-)To Delete a City from Database");
                System.out.println("3-)To Initialise distance of particular city into Database");
                int ch=sc.nextInt();
                if(ch==1)
                {   
                    System.out.println();  
                    System.out.println("Enter the city to be added");
                    String city1=sc.next();
                    adm.InsertCity(city1);
                }
                else if(ch==2)
                {
                    System.out.println();  
                    System.out.println("Enter the city to be deleted");
                    String city2=sc.next();
                    adm.RemoveCity(city2);
                }
                else if(ch==3)
                {
                    adm.addDistance();
                }
                break;
            
            case 2:
                System.out.println();  

                 System.out.println("Enter details for booking");
                 adm.Booking();
                 break;
                 
            
            case 3:
                System.out.println();
                adm.AvailableCities();
                break;
                
            case 4:
                System.out.println();
                adm.DeliveryFareCalculator();
                break;
                
            case 5:
                break;
        }
            }
        else
        {
            System.out.println();  

            System.out.println("Thankyou for using our services, Will be Happy to serve you again");
            System.out.println();
            break;
        }
                
        }
        }
       
        
        
        
        
        

    
    
}