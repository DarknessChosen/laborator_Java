public class MonthsAndDays {
    public static void main(String args[]) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // 1. Display each month alongside its corresponding number of days.
        System.out.println("Months and their corresponding number of days:");
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + " - " + monthDays[i] + " days");
        }
        // 2. Display the months that have 31 days.
        System.out.println("Months with 31 days:");
        for (int i = 0; i < 12; i++) {
            if (monthDays[i] == 31) {
                System.out.println(months[i]);
            }
        }
    }
}