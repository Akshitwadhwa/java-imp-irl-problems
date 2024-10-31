import java.util.Scanner;

public class resort {
    int rno;
    String name;
    int charges;
    int days;

    // then we have been given to compute the total bill of the person based upon the
    // time he stayed in the resort

    public double compute(){
        double amt;
        amt = charges * days;
        if(amt>=11000)
        amt =amt*1.02;
        return amt;
        }

        // given the 

        public void GetInfo(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your room no: "  );
            rno = sc.nextInt();
            System.out.println("enter the name of custome:");
            name = sc.next();
            System.out.println("print the charges of the room: ");
            charges = sc.nextInt();
            System.out.println("enter the no of days stayed in the hotel: ");
            days = sc.nextInt();

        }
        public void dispdata(){
            System.out.println("room no;"  + rno);
            System.out.println("customer name:" + name);
            System.out.println("charges of the room:" + charges);
            System.out.println("days stayed:" + days);
        }



        public static void main(String args[]) {
            resort resort1 = new resort();
            resort1.GetInfo();
            resort1.dispdata();

        }
    }

    
    

