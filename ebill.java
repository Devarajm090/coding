class ebill   
{   
    
    public static void main(String args[])   
    {     
      
        int units = 300;    
        double billToPay = 10;    
        if(units <= 100)  
        {  
            billToPay = units * 10;  
        }    
        else if(units < 300){  
            billToPay = 100 * 10 + (units - 100) * 15;  
        }  
        else if(units > 300)  
        {  
            billToPay = 100 * 10 + 200 * 15 + (units - 300) * 20;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    }   
}  