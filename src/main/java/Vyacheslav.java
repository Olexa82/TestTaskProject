import java.util.Scanner;

/**
 * @author Alex on 23.08.2021
 * trifonov_oleksii_mysmallproject
 */
public class Vyacheslav {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String name = value.next().trim();
        String positiveAnswer = "Привет, ";
        String negativeAnswer = "Нет такого имени";
        if (name.equals("Вячеслав")){
            System.out.println(positiveAnswer + name);}
        else {System.out.println(negativeAnswer);}
    }
}
