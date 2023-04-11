import java.util.Scanner;
class Array
{
    int[] a;
    void readArray()
    {
        a=new int[5];
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<5;i++)
        {
            a[i]=se.nextInt();
        }
    }
        void printArray()
        {
            System.out.println("Array elemenrs are:");
        for(int i=0;i<5;i++)
        {
           System.out.println(a[i]); 
        }

        }
        public static void main(String[]args)
        { 
        Array se=new Array ();
        se.readArray();
        se.printArray();
        }
}

            
        