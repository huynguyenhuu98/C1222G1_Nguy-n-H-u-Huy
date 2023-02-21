package ss4_class_object.baitap.StopWatch;

import java.util.Date;

public class BuildStopWatch {
    int startTime;
    int endTime;

    int getStartTime() {
        return startTime;
    }

    int getEndTime() {
        return endTime;
    }

    static Date setStartTime() {
        return new Date();
    }

    static Date setEndTime() {
        return new Date();
    }
    Long getElapsedTime(){
        return setEndTime()  setStartTime();
    }

}
