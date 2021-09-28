import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main2 {

    public static void Even(){

        Scanner input = new Scanner(System.in);
        System.out.println("Name any number I will determine whether it is odd or even");
        int userNum = input.nextInt();

        if (userNum == 0){
            System.out.println("you picked 0?");
        }
        else if ((userNum%2) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }
}
