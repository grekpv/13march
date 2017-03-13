/**
 * Created by grekpv.18 on 13.03.2017.
 */
import java.util.Scanner;
public class B {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i < a; i++){
            for (int j = 1; j < a; j++){
                if (i%j == 0 && i != j)
                    cnt++;
            }
            if (cnt == 0)
            System.out.println(i);
        }
        
    }
}
