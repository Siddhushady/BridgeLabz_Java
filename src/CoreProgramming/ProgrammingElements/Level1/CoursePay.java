package CoreProgramming.ProgrammingElements.Level1;

public class CoursePay {
    public static void main(String[] args){
        double feeAmt=125000;
        double cut=10;
        double off=feeAmt*cut/100;
        double pay=feeAmt-off;
        System.out.println("The discount amount is INR "+off+" and final discounted fee is INR "+pay);
    }
}
