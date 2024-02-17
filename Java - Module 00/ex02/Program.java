import java.util.Scanner;

public class Program {
    public static int   numSum(int number) {
        int ret = 0;

        while (number > 9) {
            ret += number % 10;
            number /= 10;
        }
        ret += number;
        return ret;
    }

    public static boolean   isPrime(int number) {
        int sum = numSum(number);

        for (int i = 2; i * i <= sum ; i++)
            if (sum % i == 0)
                return false;
        return true;
    }

    public static void  main(String[] args) {
        int number;
        int counter = 0;
    
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number == 42)
                break;
            if (isPrime(number))
                counter++;
        }
        sc.close();
        System.out.println("Count of coffee-request : " + counter);
    }
}