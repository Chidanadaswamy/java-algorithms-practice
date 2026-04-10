package demo;
import java.util.Scanner;

public class NPalindrome {
	public static boolean isPalindrome(int n) {
		int rev=0;
		int copy =n;
		while(n!=0) {
			rev = rev*10+n%10;
			n /=10;
			
		}
		return rev==copy;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr n value");
		int n =s.nextInt();
		int Pcount = 0,i=1;
		while(Pcount<n)
		{
			if(isPalindrome(i)) {
				Pcount++;
			}
			if(Pcount==n) {
				System.out.println(i+" ");
			}
			i++;			
		}
	}

}
