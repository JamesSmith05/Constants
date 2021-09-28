import java.util.Scanner;

public class Main3 {


    public static void five() {

        Scanner input = new Scanner(System.in);
        int[] UserNumbers = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            System.out.println("Pick a number");
            int TempNum = input.nextInt();
            UserNumbers[i] = TempNum;
        }
        Float x = 0f;
        for (int a = 0; a < 5; a++){
            x = x + UserNumbers[a];

        }
        System.out.println("the mean is "+ (x/5));






    }
}
