package stopwatch;

public class StopWatch {
    int minutes, hours, days;
    int dailyHrs = 24;

    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes % 60;
            this.hours = minutes / 60;
            if (hours >= 24){
                days = hours / dailyHrs;
                hours = hours % 24;
            }
        }
    }

    public void setDailyHrs(int daily) {
        this.dailyHrs = daily;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours(){
        return this.hours;
    }

    public int getDays(){
        return this.days;
    }
}
