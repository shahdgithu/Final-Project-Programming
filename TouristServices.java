public class TouristServices extends Services {
    private String description;

    public TouristServices(String name, String numberPhone, String location, String link, String description) {
        super(name, numberPhone, location, link);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()  +"\t"+
                 description +
                "\n";
    }
}
