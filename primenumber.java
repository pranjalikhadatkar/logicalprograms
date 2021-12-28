package logicalprograms;
import java.util.Scanner;

public class primenumber {
	
public static void main(String[] args) {
		int isPrime=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
	     //sc.close();
		for(int i=2;i<=num/2;i++)
		{
	          if(num%i==0)
	          {
	        	  isPrime=0;
	        	  break;
	          }
		   
	   }
		if(isPrime==1)
			   System.out.println(num + " is a Prime Number");
		else
			   System.out.println(num + " is not a Prime Number");
	}
}