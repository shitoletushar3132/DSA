import java.util.Scanner;

public class two_D {
    public static boolean find(int two[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (two[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void spiral_print(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endrow] + " ");
            }

            for (int j = endcol - 1; j >= startcol; j--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

    }

    public static void dia_sum(int matrix[][]) {
        int d1 = 0;
        int d2 = 0;
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i == j) {
                        d1 += matrix[i][j];
                    } else if (i + j == matrix.length - 1) {
                        System.out.println(matrix[i][j]);
                        d2 += matrix[i][j];
                    }

                }
            }
            System.out.println("1st : " + d1);
            System.out.println("1st : " + d2);
        }
        else{
            System.out.println("not operation perform on that");
        }
    }

    public static void main(String[] args) {
        // int two [][] = new int[3][3];

        // Scanner sc = new Scanner(System.in);
        // int n = two.length;//row size in 2_d
        // int m = two[0].length;//coloum size

        // for(int i = 0 ; i<3; i++){
        // for(int j =0; j<3; j++){
        // two[i][j]=sc.nextInt();
        // }
        // }

        // for(int i = 0 ; i<3; i++){
        // for(int j =0; j<3; j++){
        // System.out.print(two[i][j]+" ");
        // }
        // System.out.println();
        // }

        // if(find(two, 4)==true){
        // System.out.println("element are found");
        // }
        // else{
        // System.out.println("not found");
        // }

        int matrix1[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // spiral_print(matrix);

        int dia[][] = { { 1, 2, 3},
                { 5, 6, 7},
                { 9, 10, 11}};

        dia_sum(dia);

    }

}
