/*
 * 00 01 02 03 04
 * 10 11 12 13 14
 * 20 21 22 23 24
 * 30 31 32 33 34
 * 40 41 42 43 44
 */
public class PatternStar {

    /* 
     *  * * * * * 
     *  * * * * * 
     *  * * * * * 
     *  * * * * * 
     *  * * * * * 
    */
    public void Pattern1(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * 1 1 1 1 1 
     * 0 0 0 0 0
     * 1 1 1 1 1
     * 0 0 0 0 0 
     * 1 1 1 1 1
     */
    public void Pattern2(int m, int n) {
        char ch;
        for (int i = 0; i < m; i++) {
            ch = (i % 2 == 0) ? '1' : '0';
            for (int j = 0; j < n; j++) {
                
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1 2 3 4 5
     * 6 7 8 9 10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     */
    public void Pattern3(int m, int n) {
        int c = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1 2 3 4 5 
     * 1 2 3 4 5 
     * 1 2 3 4 5 
     * 1 2 3 4 5 
     * 1 2 3 4 5 
     */
    public void Pattern4(int m, int n) {
        int c;
        for (int i = 0; i < m; i++) {
            c = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1 1 1 1 1
     * 2 2 2 2 2
     * 3 3 3 3 3
     * 4 4 4 4 4
     * 5 5 5 5 5
     */
    public void Pattern5(int m, int n) {
        int c = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }

    /*
     * a b c d e 
     * f g h i j 
     * k l m n o 
     * p q r s t 
     * u v w x y
     */
    public void Pattern6(int m, int n) {
        char ch = 'a';
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternStar ob = new PatternStar();
        int r = 5, c = 5;

        System.out.print("Enter r: ");
        // r = ;

        ob.Pattern3(r, c);
    }
}
