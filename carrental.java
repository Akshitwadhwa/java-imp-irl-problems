import java.util.*;
public class carrental {
    int carid;
    String cartype;
    float getrent;


// next part we have to define both the cartypes
//which are carid and cartype
// we will use the scanner to define it

public void getcar(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the car id:");
    carid = sc.nextInt();
    System.out.println("enter the car type: ");
    cartype = sc.nextLine();
    
}
// after this we will use the if statement to define the rent of the car
public int getrent(){
  if (cartype.equals("small"))
  rent = 1000;
  if (cartype.equals("van"))
  rent = 800;
  if (cartype.equals("suv"))

  return int rent;
  
}
}

 public void showcar(){
    System.out.println("carid:" + carid);
    System.out.println("cartype:" + cartype);
    System.out.println("rent:" +  getrent);
 }

class finalcarrental
{
   public static void main(String args[])
   {
     carrental ob = new carrental();  
     ob.getcar();
     ob.getrent();
     ob.showcar();
   }
  }
