import java.util.Scanner;

public class Q3v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int il;
        boolean flag = false;
        
        System.out.print("Enter il: ");
        il = sc.nextInt();

        do {
            int i;
            
            if(flag) i = il - 1;
            else i = 1;
            
            while( (flag ? i >= 1 : i <= il) ) {
                int sp, j;
                
                if(flag) {
                    sp = i;
                    j = i;
                }
                else {
                    sp = il;
                    j = 1;
                }
                
                while ( flag ? sp <= il : sp >= i ) {
                    System.out.print(" ");
                    sp = flag ? sp + 1 : sp - 1;
                }
    
                while (flag ? j >= 1 : j <= i) {
                    if ((i != j) && (i != 1) && (j != 1) && (j != il))
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                        
                    j = flag ? j - 1 : j + 1;
                }
                System.out.println();
                
                i = flag ? i - 1 : i + 1;
            }
            
            flag = !flag;
        } while(flag);
    }
}