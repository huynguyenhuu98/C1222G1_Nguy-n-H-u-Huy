package ss4_class_object.baitap.StopWatch;

import java.util.Date;

public class BuildStopWatch {
    private long startTime;
    private long endTime;
    public Date startDate;
    public Date endDate;

    public BuildStopWatch() {
        startTime = new Date().getTime();
    }

    public Date getStartDate() {
        return startDate = new Date();
    }

    public Date getEndDate() {
        return endDate = new Date();
    }

    public long getStartTime() {
        return startTime = new Date().toInstant().toEpochMilli();
    }

    public long getEndTime() {
       return endTime = new Date().toInstant().toEpochMilli();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
