import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        // when we have the function int we use the nextlin in the scanner class;

        if(numpalindrome(number)){
            System.out.println("the number is palindrom");

        }else{
            System.out.println("the number is not palindrome");

        }
        scanner.close();
        
    }

    public static boolean numpalindrome(int num){
        int orginalnum =  num;
        int reversednum = 0;

        while (num > 0) {
            int lastDigit = num % 10;                
            reversednum = reversednum * 10 + lastDigit; 
            num /= 10;                               
        }
        
        return orginalnum == reversednum;
    }
}
