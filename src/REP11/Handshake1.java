package REP11;
import java.util.*;

public class Handshake1 {

    public static int handshake(int n){
        if(n<=1){
            return 0;
        }
        if( n ==2){
            return 1;
        }
        return (n-1) + handshake(n-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total handshakes for " + n + " " +"people: " + handshake(n));
    }



}
