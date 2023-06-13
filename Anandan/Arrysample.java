import java.util.Scanner;
class Arrysample

{
int [] a;
void ReadArray()
{
a = new int[5];
Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements");
for(int i=0;i<5;i++)

{ a[i] = sc.nextInt();

}
}

void PrintArray()
{

System.out.println("Array elements are:");

for(int i:a)
System.out.println(i);

}

public static void main(String[] args)

{
Arrysample obj = new Arrysample();

obj.ReadArray();

obj.PrintArray();

}

}