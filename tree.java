public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        
        int rows = 9, k = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 - i+2; j++) {
                System.out.print(" ");
            }

            for (int m = 0; m < (i); m++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
