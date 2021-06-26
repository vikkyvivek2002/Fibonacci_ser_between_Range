import java.util.Scanner;

public class Fibonacci_ser_between_Range
 {

	public static void main(String[] args) {
Scanner s = new Scanner (System.in);
System.out.println("Enter a number :");
int  n =s.nextInt();
int sum = 0;
int a =0;
int b = 1;
	while(sum < n)
{
sum = a + b;
  if(sum%2== 0)
  {
	  System.out.println(sum);
  }
    a=b;
	b = sum;
	
}
	}

}
