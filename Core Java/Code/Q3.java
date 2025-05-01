import java.util.Scanner;
/*
 * 11
 * 21 22
 * 31 32 33
 * 41 42 43 44
 * 51 52 53 54 55
 * 44 43 42 41
 * 33 32 31
 * 22 21
 * 11
 * 
 * 32 42 43 52 53 54 43 42 32 --> (i != j) , (i != 1) , (j != 1) , (j != 5)
 * 
 * 12345x
 * 1234x x
 * 123x x x
 * 12x x x x
 * 1x x x x x
 * 12x x x x
 * 123x x x
 * 1234x x
 * 12345x
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int il;

        System.out.print("Enter no. of rows: ");
        il = sc.nextInt();

        for (int i = 1; i <= il; i++) {
            for (int sp = il; sp >= i; sp--)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if ((i != j) && (i != 1) && (j != 1) && (j != il))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = il-1; i >= 1; i--) {
            for (int sp = i; sp <= il; sp++)
                System.out.print(" ");

            for (int j = i; j >= 1; j--) {
                if ((i != j) && (i != 1) && (j != 1) && (j != il - 1))
                    System.out.print("  ");
                else
                    System.out.print("* ");

            }
            System.out.println();
        }
        
        sc.close();
    }
}
