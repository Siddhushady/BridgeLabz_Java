package Core_Programming.Methods.Level3;

/**
 * MatrixOperations class provides comprehensive matrix operations using multiple methods.
 * The program demonstrates advanced method usage by creating functions for matrix creation,
 * addition, subtraction, multiplication, transpose, determinant calculation, and inverse
 * calculation for 2x2 and 3x3 matrices. It showcases various linear algebra operations.
 */
public class MatrixOperations {

    /**
     * Creates a matrix filled with random integers (0-9).
     * @param rows Number of rows
     * @param cols Number of columns
     * @return Matrix filled with random values
     */
    public static double[][] createMatrix(int rows, int cols) {
        // Creating matrix with specified dimensions
        double[][] matrix = new double[rows][cols];
        // Nested loops to fill matrix with random values
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                // Generating random integer between 0 and 9
                matrix[i][j] = (int)(Math.random() * 10);
        // Returning the created matrix
        return matrix;
    }

    /**
     * Performs matrix addition: C = A + B.
     * @param a First matrix
     * @param b Second matrix
     * @return Result matrix containing sum
     */
    public static double[][] add(double[][] a, double[][] b) {
        // Creating result matrix with same dimensions
        double[][] res = new double[a.length][a[0].length];
        // Nested loops to add corresponding elements
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                // Adding elements at corresponding positions
                res[i][j] = a[i][j] + b[i][j];
        // Returning the result matrix
        return res;
    }

    /**
     * Performs matrix subtraction: C = A - B.
     * @param a First matrix
     * @param b Second matrix
     * @return Result matrix containing difference
     */
    public static double[][] subtract(double[][] a, double[][] b) {
        // Creating result matrix with same dimensions
        double[][] res = new double[a.length][a[0].length];
        // Nested loops to subtract corresponding elements
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                // Subtracting elements at corresponding positions
                res[i][j] = a[i][j] - b[i][j];
        // Returning the result matrix
        return res;
    }

    /**
     * Performs matrix multiplication: C = A * B.
     * @param a First matrix
     * @param b Second matrix
     * @return Result matrix containing product
     */
    public static double[][] multiply(double[][] a, double[][] b) {
        // Creating result matrix: rows from A, columns from B
        double[][] res = new double[a.length][b[0].length];
        // Triple nested loops for matrix multiplication
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                // Inner loop to calculate dot product
                for (int k = 0; k < b.length; k++)
                    // Accumulating product: sum of a[i][k] * b[k][j]
                    res[i][j] += a[i][k] * b[k][j];
        // Returning the result matrix
        return res;
    }

    /**
     * Calculates the transpose of a matrix (rows become columns).
     * @param m Input matrix
     * @return Transposed matrix
     */
    public static double[][] transpose(double[][] m) {
        // Creating transposed matrix: swap rows and columns
        double[][] t = new double[m[0].length][m.length];
        // Nested loops to swap rows and columns
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                // Swapping indices: t[j][i] = m[i][j]
                t[j][i] = m[i][j];
        // Returning the transposed matrix
        return t;
    }

    /**
     * Calculates determinant of a 2x2 matrix.
     * @param m 2x2 matrix
     * @return Determinant value
     */
    public static double determinant2x2(double[][] m) {
        // Using formula: ad - bc for matrix [[a,b],[c,d]]
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    /**
     * Calculates determinant of a 3x3 matrix using cofactor expansion.
     * @param m 3x3 matrix
     * @return Determinant value
     */
    public static double determinant3x3(double[][] m) {
        // Using cofactor expansion along first row
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    /**
     * Calculates the inverse of a 2x2 matrix.
     * @param m 2x2 matrix
     * @return Inverse matrix, or null if determinant is zero
     */
    public static double[][] inverse2x2(double[][] m) {
        // Calculating determinant
        double det = determinant2x2(m);
        // Checking if matrix is singular (non-invertible)
        if (det == 0) return null;

        // Returning inverse using formula: (1/det) * [[d,-b],[-c,a]]
        return new double[][]{
                {  m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det,  m[0][0] / det }
        };
    }

    /**
     * Calculates the inverse of a 3x3 matrix using adjugate method.
     * @param m 3x3 matrix
     * @return Inverse matrix, or null if determinant is zero
     */
    public static double[][] inverse3x3(double[][] m) {
        // Calculating determinant
        double det = determinant3x3(m);
        // Checking if matrix is singular (non-invertible)
        if (det == 0) return null;

        // Creating inverse matrix
        double[][] inv = new double[3][3];

        // Calculating each element of inverse using cofactors
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        // Returning the inverse matrix
        return inv;
    }

    /**
     * Displays a matrix in formatted form.
     * @param m Matrix to display
     */
    public static void displayMatrix(double[][] m) {
        // Enhanced for loop to iterate through rows
        for (double[] row : m) {
            // Enhanced for loop to iterate through elements in each row
            for (double val : row)
                // Formatting and printing each element
                System.out.printf("%6.2f ", val);
            // Moving to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Creating two random 3x3 matrices
        double[][] A = createMatrix(3, 3);
        double[][] B = createMatrix(3, 3);

        // Displaying matrix A
        System.out.println("Matrix A:");
        displayMatrix(A);

        // Displaying matrix B
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        // Performing and displaying addition
        System.out.println("\nAddition:");
        displayMatrix(add(A, B));

        // Performing and displaying subtraction
        System.out.println("\nSubtraction:");
        displayMatrix(subtract(A, B));

        // Performing and displaying multiplication
        System.out.println("\nMultiplication:");
        displayMatrix(multiply(A, B));

        // Calculating and displaying transpose
        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));

        // Calculating and displaying determinant
        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(A));

        // Calculating and displaying inverse
        System.out.println("\nInverse of A (3x3):");
        double[][] inv = inverse3x3(A);
        // Checking if inverse exists
        if (inv != null)
            displayMatrix(inv);
        else
            System.out.println("Inverse not possible");
    }
}
