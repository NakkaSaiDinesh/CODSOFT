import java.util.*;
public class NumGame {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int attempts=0;
        int max_attempts =5;
        int Score=0;    
        while(attempts<max_attempts){
            System.out.print("enter a num: ");
            int a=sc.nextInt();
            attempts++;
            if(a==n){
                System.out.println("You are Correct");
                Score++;
            }else if(a<n){
                System.out.println("Your num is lower");
            }else if(a>n){
                System.out.println("your num is Higher");
            }
            //System.out.println("num of attempts : "+attempts);
            System.out.println("Your score is: "+Score+"/"+max_attempts);
            System.out.println("Try again\n");
        }
        System.out.println("And the random num is: "+n);
    }
}