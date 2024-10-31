import java.util.Scanner;
public class candidate {
    int rollno;
    String name;
    float score;
    String remarks;



public void assignrem()
{
    if(score>=50){
        remarks = "selected";  
    }
    else{
        remarks = "not selected";
    }
}

public void enter()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the roll no:");
    rollno = sc.nextInt();
    System.out.println("enter the name:");
    name = sc.nextLine();
    System.out.println("enter the score:");
    score = sc.nextFloat();
    System.out.println("enter the remarks:");
    remarks = sc.nextLine();
    
}
public void display()
{
    System.out.println("roll no:" + rollno);
    System.out.println("name:" + name);
    System.out.println("score:" + score);
    System.out.println("remarks:" + remarks);


}

public class main {
    public static void main(String[] args) {
        candidate cad = new candidate();
        cad.enter();
        cad.display();
    }
}

}






