import java.util.Scanner;
class Twodarray
{
int [][]arr;

void read()
{
  arr = new int[2][2];
  Scanner r= new Scanner(System.in);
  System.out.println("Enter the elements into the  Array : ");
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
     arr[i][j]=r.nextInt();
   }
   System.out.println();
  }
}
void print()
{
 System.out.println("Array Elements are : ");
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
   System.out.print(arr[i][j] + "\t");
  }
  System.out.println();
 }
} 

public static void main(String args[])
{
	Twodarray obj=new Twodarray();
	obj.read();
	obj.print();
}
}
 
