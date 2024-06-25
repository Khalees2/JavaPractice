package naaz;
import java.util.Scanner;
public class q3 {
    public static void main(String [] args){
        Scanner ip=new Scanner(System.in);
        int B=ip.nextInt();
        int H=ip.nextInt();
        int A=B*H;
        if(B<=0 || H<=0){
            System.out.println("Breadth and Height should be positive");
        }else{
            System.out.println(A);
        }

    }


}
