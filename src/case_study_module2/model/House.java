package case_study_module2.model;

public class House extends Facility{
    private String standardRoom;
    private String amountFloor;

    public House() {
    }

    public House(String nameService, String areaUse, String costRent, String amountPeople,
                 String typeRent, String standardRoom, String amountFloor) {
        super(nameService, areaUse, costRent, amountPeople, typeRent);
        this.standardRoom = standardRoom;
        this.amountFloor = amountFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(String amountFloor) {
        this.amountFloor = amountFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", amountFloor='" + amountFloor + '\'' +
                '}';
    }
}
