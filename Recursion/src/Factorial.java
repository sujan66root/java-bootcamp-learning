public class Factorial {
    public int calc(int n) {
        if (n < 2 ){
            return n;
        }else{
           return n * calc(n-1);
        }
    }
}
