public class Fibonacci {
    public int calc(int n){
        if(n < 2){
            return n;
        }else{
            return calc(n-1) + calc(n-2);
        }
    }
}
