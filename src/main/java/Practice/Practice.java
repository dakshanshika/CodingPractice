package Practice;

public class Practice {

   //Write a Java program for counting the digits present in a number.
    public int countDigits(int n){

    if(n==0) return 1;
    int count =0;
    int i = n;
    while(i>0){
        i=i/10;
        count++;
    }
    return count;
    }
    public int countUniqueDigits(int n){
        boolean[] numArr = new boolean[10];
        while(n/10>0){
            
        }
        return  -1;
    }
}

