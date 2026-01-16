package CoreProgramming.ProgrammingElements.Level1;

public class PenShare {
    public static void main(String[] args){
        int totalPens=14;
        int kids=3;
        int each=totalPens/kids;
        int left=totalPens%kids;
        System.out.println("The Pen Per Student is "+each+" and the remaining pen not distributed is "+left);
    }
}
