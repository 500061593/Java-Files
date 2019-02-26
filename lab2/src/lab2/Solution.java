package lab2;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0;
        int c;
        for(int j=0;j<=n;j++){
            c=(a+(((int)Math.pow(2, n))*b));
            s=s+c;
            System.out.print(s+" ");
        }
        
        

        }
        System.out.println("hello");
    }
}
