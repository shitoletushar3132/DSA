import java.lang.Math;
class function {
    public void mute() {
        System.out.println("MUTE ");
    }

    public int add(int a, int b) {
        System.out.print("add  : ");
        return (a + b);
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }

    public static Boolean prime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return(false); 
            }
        }

        return true;
    }

     
    public static void allprime(int n){
        for(int i=1 ; i<=n ; i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    } 

    public static void b_to_d(int bnum) {
        double decimal = 0;
        int i = 0;
        while(bnum > 0){
            int last = bnum % 10;
            bnum = bnum / 10;
            decimal = decimal + (last * Math.pow(2, i));
            i++;
        }
        System.out.println(decimal);
    }
    

    public static void D_TO_B(int n){
        
    }


    public static void main(String [] args){
        function f = new function();
        // f.mute();
        // System.out.println(f.add(2,5));

        // System.out.println(factorial(4));

        // prime(4);

        // allprime(5);

        b_to_d(101);

    }
}

