import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Input Integer ");
       long input1 = sc.nextLong();

       int sum = 0;
       while (input1 > 0) {
           sum += input1 % 10;
           input1 /= 10;
       }

       System.out.println(sum);
    }
}
