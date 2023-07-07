// fibbonacci series = 0 1 1  2 3 5 8 13........
// unique problem  parallel recursion is used.

// simulatanous recursion is used 

public class printfibboncii {
    public static int print_fib(int n){
int fib_n = 0;
if(fib_n == 1 ){
    
    return 1;
}

if(fib_n == 0 ){
    
    return 1;
}

int fib_nm1 = print_fib(n-1);
int fib_nm2  = print_fib(n-2);
  fib_n = fib_nm1 + fib_nm2;

        return fib_n;

    }
    public static void main(String args []){
        
        System.out.print(print_fib(5));
    }
}
