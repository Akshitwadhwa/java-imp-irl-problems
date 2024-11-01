import java.util.*;
public class supply {
    int code;
    String foodname;
    String sticker;
    String foodtype;


    public void gettype() {
        if(sticker.equals("green"))
        foodname = "Vegetarian";
        if(sticker.equals("yellow"))
        foodname = "contains egg";
        if(sticker.equals("yellow"))
        foodname = "non vergetarian";
// we have used scanner class to demonstrate the values which needs to be entered

public void foodin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the code of the food:");
    int code = sc.nextInt();  // Assuming 'code' is an integer
    sc.nextLine();  // Consume the leftover newline

    System.out.println("Enter the name of the food:");
    String foodname = sc.nextLine();

    System.out.println("Enter the color of the sticker:");
    String sticker = sc.nextLine();

    gettype();  // Assuming 'gettype()' is defined elsewhere
    sc.close();
}
// now we will use the fucntion to let the user see the values he needs to enter
    public void foodout(){
        System.out.println("food code:" + code);
        System.out.println("name of food:" + foodname);
        System.out.println("sticker color:" + sticker);
        System.out.println("enter the type of food:" + foodtype);
    }

    }
     
    class foodsuply
    {
        public static void main(String[] args) {
            supply sup = new supply();
            sup.foodin();
            sup.foodout();
        }

    }

