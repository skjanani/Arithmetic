package janani;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=1,d=1;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		int sum=(n*(2*a+(n-1)*d))/2;
		System.out.print(sum);
	}

}
