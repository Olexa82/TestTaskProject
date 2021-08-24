import java.util.Scanner;

/**
 * @author Alex on 23.08.2021
 * trifonov_oleksii_mysmallproject
 */
public class ArrayMultipleOf3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int num = value.nextInt();
        for (int i = 0 ; i < num; i++) {
            if(i%3 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
