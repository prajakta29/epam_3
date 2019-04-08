package hackerearth;
import java.util.Scanner;

public class Rod_Cuts {

  private static Scanner s1;

public static void main(String args[]) {
			
	  int q;
			
			long n,total=0;
			
	   	s1 = new Scanner(System.in);
			q = s1.nextInt();
			for(int i=0;i<q;i++)
			{
				total=0;
				n = s1.nextLong();
				if(n==1)
				{
					total=0;
				}
				else
				{
					n=n+1;
					long temp=n;
					while(temp!=0)
					{
						temp=temp/2;
						total++;
					}
					total=total-2;
				}
				System.out.println(total);
			}
			
		}
	}

