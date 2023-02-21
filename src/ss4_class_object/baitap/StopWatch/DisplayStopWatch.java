package ss4_class_object.baitap.StopWatch;

public class DisplayStopWatch {
    public static void main(String[] args) {
        System.out.println(BuildStopWatch.setStartTime());
        for (int i = 0; i < 100000; i++) {
            System.out.println("Hê sờ lô");
        }
        System.out.println();
        System.out.println(BuildStopWatch.setEndTime());

    }
}
