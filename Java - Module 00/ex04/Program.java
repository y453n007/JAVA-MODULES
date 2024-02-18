import java.util.Scanner;

public class Program {

    public static void  printStatistics(int[][] stat) {
        int holder;
        int tmp = 10;

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j < 10; j++) {
                holder = ((stat[j][0] * 10) / stat[0][0]);
                if (i == 11)
                    System.out.print("  " + (char)stat[j][1] + "  ");
                else if (holder - tmp == 0)
                    System.out.print("  " + stat[j][0] + " ");
                else if (holder - tmp > 0)
                    System.out.print("  #  ");
                else
                    break;
            }
            System.out.print("\n");
            tmp--;
        }
    }
    public static void  sortTab(int[][] intTab) {
        int[][] temp = new int [1][2];

        for (int i = 0; i < intTab.length; i++) {
            for (int j = 1; j < (intTab.length - i); j++) {
                if (intTab[j - 1][0] < intTab[j][0]) {
                    temp[0] = intTab[j - 1];
                    intTab[j - 1] = intTab[j];
                    intTab[j] = temp[0];
                }
            }
        }
        printStatistics(intTab);
    }

    public static void  main (String[] args) {
        int[][] countCharTab = new int[65535][2];
        char[] charTab;

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        charTab = input.toCharArray();
        sc.close();
        for (char c : charTab) {
            if (countCharTab[c][0] == 0) {
                countCharTab[c][1] = c;
            }
            countCharTab[c][0]++;
        }
        sortTab(countCharTab);
    }
}