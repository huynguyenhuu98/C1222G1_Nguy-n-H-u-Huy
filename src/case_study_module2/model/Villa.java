package case_study_module2.model;

public class Villa extends Facility{
    private String standardRoom;
    private String areaPool;
    private String amountFloor;

    public Villa() {
    }

    public Villa(String nameService, String areaUse, double costRent, int amountPeople,
                 String typeRent, String standard, String areaPool, String amountFloor) {
        super(nameService, areaUse, costRent, amountPeople, typeRent);
        this.standardRoom = standard;
        this.areaPool = areaPool;
        this.amountFloor = amountFloor;
    }

    public String getStandard() {
        return standardRoom;
    }

    public void setStandard(String standard) {
        this.standardRoom = standard;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(String amountFloor) {
        this.amountFloor = amountFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standardRoom + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", amountFloor='" + amountFloor + '\'' +
                '}';
    }
}
