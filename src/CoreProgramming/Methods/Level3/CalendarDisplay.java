package Core_Programming.Methods.Level3;

public class CalendarDisplay {

    static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static int getFirstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 2 && isLeapYear(year)) days[1] = 29;

        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = getFirstDay(month, year);
        for (int i = 0; i < start; i++)
            System.out.print("    ");

        for (int d = 1; d <= days[month - 1]; d++) {
            System.out.printf("%3d ", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
    }
}
