package Arithmetic;
public class Cube {
    public static int cube(int n) {
        int i = 0, cube = 0, threeNsq = 0, threeN = 0;
        assert cube == i * i * i : cube;
        assert threeNsq == 3 * i * i : threeNsq;
        assert threeN == 3 * i : threeN;
        while (i != n) {
            // Assertion 2
            assert cube == i * i * i : cube;
            assert threeNsq == 3 * i * i : threeNsq;
            assert threeN == 3 * i : threeN;
            cube = cube + threeNsq + threeN + 1;
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * i * i;
            assert threeN == 3 * i;
            threeNsq = threeNsq + 2*threeN + 3;
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * (i + 1) * (i + 1);
            threeN = threeN + 3;
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * (i + 1) * (i + 1);
            assert threeN == 3 * (i + 1);
            i++;
            assert cube == i * i * i : cube;
            assert threeNsq == 3 * i * i : threeNsq;
            assert threeN == 3 * i : threeN;
        }
        assert cube == n * n * n : cube;
        assert threeNsq == 3 * n * n : threeNsq;
        assert threeN == 3 * n : threeN;
        return cube;
    }
    public static void main(String[] args) {
        int x = 3;
        int result = cube(x);
        System.out.println(x + "^3=" + result);
    }

}
