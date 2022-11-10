import java.util.Objects;

public class Services {

    private String name ;
    private  String numberPhone;
    private String location;
    private String link ;


    public Services(String name, String numberPhone, String location, String link) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.location = location;
        this.link = link;
    }






    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getLocation() {
        return location;
    }

    public String getLink() {
        return link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLink(String link) {
        this.link= link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services services = (Services) o;
        return name.equals(services.name) && numberPhone.equals(services.numberPhone) && location.equals(services.location) && link.equals(services.link);
    }


    @Override
    public String toString() {
        return  name + "\t" +
                 numberPhone + "\t" +
                 location + "\t" +
                 link +"\t" ;
    }
}
