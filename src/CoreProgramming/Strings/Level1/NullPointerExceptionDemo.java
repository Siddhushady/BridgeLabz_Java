package CoreProgramming.String.Level1;

public class NullPointerExceptionDemo {


    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception
    }


    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}
