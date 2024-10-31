import java.util.Scanner;
public class classtour {
    String tcode;
    int noofadults;// No of adults
    int noofkids; // not of kids
    int kilometers;
    Float totalfare;

    classtour()
    {
        tcode = "null";
        noofadults =0;
        noofkids=0;
        kilometers = 0;
        totalfare = 0.f;
    }

    public void assignfare(){

        if(kilometers>=1000)
        {
            totalfare = noofadults*500 + noofkids*250;
        
        }
        if(kilometers>=500 && kilometers<1000)
        {
            totalfare = noofadults*300 + noofkids*150;
        }
        if(kilometers <500)
        {
            totalfare = noofadults*200 + noofkids*100;
        }

    }

    public void entertour()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the tcode:");
        tcode = sc.nextLine();
        System.out.println("enter the no of adults:");
        noofadults = sc.nextInt();
        System.out.println("not of kids:");
        noofkids = sc.nextInt();
        System.out.println("enter the no of kilometers:");
        kilometers = sc.nextInt();
        assignfare();
    
    }
    
    public void showtour()
    {
        System.out.println("travel code:" + tcode);
        System.out.println("no of adults:" + noofadults);
        System.out.println("no of kids:" + noofkids);
        System.out.println("no of kilometer:" + kilometers);
        System.out.println("total fare:" + totalfare);


    }
}

class travel
{
    public static void main(String[] args[]) {
        classtour tour1 = new classtour();
        tour1.entertour();
        tour1.showtour();

        
    }
}

   



  

