package Practice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public int fibonaaciNum(int n){
         if(n<1) return -1;
         if(n==1 || n==2) return n-1;
         return fibonaaciNum(n-1)+fibonaaciNum(n-2);
    }

    public List<Integer> fibonacciSeries(int n){
        if(n<1)
            return null;

        List<Integer> list = new ArrayList<>();
            list.add(0);
        if(n==1)
            return list;

        list.add(1);
        for(int i=2; i<n; i++){
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list;
    }

}
