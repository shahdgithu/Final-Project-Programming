public class EducationalServices extends Services {

    boolean residence;



    public EducationalServices(String name, String numberPhone, String location, String link, boolean residence) {
        super(name, numberPhone, location, link);
        this.residence = residence;
    }

    public boolean isResidence() {
        return residence;
    }

    public void setResidence(boolean residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return super.toString()+ residence +"\n";
    }

}
