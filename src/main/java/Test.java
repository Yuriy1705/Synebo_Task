import com.Task_1;
import com.Task_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your positive number");
        int n = input(sc);
//        Task_1 matches = new Task_1(n);
//        System.out.println("Answer is " + matches.findAnswer());

        Task_2 fac=new Task_2(n);

        while (fac.findNumber()==0){
            n=input(sc);
            fac.setFactorial(n);

        }
            System.out.println("Number is "+ fac.findNumber());



    }

    private static int input(Scanner sc) {


        String str = sc.nextLine();
        while (!isNumber(str)) {
            System.err.println("Wrong number!!!! Please, enter positive number");
            str = sc.nextLine();
        }
        int n = Integer.parseInt(str);
        return n;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
