package HomeWork.Lesson_1;

public class ElvisTask {
    public static void main(String[] arg) {
        System.out.println(match(1,2,1,0));
    }

    static int match(int firstTeamResult, int secondTeamResult, int forecastFirst, int forecastSecond) {
        int result;
        result = (firstTeamResult >= secondTeamResult && forecastFirst >= secondTeamResult)||
                (firstTeamResult <= secondTeamResult && forecastFirst <= forecastSecond) ?
                (firstTeamResult == forecastFirst && secondTeamResult == forecastSecond ? 2 : 1) : 0;
        return result;
    }
}
