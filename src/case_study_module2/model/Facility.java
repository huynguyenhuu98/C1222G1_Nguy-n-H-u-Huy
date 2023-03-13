package case_study_module2.model;

public abstract class Facility {
    private String nameService;
    private String areaUse;
    private double costRent;
    private int amountPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, String areaUse, double costRent, int amountPeople, String typeRent) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.costRent = costRent;
        this.amountPeople = amountPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(String areaUse) {
        this.areaUse = areaUse;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUse='" + areaUse + '\'' +
                ", costRent=" + costRent +
                ", amountPeople=" + amountPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
