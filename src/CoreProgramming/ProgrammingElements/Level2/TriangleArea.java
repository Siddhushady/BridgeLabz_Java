package CoreProgramming.ProgrammingElements.Level2;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double baseCm=sc.nextDouble();
        double heightCm=sc.nextDouble();
        double areaSqCm=0.5*baseCm*heightCm;
        double areaSqIn=areaSqCm/(2.54*2.54);
        System.out.println("The Area of the triangle in sq in is "+areaSqIn+" and sq cm is "+areaSqCm);
    }
}
