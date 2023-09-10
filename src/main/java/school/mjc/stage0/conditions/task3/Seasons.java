package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (12 == month || 0 < month && month <= 2) {
            System.out.println("Winter");
        } else if (2 < month && month <= 5) {
            System.out.println("Spring");
        } else if (5 < month && month <= 8) {
            System.out.println("Summer");
        } else if (9 < month && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number");
        }
    }
}
