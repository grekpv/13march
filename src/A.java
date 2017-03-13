/**
 * Created by grekpv.18 on 13.03.2017.
 */
import java.util.Scanner;
public class A {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i < 5; i++){
            b = b*a;
            System.out.println(b);
        }
    }
}
