import java.util.Scanner;
public class Highest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,c=0,a[],n,t;
		a = new int[100];
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		j=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i+1]>a[i])
			{
				j=a[i+1];
				
			}
			
		}
			System.out.print(j);
		

	}

}
