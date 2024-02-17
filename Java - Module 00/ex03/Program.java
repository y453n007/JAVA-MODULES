import java.util.Scanner;

public class Program {

    public static void  errStatus() {
        System.err.print("IllegalArgument\n");
        System.exit(-1);
    }

    public static long  revLong(long num) {
        long ret = 0;

        while (num > 0) {
            ret += num % 10;
            ret *= 10;
            num /= 10;
        }
        return ret;
    }

    public static void  main(String[] args) {
        String  input;
        int     counter = 1;
        int     minimal, num;
        int     index;
        long    allMinimals = 0L;

        Scanner sc = new Scanner(System.in);
        while (counter < 19) {
             input = sc.next();
             if (input.equals("42"))
                 break;
             else if (input.equals("Week")) {
                 num = sc.nextInt();
                 if (num == counter) {
                     index = 0;
                     minimal = 9;
                     while (index < 5) {
                         num = sc.nextInt();
                         if (minimal > num)
                             minimal = num;
                         index++;
                     }
                     allMinimals += minimal;
                     allMinimals *= 10;
                     counter++;
                 } else
                     errStatus();
             } else
                errStatus();
        }
        sc.close();
        allMinimals = revLong(allMinimals);
        allMinimals /= 10;
        index = 1;
        while (allMinimals > 0) {
            System.out.print("Week " + index++ + " ");
            for (int i = 0; i < allMinimals % 10; i++)
                System.out.print('=');
            allMinimals /= 10;
            System.out.println(">");
        }
    }
}
