public class Triangle {
    static int size = 5;
    static char[][] board = new char[size][size];
    public static void triangleUpdateRow(int row, int column) {
        if (column < 1) {
            return;
        }
        board[row-1][column-1] = '*';
        triangleUpdateRow(row, column - 1); 
    }
    public static void triangle(int n) {
        if (n < 1) {
            return;
        }
        triangleUpdateRow(n,n);
        triangle(n - 1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
        triangle(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}