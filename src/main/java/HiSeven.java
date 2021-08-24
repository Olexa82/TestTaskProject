import java.util.Scanner;

/**
 * @author Alex on 23.08.2021
 * trifonov_oleksii_mysmallproject
 */
public class HiSeven {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int num = value.nextInt();
        String hello = "Привет";
        String exception = "Число равно или меньше 7";
        if ( num > 7 )
            System.out.println(hello);
        else
            System.out.println(exception);

    }
}
