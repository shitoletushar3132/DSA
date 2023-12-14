
class pattern {
    // public static void main(String[] args) {
    //     /*
        
    //      * 
    //      **
    //      ***
    //      ****

    //      */
    //     for (int i = 0; i <= 4; i++) {
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args) {
    //     /*
         
    //     *****
    //     ****
    //     ***
    //     **
    //     *

    //     */
    //     for(int i = 0 ; i<=4 ; i++)
    //     {
    //         for (int j = 5; j >= i; j--)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args)
    // {
    //     /*
    //      1
    //      12
    //      123
    //      1234

    //     */

    //     for(int i = 1; i<=4 ;i++)
    //     {
    //         for(int j = 1 ; j<=i ; j++ )
    //         {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    
    // public static void main(String[] args) {
        
    //     /*
    //      A
    //      BC
    //      DEF
    //      GHIJ

    //      */

    //     char ch = 'A';
    //     for(char i = 0; i<= 4 ; i++)
    //     {
    //         for(char j = 0; j<=i; j++ )
    //         {
    //             System.out.print(ch);
    //             ch++;
    //        }
    //         System.out.println();
    //     }
    // }


    public static void hollow()
    {
        /*
          
            ********
            *      *
            *      *
            *******
         */

        int totalrows = 4;
        int totalcoloums = 8;
        for(int i = 0 ; i<=totalrows ; i++)
        {
            for(int j = 0; j<=totalcoloums; j++)
            {
                if(i==0 || i==totalrows || j==0 || j==totalcoloums)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void inverted()
    {
        /*

              *
            * *
          * * *
        * * * *

        */
        int row = 10;
        int col = 10;
        
        for(int i = 1; i<=row; i++)
        {
            for(int s = 1; s<=col-i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i ;j++)
            {
                System.out.print("*");
            }


            System.out.println();
        }

    }


    public static void invert_pyramid_num()
    {
        /*
           ******
           ****
           ***
           **
           *
           
         */
        int row = 5;
        int col = 5;
        for(int i = 1; i<=row; i++)
        {
            for(int j = 1 ; j<=col-i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle()
    {
        /*

         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15

         */
        int row = 5;
        int k = 1;
        for(int i = 1; i<=row; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void zero_one()
    {
        /*

         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1

         */
        int row = 10;
        for(int i=1; i<=row; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if((i+j)%2 ==0)
                {
                    System.out.print(1 +" ");
                }
                else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly()
    {
        /*

          *         *
          * *     * *
          * * * * * *
          * * * * * *
          * *     * *
          *         *


         */
        int n =10;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        
        
    }

    public static void rhombus()
    {
        int row = 6;
        int col = 6;

        for(int i = 1; i<=row; i++)
        {
            for(int j = 1; j<=col-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=col; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


     public static void holl_rhombus()
    {
        int row = 6;
        int col = 6;

        for(int i = 1; i<=row; i++)
        {
            for(int j = 1; j<=col-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=col; k++)
            {
                if(i==1 || i == row || k==1 || k==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void diamond()
    {
        int row =5;
        for(int i =0; i<=row; i++)
        {
            for(int j = 1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++)
            {
                
                System.out.print("*");
                
            }
            // for(int j = 1; j<=row-i; j++)
            // {
            //     System.out.print(" ");
            // }

            System.out.println();
        }
        for(int i =row; i>=0; i--)
        {
            for(int j = 1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++)
            {
                
                System.out.print("*");
                
            }
            // for(int j = 1; j<=row-i; j++)
            // {
            //     System.out.print(" ");
            // }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        diamond();
    }
}
