import java.util.Scanner;
public class AlternateEvenInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, h;
        boolean flag = true;

        System.out.print("Enter l: ");
        l = sc.nextInt();
        System.out.print("Enter h: ");
        h = sc.nextInt();

        for (int i = l; i <= h; i++) {
            if(i % 2 == 0){
                if(flag) {
                    System.out.print(i + " ");
                }

                flag = !flag;
            }
        }

        sc.close();
    }
}
