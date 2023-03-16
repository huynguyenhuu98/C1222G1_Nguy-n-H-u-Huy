package case_study_module2.model;

public class Facility {
    private String nameService;
    private String areaUse;
    private String costRent;
    private String amountPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, String areaUse, String costRent, String amountPeople, String typeRent) {
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

    public String getCostRent() {
        return costRent;
    }

    public void setCostRent(String costRent) {
        this.costRent = costRent;
    }

    public String getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(String amountPeople) {
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
        return  "nameService='" + nameService + '\'' +
                ", areaUse='" + areaUse + '\'' +
                ", costRent=" + costRent +
                ", amountPeople=" + amountPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
