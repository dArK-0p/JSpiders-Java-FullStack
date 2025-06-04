import java.util.Scanner;

public class Q3v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int il;
        boolean flag = false;
        
        System.out.print("Enter il: ");
        il = sc.nextInt();

        do { // Runs exactly 2 times because of flag.
            int i;
            
            if(flag) i = il - 1; // second time : flag = true.
            else i = 1; // first time : flag = false.
            
            while( (flag ? i >= 1 : i <= il) ) {
                int sp, j;
                
                if(flag) { // second time : flag = true.
                    sp = i;
                    j = i;
                }
                else { // first time : flag = false.
                    sp = il;
                    j = 1;
                }
                
                while ( flag ? sp <= il : sp >= i ) {
                    // first time : flag = false : (sp >= i).
                    // second time : flag = true : (sp <= il).
                    System.out.print(" ");
                    sp = flag ? sp + 1 : sp - 1;
                }
    
                while (flag ? j >= 1 : j <= i) {
                    // first time : flag = false : (j <= i).
                    // second time : flag = true : (j >= 1).
                    if ((i != j) && (i != 1) && (j != 1) && (j != il))
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                        
                    j = flag ? j - 1 : j + 1;
                    // first time : flag = false : (j++).
                    // second time : flag = true : (j--).
                }
                System.out.println();
                
                i = flag ? i - 1 : i + 1;
                // first time : flag = false : (i++).
                // second time : flag = true : (i--).
            }
            
            flag = !flag; // flag = {false : true : false}
        } while(flag); // flag = {false : true : false}

        sc.close();
    }
}