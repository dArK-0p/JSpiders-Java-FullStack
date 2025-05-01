class First10NumSum
{
    public static void main(String [] args)
    {
        int sum = 0;
        // Using for loop.
        for(int i = 1; i <= 10; i++)
            sum += i; // */

        /* Using while loop.
        int i = 1;
        while(i <= 10)
            sum += i; */
        System.out.println(sum);
    }
}