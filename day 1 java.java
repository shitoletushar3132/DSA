import java.util.Scanner;

public class first {
    // public static void main(String [] args)
    // {
    //     System.out.println("****");
    //     System.out.println("***");
    //     System.out.println("**");
    //     System.out.println("*");
    // }

    // public static void main(String [] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int s = sc.nextInt(); 
    //     String s1 = sc.next(); // or sc.nextLine()
    //     System.out.println("s = " + s);
    //     System.out.println("s1 = " + s1);
          //all line input
        // System.out.println(s);
    // }
    // public static void main(String [] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     // int s = sc.nextInt(); 
    //     // int s1 = sc.nextInt();

    //     // System.out.println(s/s1);

    //     float r = sc.nextFloat();
    //     float ar = 3.14f * r *r;

    //     System.out.println(ar);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     // int a = 15;
    //     // float b = a;
    //     // System.out.println(b);
        
    //     long b =33232322;
    //     float a = b;
    //     System.out.println(a);

    // }

    // public static void main(String[] args) {
    //     int a = 11;
    //     int b =31;
         
    //     // if(a>b)
    //     // {
    //     //     System.out.println(a);
    //     // }
    //     // else
    //     // {
    //     //     System.out.println(b);
    //     // }

    //     // if(a%2 == 0){
    //     //     System.out.println("is even");
    //     // }
    //     // else{
    //     //     System.out.println("is odd");
    //     // }

    //     if(a<10){
    //         System.out.println(10);
    //     }
    //     else if(a<20){
    //         System.out.println(20);
    //     }
    //     else if(a<30){
    //         System.out.println(30);
    //     }
    //     else{
    //         System.out.println(50);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int income = sc.nextInt();
    //     int tax;
    //     if(income < 500000)
    //     {
    //         tax = 0;

    //     }

    //     else if(income >= 500000 && income < 1000000){
    //         tax =(int)(income * 0.2);
    //     }

    //     else{
    //         tax = (int)(income * 0.3);
    //     }

    //     System.out.println("your tax is :" + tax);
    // }

    // public static void main(String[] args) {
    //     int a = 33;
    //     String result =(a >= 33) ? "Pass" : "Fail";
    //     System.out.println(result);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();

    //     switch (a) {
    //         case 1:
    //         System.out.println("one");
    //         break;

    //         case 2: 
    //         System.out.println("two");
    //         break;
            

    //         default:
    //         System.out.println("nothing");
    //             break;
    //     }
    // }

    // public static void main(String [] args)
    // {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     char op = sc.next().charAt(0);

    //     switch (op) {
    //         case '+':
    //             System.out.println(a+b);
    //             break;
            
    //         case '-':
    //         System.out.println(a-b);
    //         break;

    //         case '*':
    //         System.out.println(a*b);
    //         break;

    //         case '/':
    //         System.out.println(a/b);
    //         break;
        
    //         default:
    //         break;
    //     }
    // }

    public static void main(String[] args) {
        // int sum =0; int a = 1;
        // while(a<=4)
        // {
            
           
        //     sum += a;
        //     a++;
        // }
        // System.out.println(sum);
        

        // for(int i = 1 ; i<=4 ; i++)
        // {
        //     System.out.println("****");
        // }

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int revers =0 ;
        // while(number > 0){
        //     revers= (revers*10)+number%10;
        //     number = number / 10;
        // }
        // System.out.println(revers);


        // int i = 4;
        
        // do
        // {
        //     System.out.print(i);
        //     i++;
        // }while(i>3);

        /* PRIME NUMBER */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 2 ; i<=num-1 ; i++){
            if(num%i==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.err.println("prime");
                break;
            }
        }

    }

};
