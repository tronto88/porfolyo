public class Arrays {
    public static void processArrays(int[] A, int[] B) {
        double[] C = new double[10];
        double min = (double) A[0] / B[0];
        double max = (double) A[0] / B[0];
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < C.length; i++) {
            C[i] = (double) A[i] / B[i];
            System.out.println("C[" + i + "]: " + C[i]);
            sum += C[i];
            if (min > C[i]) {
                min = C[i];
            }
            if (max < C[i]) {
                max = C[i];
            }
        }
        avg = sum / C.length;
        System.out.println("sum: " + sum);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + avg);
    }
    public static void main(String[] args) {
        int[] A = {124, 117, 478, 786, 111, 325, 422, 145, 523, 33};
        int[] B = {8, 9, 17, 4, 68, 56, 38, 77, 81, 2};

        processArrays(A, B);
    }
}
