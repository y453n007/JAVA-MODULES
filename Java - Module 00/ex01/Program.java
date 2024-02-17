import java.util.Scanner;

public class Program {
    public static void  main(String[] args) {
        int counter = 1;
        int input;

        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        sc.close();
        if (input < 2 ) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        for (int i = 2; i * i <= input ; i++) {
            if (input % i == 0) {
                System.out.println("false " + counter);
                System.exit(0);
            }
            counter++;
        }
        System.out.println("true " + counter);
    }
}