package Arithmetic;
public class Square {
    public static int square(int n) {
        int i = 0, square = 0, twoN = 0;
        assert square == i * i : square;
        assert twoN == 2 * i : twoN;
        while (i != n) {
            assert square == i * i : square;
            assert twoN == 2 * i : twoN;
            square = square + twoN + 1;
            assert square == (i + 1) * (i + 1);
            assert twoN == 2 * i;
            twoN = twoN + 2;
            assert square == (i + 1) * (i + 1);
            assert twoN == 2 * (i + 1);
            i++;
            assert square == i * i : square;
            assert twoN == 2 * i : twoN;
        }
        assert square == n * n : square;
        assert twoN == 2 * n : twoN;
        return square;
    }
    public static void main(String[] args) {
        int x = 3;
        int result = square(x);
        System.out.println(x + "^2=" + result);
    }
}
