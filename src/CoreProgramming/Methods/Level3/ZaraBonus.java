package Core_Programming.Methods.Level3;

public class ZaraBonus {

    public static double[][] generateEmployees() {
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000; // Salary
            data[i][1] = Math.random() * 10;           // Years
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] emp) {
        double[][] result = new double[10][2];

        for (int i = 0; i < emp.length; i++) {
            double bonusRate = emp[i][1] > 5 ? 0.05 : 0.02;
            double bonus = emp[i][0] * bonusRate;
            result[i][0] = emp[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] emp = generateEmployees();
        double[][] res = calculateBonus(emp);

        System.out.println("OldSalary\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\n",
                    emp[i][0], res[i][0], res[i][1]);
        }
    }
}
