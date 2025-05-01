import java.util.Scanner;
public class AlternatePrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, h, count;
        boolean flag = true;

        System.out.print("Enter l: ");
        l = sc.nextInt();
        System.out.print("Enter h: ");
        h = sc.nextInt();

        for(int i = l; i <= h; i++) {
            if((i == 1) || (i != 2 && i % 2 == 0) || (i != 3 && i % 3 == 0))
                continue;

            count = 0;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 0) {
                if(flag)
                    System.out.print(i + " ");
                
                flag = !flag;
            }
        }
        sc.close();
    }
}
