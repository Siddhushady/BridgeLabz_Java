package CoreProgramming.String.Level1;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String[] arr) {
        System.out.println(arr[5]);
    }

    // Method to handle exception
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        String[] names = {"Java", "Python", "C++"};

        // generateException(names);
        handleException(names);
    }
}
