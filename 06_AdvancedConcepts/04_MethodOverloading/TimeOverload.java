public class TimeOverload {
    // Variables:
    private Integer hour;
    private Integer minute;
    private Integer second;
    // Constructors: 
    public TimeOverload() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public TimeOverload(Integer hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public TimeOverload(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public TimeOverload(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // Helpers: 
    @Override
    public String toString() {
         return "Time: " + hour + ":" + minute + ":" + second;
    }
}
