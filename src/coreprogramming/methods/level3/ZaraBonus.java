package Core_Programming.Methods.Level3;

/**
 * ZaraBonus class calculates employee bonuses based on years of service using multiple methods.
 * The program demonstrates advanced method usage by creating functions to generate random
 * employee data (salary and years of service) and calculate bonuses. Employees with more than
 * 5 years get 5% bonus, others get 2% bonus. It displays old salary, new salary, and bonus.
 */
public class ZaraBonus {

    /**
     * Generates random employee data (salary and years of service).
     * @return 2D array with [salary, years] for 10 employees
     */
    public static double[][] generateEmployees() {
        // Creating 2D array: 10 employees, 2 columns [salary, years]
        double[][] data = new double[10][2];

        // Loop to generate data for 10 employees
        for (int i = 0; i < 10; i++) {
            // Generating random salary between 10000 and 100000
            data[i][0] = 10000 + Math.random() * 90000; // Salary
            // Generating random years of service between 0 and 10
            data[i][1] = Math.random() * 10;           // Years
        }
        // Returning array of employee data
        return data;
    }

    /**
     * Calculates bonus and new salary for all employees.
     * @param emp 2D array with [salary, years] for each employee
     * @return 2D array with [newSalary, bonus] for each employee
     */
    public static double[][] calculateBonus(double[][] emp) {
        // Creating result array: 10 employees, 2 columns [newSalary, bonus]
        double[][] result = new double[10][2];

        // Loop to calculate bonus for each employee
        for (int i = 0; i < emp.length; i++) {
            // Determining bonus rate: 5% if years > 5, else 2%
            double bonusRate = emp[i][1] > 5 ? 0.05 : 0.02;
            // Calculating bonus amount
            double bonus = emp[i][0] * bonusRate;
            // Calculating new salary (old salary + bonus)
            result[i][0] = emp[i][0] + bonus;
            // Storing bonus amount
            result[i][1] = bonus;
        }
        // Returning array with new salaries and bonuses
        return result;
    }

    public static void main(String[] args) {
        // Calling method to generate employee data
        double[][] emp = generateEmployees();
        // Calling method to calculate bonuses
        double[][] res = calculateBonus(emp);

        // Displaying header row
        System.out.println("OldSalary\tNewSalary\tBonus");
        // Loop to display data for all 10 employees
        for (int i = 0; i < 10; i++) {
            // Displaying formatted employee data
            System.out.printf("%.2f\t%.2f\t%.2f\n",
                    emp[i][0], res[i][0], res[i][1]);
        }
    }
}
