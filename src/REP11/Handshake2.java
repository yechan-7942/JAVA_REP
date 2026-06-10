package REP11;
import java.util.*;

public class Handshake2 {

    public static int handshake(int n){
        if(n<2){
            System.out.println("The number of people should be 2 or more.");
            return 0;
        }
        if(n==2){
            return 1;
        }
        System.out.println("Calculating handshake for "+n+" people...");
        return (n-1) + handshake(n-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        System.out.println("Total handshakes for " + n + " " +"people: " + handshake(n));
    }



}
