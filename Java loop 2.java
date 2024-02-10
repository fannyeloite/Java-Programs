import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        double g=2;
        int c=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
            sum+=a;
            for(int j=0;j<n;j++)
            {
                c=(int)Math.pow(2,j)*b;
                sum=sum+c;
                System.out.print(sum+" "); 
            }
           System.out.println();
            
        }
        in.close();
    }
}