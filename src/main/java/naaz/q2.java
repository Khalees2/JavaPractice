package naaz;
import java.util.Scanner;
public class q2 {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter N value");
        int N=in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(N + "X" + i+ "=" + (N*i));
        }
    }

}
