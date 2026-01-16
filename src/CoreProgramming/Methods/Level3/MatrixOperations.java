package Core_Programming.Methods.Level3;

public class MatrixOperations {

    // Create random matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 10);
        return matrix;
    }

    // Matrix Addition
    public static double[][] add(double[][] a, double[][] b) {
        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    // Matrix Subtraction
    public static double[][] subtract(double[][] a, double[][] b) {
        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    // Matrix Multiplication
    public static double[][] multiply(double[][] a, double[][] b) {
        double[][] res = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    // Transpose
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    // Determinant 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        return new double[][]{
                {  m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det,  m[0][0] / det }
        };
    }

    // Inverse 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // SINGLE Display Method
    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {

        double[][] A = createMatrix(3, 3);
        double[][] B = createMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(add(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtract(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiply(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));

        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(A));

        System.out.println("\nInverse of A (3x3):");
        double[][] inv = inverse3x3(A);
        if (inv != null)
            displayMatrix(inv);
        else
            System.out.println("Inverse not possible");
    }
}
