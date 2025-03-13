package leapyears;

public class fing {
    public static void main(String[] args) {
        int startYear = 2020;
        int endYear = 2030;

        System.out.println("Leap Years between " + startYear + " and " + endYear + ":");
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
