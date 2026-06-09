package REP11;
import java.util.*;

public class Handshake3 {

    public static int handshake(int n){
        if(n<2){
            System.out.println("The number of people should be 2 or more.");
            return 0;
        }
        if(n==2){
            return 1;
        }
        return (n-1) + handshake(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again = "yes";
        while(again.equalsIgnoreCase("yes")){
            System.out.print("Enter the number of people in the room : ");
            int n = sc.nextInt();
            int result = handshake(n);
            if(n>=2){
                System.out.println("Total handshakes for " + n + " " + "people: " + handshake(n));
            }
            System.out.print("Do you want to continue? (yes or no) :");
            again = sc.next();
        }

        System.out.println("Thank you for playing!");
    }
}
