public class recursion {

    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        return a*factorial(a-1);
    }

    public static void decreasing(int a){
        
       
        if(a==1){
            System.out.print(a+" ");
            return;
        }
        System.out.print(a+" ");
        decreasing(a-1);  
    }

    public static void increasing(int a){
        
        if(a==1){
            System.out.print(a+" ");
            return;
        }
        
        increasing(a-1);
        System.out.print(a+" ");
    }

    public static int sum(int a){
        if(a==1){
            return 1;
        }
        return a+sum(a-1);
    } 

    public static int fib(int n){

        //fib n = fib n-1 + fib n-2
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2); 
        int fn = fnm1 + fnm2;
        
        return fn;  
    }

    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    public static int firstoccur(int arr[], int k, int i){
        if(k==arr[i]){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        
        return (firstoccur(arr,k,i+1));

    }

    public static int my_logic_lastoccur(int arr[], int k, int i,int r){
        if(i == arr.length){
            return r;
        }
        
        if(arr[i]==k){
            r=i;
        }
        return(my_logic_lastoccur(arr,k,i+1,r));

    }
    public static int lastoccu(int arr[], int k, int i){
        
        if(i == arr.length){
            return i;  
        }
        int isfound = lastoccu(arr,k,i+1);

        if(isfound == -1 && arr[i]==k){
            return i;
        }

        return isfound;
    }

    public static int printxn(int x, int n){
        if(n==0){
            return 1;
        }
        return(x*(printxn(x,n-1)));
    }

    public static int optimize_printxn(int x, int n){
        if(n==0){
            return 1;
        }

        int halfpower = optimize_printxn(x,n/2);
        int halfpowersq = halfpower * halfpower;

        if(n % 2 != 0){
            halfpowersq = x* halfpowersq;
        }
        return halfpowersq;
    }

    public static int tilingproblem(int n){

        if(n==0 || n==1){
            return 1;
        }
        //kam
        //vertical choice
        int fnm1 = tilingproblem(n-1);
        //horizontal
        int fnm2 = tilingproblem(n-2);

        int totways = fnm1+fnm2;

        return totways;
    }

    public static void remove_duplicate(String str,int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.print(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a']==true){
            remove_duplicate(str,idx+1,newstr,map);
        }
        else{
            map[currchar-'a'] = true;
            newstr = newstr.append(currchar);
            remove_duplicate(str,idx+1,newstr,map);
        }
    }

    public static int friends_pair(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        //single
        int fnm1 = friends_pair(n-1);

        //pair
        int pairway =(n-1)* friends_pair(n-2);

        int totways = fnm1 + pairway;
        return totways;
    }

    public static void binary_string_consecutive_one(int n,int lastplace,String sb){

        if(n==0){
            System.out.println(sb);
            return;
        }

        binary_string_consecutive_one(n-1,0,sb+"0");
       if(lastplace == 0){
            binary_string_consecutive_one(n-1,1,sb+"1");
        }  
    }
    public static void main(String [] args){
    //   String str = "appnnacollege";
    //   StringBuilder sb =new StringBuilder("");
    //   boolean map[]=new boolean[26];
    //   remove_duplicate(str,0,sb,map);
        // String st = "010001101";
        binary_string_consecutive_one(3,0, (""));
       
    }
    
}
