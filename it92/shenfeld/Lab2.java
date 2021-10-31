package it92.shenfeld;

public class Lab2 {
    public static void main(String[] args) {
        // a x B, a - const
        // type - float
        // 
        final float a = 5;
        float[][] B = new float[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        float[][] C = new float[3][3];

        float sumEven = 0;
        float sumOdd = 0;

        System.out.println("matrix C =");

        for (int i = 0; i < B.length; i++) {
            System.out.print('\t');
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = (a * B[i][j]);
                System.out.print(C[i][j] + "\s\s");
            }
            System.out.println();
        }

        // Even
        for (int i = 0; i < C.length; i += 2) {
            float min = C[i][0];
            for (int j = 1; j < C[0].length; j++) {
                var value = C[i][j];
                if (value < min)
                    min = value;
            }
            sumEven += min;
        }

        // Odd
        for (int i = 1; i < C.length; i += 2) {
            float max = C[i][0];
            for (int j = 1; j < C[0].length; j++) {
                var value = C[i][j];
                if (value > max)
                    max = value;
            }
            sumOdd += max;
        }
        System.out.println("Sum of max element in odd columns: " + sumOdd);
        System.out.println("Sum of min element in even columns: " + sumEven);
    }
}
