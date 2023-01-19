public class Holiday
{
    String name;
    int day;
    String month;

    public Holiday()
    {
       name="My Birth Day";
       day=26;
       month="July";
    }  

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day= day;
        this.month= month;   
    }

    public void display()
    {
       System.out.println("Name:"+name+" Day:"+day+" Month:"+month);
    }
    public static void main(String[] args)
     {
         System.out.println(" My Birth Day,26,July");
         Holiday h= new Holiday();
     }
}