/**
 * Created by Юлия on 18.03.2017.
 */
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double sum = 0;
        double a;
        for (int i = 0; i < cnt; i++){
            a = sc.nextInt();
            sum = sum+a;
        }
        System.out.println(sum/cnt);
    }

}
