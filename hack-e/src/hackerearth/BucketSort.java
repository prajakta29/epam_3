package hackerearth;

import java.util.*;

public class BucketSort {

       private static Scanner s;

	public static void main (String[] args) throws Exception {

       s = new Scanner(System.in);
       int n = s.nextInt();
       long b,mov=0;
      int [] a = new int[n];
      for(int i=0;i<n;i++) 
      a[i]=s.nextInt();
    for(int i=1;i<n;i++) 
   {
    if(a[i]<=a[i-1])
            {
            b=a[i-1]-a[i]+1;
            mov+=b;
            a[i]+=b;
            }
     }
    System.out.println(mov);
       }
}
