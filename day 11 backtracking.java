public class backtr {

    public static void printall(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void fill_arr(int arr[],int index, int value)
    {
        if(index == arr.length){
            // printall(arr);
            return;
        }
        arr[index] = value;
        fill_arr(arr,index+1,value+1);
        arr[index] = arr[index]-2;

    }

    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion   
        //yes choice
        findsubsets(str,ans+str.charAt(i),i+1);

        //no choice
        findsubsets(str,ans,i+1);


    }
    
public static void permutation(String str, String result){

    if(str.length() == 0){
        System.out.println(result);
        return;
    }
    for(int i=0; i<str.length();i++){
        char curr = str.charAt(i);
        String newstr = str.substring(0 , i) + str.substring(i+1);
        permutation(newstr, result+curr);
    }
}

   public static void main(String[] args) {
    String ste ="abc";
    permutation(ste, "");
   }
}


public class n_queens {
    public static void nqueens(char board[][],int row){

        if(row == board.length){
            // printboard(board);
            System.out.println("-----------------");
            count++;
            return;
        }
        //j value also would be save in stack

        // System.out.println(row);
        for(int j =0; j<board.length; j++){

            if(issafe(board, row , j)){
                
                board[row][j] = 'Q';
                
                nqueens(board, row+1);
                board[row][j] = 'X';

            }
        }
    }
    public static boolean issafe(char board[][], int row, int col){
        //veritcal up
        for(int i = row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left  diagonal
        for(int i = row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i = row-1 , j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }


    public static void printboard(char board[][]){
        for(int i =0; i<board.length;i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String [] args){
       
        int n = 3;
        char board[][] = new char[n][n];

        for(int i = 0 ;i<n;i++){
            for(int j = 0; j<n; j++){
                board[i][j]='X';
            }
        }

        nqueens(board, 0); 
        System.out.println("total ways to solve n queens = "+count);      

    }
    
}


public class grid_ways {
    public static int gridways(int i ,int j, int n, int m){

        if(i == n-1 && j == m-1){//condtion for last cell
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String [] args){
        int n=3, m=3;
        System.out.print(gridways(0,0,n,m));
    }
}

public class sudoku_sol {
    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 ) {
            return true;
        }
        // kaam / recursion
        int nextrow = row, nextcol = col + 1;
        if (col+1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }
        
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean issafe(int sudoku[][], int row, int col, int digit) {
        // col
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[row][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printsu(int sudoku[][]){
        for(int i =0; i<sudoku.length;i++){
            for(int j = 0; j<sudoku.length; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        
        if(sudokusolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printsu(sudoku);
        }
        else{
            System.out.println("solution does not exist");
        }

    }
}
