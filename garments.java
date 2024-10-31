import java.util.Scanner;

public class garments {
    String gcode;
    String gtype;
    int gsize;
    String gfabric;
    Float gprice;

    // after that we have to assign a constructor value//
    
    garments()
    {
        gcode = "not allowed";
        gtype = "not allowed";
        gfabric = "not allowed";
        gsize = 0;
        gprice = 0;
    }

    public void assignprice(){
        if(gfabric.equals("cotton"))
        {
            if(gtype.equals("trouser"));
            gprice = 1300;
            if(gtype.equals("shirt"));
            gprice = 1100;
        }
        else
        { if(gtype.equals("trouser"));
        gprice = 1170;
        if(gtype.equal("shirt"));
        gprice = 990;
        }


        }
        public void Input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the garmer code:");
            gcode = sc.next();
            System.out.println("enter the type of the garment:");
            gtype = sc.next();
            System.out.println("enter the type of the farbic:");
            gfabric = sc.next();
            assignprice();
        }
    
    public void inputvalues()
    {
        System.out.println("gcode:" + gcode);
        System.out.println("gtype:" + gtype);
        System.out.println("gsize:" + gsize);
        System.out.println("gfabric:" + gfabric);
        assigncloth();
    }

}

 class garmentsoutput
 {
    public static void main(String[] args[]) {
        garments gar = new garments();
        gar.inputvalues();
        gar.input();
        
    }
 }

    












    



    

