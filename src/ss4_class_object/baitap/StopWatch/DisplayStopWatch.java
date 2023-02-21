package ss4_class_object.baitap.StopWatch;

public class DisplayStopWatch {
    public static void main(String[] args) {
        BuildStopWatch stopwatch = new BuildStopWatch();
        System.out.println("Start date of program: " + stopwatch.getStartDate());
        System.out.println("Start time of program by milliseconds: " + stopwatch.getStartTime());
        for (int i = 0; i < 100000; i++) {
            System.out.println("hello");
        }
        System.out.println("End date of program show hello: " + stopwatch.getEndDate());
        System.out.println("End time of program by milliseconds show hello: " + stopwatch.getEndTime());
        System.out.println("Time elapsed: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}
