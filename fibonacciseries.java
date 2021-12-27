package logicalprograms;
import java.util.Scanner;
public class fibonacciseries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of terms of the fibonacci series: ");
          int n = sc.nextInt();
          int a = 0;
          int b = 1;
          int c;
          System.out.println(a);
          System.out.println(b);
          for (int i=3 ; i<=n ; i++)
          {
              c = a + b;
              System.out.println(" value of c " + c);
              a = b;
              b = c;
          }
          sc.close();
      }
  }

	
