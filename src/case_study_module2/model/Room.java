package case_study_module2.model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, String areaUse, double costRent, int amountPeople, String typeRent, String freeService) {
        super(nameService, areaUse, costRent, amountPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
