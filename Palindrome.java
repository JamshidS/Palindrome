import java.util.*;
public class Palindrome{
     public static void main(String[] args) {
        System.out.println("It will check the number is Palindrome or Not!. ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scan.nextInt();
        int num = n;
        int reverse = 0,r;
        while(n>0){
            r = n%10;
            reverse = reverse*10+r;
            n /=10;
        }
        

        if(num==reverse){
            System.out.print("The entered number is Palindrome.");
        }else{
            System.out.println("The  entered number is not Palindrome.");
        }


    }
}