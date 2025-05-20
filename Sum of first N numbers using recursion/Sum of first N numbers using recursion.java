import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            System.out.println(obj.NnumbersSum(n));
            System.out.println("~");
        }
    }
}

class Solution {

    public int NnumbersSum(int n) {

        if(n==0) return 0;

        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum += i;
        }

        return sum;
    }
}
