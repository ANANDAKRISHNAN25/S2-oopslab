import java.util.Scanner;

class Employee1 {
 int eNo;
 String eName="";
 float eSalary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Employee No :: ");
  eNo = in.nextInt();
  System.out.print("Enter the Employee name :: ");
  eName = in.next();
  System.out.print("Enter the salary :: ");
  eSalary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee No = " + eNo);
  System.out.println("Employee name = " + eName);
  System.out.println("Employee salary = " + eSalary);
 }
}

public class Employee{ 
public static void main(String[] args) {
  
  System.out.println("Enter the no. of employees");
Scanner sc = new Scanner(System.in);   
int n=sc.nextInt();
  Employee1 e[] = new Employee1[n];
        for (int i = 0; i < n; i++) {
        	e[i] = new Employee1();
	
  	e[i].getInput();
    }
  System.out.println("********************************");
    System.out.println("**** Data Entered as below ****");
  
    for(int i=0; i<n; i++) {
   
   	e[i].display();
    }
 }
}