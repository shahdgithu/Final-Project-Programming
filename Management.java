import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Management {

    public String FirstNameManagement="1";
    public String LastNameManagement="1";
    public String idManagement="1";
    private int numOfManagement;

    private Management[] Managements;

    private EducationalServices[] allUniversity;
    private EducationalServices[] allSchool;


    private int numOfSchools;
    private int numOfUniversity;

    private TouristServices[] allHotel;
    private TouristServices[] allResturant;
    private TouristServices[] allTouristAreas;

    private int numOfHotel;
    private int numOfResturant;

    private int numOfTouristAreas;

    private Services[] allHospitals;
    private int numOfHospitals;

    public Management() throws FileNotFoundException {
        Managements = new Management[3];
        readManagementFile();
        allSchool = new EducationalServices[10];
        readSchoolFile();
        allUniversity = new EducationalServices[10];
        readUniversityFile();
        allHotel = new TouristServices[10];
        readHotelFile();
        allResturant = new TouristServices[10];
        readResturantFile();
        allTouristAreas = new TouristServices[10];
        readTouristAreasFile();


        allHospitals = new Services[10];
        readHospitalsFile();
        //readSchoolFile();

        //writeUniversityFile();
       // writeHotelFile();
        //writeSchoolFile();
        //writeHospitals();
        //writeResturant();
        //writeTouristAreas();
    }

    public boolean addNewScools(String name, String numberPhone, String location, String link, boolean residence) {
        if (numOfSchools < allSchool.length) {
            EducationalServices s = new EducationalServices(name, numberPhone, location, link, residence);
            allSchool[numOfSchools] = s;
            numOfSchools++;
            return true;
        } else
            return false;
    }
    public boolean addNewUniversity(String name, String numberPhone, String location, String link, boolean residence) {
        if (numOfUniversity < allUniversity.length) {
            EducationalServices s = new EducationalServices(name, numberPhone, location, link, residence);
            allUniversity[numOfUniversity] = s;
            numOfUniversity++;
            return true;
        } else
            return false;
    }

    public boolean addNewHotel(String name, String numberPhone, String location, String link, String description) {
        if (numOfHotel < allHotel.length) {
            TouristServices s = new TouristServices(name, numberPhone, location, link, description);
            allHotel[numOfHotel] = s;
            numOfHotel++;
            return true;
        } else
            return false;
    }
    public boolean addNewResturant(String name, String numberPhone, String location, String link, String description) {
        if (numOfResturant < allResturant.length) {
            TouristServices s = new TouristServices(name, numberPhone, location, link, description);
            allResturant[numOfResturant] = s;
            numOfResturant++;
            return true;
        } else
            return false;
    }

    public boolean addNewTouristAreas(String name, String numberPhone, String location, String link, String description) {
        if (numOfTouristAreas < allTouristAreas.length) {
            TouristServices s = new TouristServices(name, numberPhone, location, link, description);
            allTouristAreas[numOfTouristAreas] = s;
            numOfTouristAreas++;
            return true;
        } else
            return false;
    }
    public boolean addNewHospitals(String name, String numberPhone, String location, String link) {
        if (numOfHospitals < allHospitals.length) {
            Services s = new Services(name, numberPhone, location, link);
            allHospitals[numOfHospitals] = s;
            numOfHospitals++;
            return true;
        } else
            return false;
    }

    public EducationalServices[] viewAllScools() {
        return allSchool;
    }

    public EducationalServices[] viewAllUniversitys() {
        return allUniversity;
    }

    public TouristServices[] viewAllHotels() {
        return allHotel;
    }

    public TouristServices[] viewAllResturant() {
        return allResturant;
    }

    public TouristServices[] viewAllTouristAreas() {
        return allTouristAreas;
    }

    public Services[] viewAllHospitals() {
        return allHospitals;
    }


    public EducationalServices searchForSchool(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allSchool.length) {
            if (Objects.equals(allSchool[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allSchool.length)
            return allSchool[i];
        else
            return null;
    }

    public int searchForSchoolIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allSchool.length) {
            if (Objects.equals(allSchool[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allSchool.length)
            return i;
        else
            return -1;
    }
    public EducationalServices searchForUniversity(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allUniversity.length) {
            if (Objects.equals(allUniversity[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allUniversity.length)
            return allUniversity[i];
        else
            return null;
    }

    public int searchForUniversityIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allUniversity.length) {
            if (Objects.equals(allUniversity[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allUniversity.length)
            return i;
        else
            return -1;
    }
    public TouristServices searchForHotel(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allHotel.length) {
            if (Objects.equals(allHotel[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allHotel.length)
            return allHotel[i];
        else
            return null;
    }

    public int searchForHotelIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allHotel.length) {
            if (Objects.equals(allHotel[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allHotel.length)
            return i;
        else
            return -1;
    }
    public TouristServices searchForResturant(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allResturant.length) {
            if (Objects.equals(allResturant[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allResturant.length)
            return allResturant[i];
        else
            return null;
    }

    public int searchForResturantIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allResturant.length) {
            if (Objects.equals(allResturant[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allResturant.length)
            return i;
        else
            return -1;
    }
    public TouristServices searchForTouristAreas(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allTouristAreas.length) {
            if (Objects.equals(allTouristAreas[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allTouristAreas.length)
            return allTouristAreas[i];
        else
            return null;
    }

    public int searchForTouristAreasIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allTouristAreas.length) {
            if (Objects.equals(allTouristAreas[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allTouristAreas.length)
            return i;
        else
            return -1;
    }

    public Services searchForHospitals(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allHospitals.length) {
            if (Objects.equals(allHospitals[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allHospitals.length)
            return allHospitals[i];
        else
            return null;
    }

    public int searchForHospitalsIndex(String name) {
        boolean found = false;
        int i = 0;
        while (!found && i < allHospitals.length) {
            if (Objects.equals(allHospitals[i].getName(), name))
                found = true;
            else
                i++;
        }
        if (i < allHospitals.length)
            return i;
        else
            return -1;
    }
//    public Management searchForManagement(String idManagement) {
//        boolean found = false;
//        int i = 0;
//        while (!found && i < Managements.length) {
//            if (Objects.equals(Managements[i].getIdManagement(), idManagement))
//                found = true;
//            else
//                i++;
//        }
//        if (i < Managements.length)
//            return Managements[i];
//        else
//            return null;
//    }


    public boolean deleteSchool(String name) {
        int index = searchForSchoolIndex(name);
        if (index != -1) {
            allSchool[index] = null;
            return true;

        } else
            return false;

    }

    public boolean deleteUniversity(String name) {
        int index = searchForUniversityIndex(name);
        if (index != -1) {
            allUniversity[index] = null;
            return true;

        } else
            return false;

    }
    public boolean deleteHotel(String name) {
        int index = searchForHotelIndex(name);
        if (index != -1) {
            allHotel[index] = null;
            return true;

        } else
            return false;

    }
    public boolean deleteResturant(String name) {
        int index = searchForResturantIndex(name);
        if (index != -1) {
            allResturant[index] = null;
            return true;

        } else
            return false;

    }
    public boolean deleteTouristAreas(String name) {
        int index = searchForTouristAreasIndex(name);
        if (index != -1) {
            allTouristAreas[index] = null;
            return true;

        } else
            return false;

    }
    public boolean deleteHospitals(String name) {
        int index = searchForHospitalsIndex(name);
        if (index != -1) {
            allHospitals[index] = null;
            return true;

        } else
            return false;

    }

    public String getFirstNameManagement() {
        return FirstNameManagement;
    }

    public void setFirstNameManagement(String firstNameManagement) {
        FirstNameManagement = firstNameManagement;
    }

    public String getLastNameManagement() {
        return LastNameManagement;
    }

    public void setLastNameManagement(String lastNameManagement) {
        LastNameManagement = lastNameManagement;
    }

    public String getIdManagement() {
        return idManagement;
    }

    public void setIdManagement(String idManagement) {
        this.idManagement = idManagement;
    }

    @Override
    public String toString() {
        return "Management{" +
                "FirstNameManagement='" + FirstNameManagement + '\'' +
                ", LastNameManagement='" + LastNameManagement + '\'' +
                ", idManagement=" + idManagement +
                '}';
    }

    public Management(String firstNameManagement, String lastNameManagement, String idManagement) {
       this.FirstNameManagement = firstNameManagement;
        this.LastNameManagement = lastNameManagement;
        this.idManagement = idManagement;
    }

    public void readManagementFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Management.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();

                }
        in.close();

    }

    public void readSchoolFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Schools.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();
            boolean v=in.nextBoolean();
            addNewScools(f,l,id,x,v);
        }
        in.close();

    }
    public void readUniversityFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\University.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();
            boolean v=in.nextBoolean();
            addNewUniversity(f,l,id,x,v);
        }
        in.close();

    }
    public void readHotelFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Hotels.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();
            String v=in.next();
            addNewHotel(f,l,id,x,v);
        }
        in.close();

    }
    public void readResturantFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Resturant.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();
        String v=in.next();
            addNewResturant(f,l,id,x,v);
        }
        in.close();

    }
    public void readTouristAreasFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Tourist areas.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();
            String v=in.next();
            addNewTouristAreas(f,l,id,x,v);
        }
        in.close();

    }
    public void readHospitalsFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E:\\Second level\\Final Project Programming\\Hospitals.txt"));
        in.useLocale(Locale.US);
        while (in.hasNext()) {
            String f = in.next();
            String  l= in.next();
            String id= in.next();
            String x=in.next();

            addNewHospitals(f,l,id,x);
        }
        in.close();

    }

    public void writeSchoolFile() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\Schools.txt"));
        for (int i = 0; i < numOfSchools; i++) {
            if(allSchool[i]!=null)
            w.write(allSchool[i].getName() + "  " + allSchool[i].getNumberPhone() + "  " + allSchool[i].getLocation() + "  " + allSchool[i].getLink() + "  " + allSchool[i].isResidence()+"\n");

        }

        w.close();

    }

    public void writeUniversityFile() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\University.txt"));
        for (int i = 0; i < numOfUniversity; i++) {
            if(allUniversity[i]!=null)
            w.write(allUniversity[i].getName() + "  " + allUniversity[i].getNumberPhone() + "  " + allUniversity[i].getLocation() + "  " + allUniversity[i].getLink() + "  " + allUniversity[i].isResidence()+"\n");

        }

        w.close();

    }

    public void writeHotelFile() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\Hotels.txt"));
        for (int i = 0; i < numOfHotel; i++) {
            if(allHotel[i]!=null)
            w.write(allHotel[i].getName() + "  " + allHotel[i].getNumberPhone() + "  " + allHotel[i].getLocation() + "  " + allHotel[i].getLink() + "\n");

        }

        w.close();

    }

    public void writeResturant() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\Resturant.txt"));
        for (int i = 0; i < numOfResturant; i++) {
            if(allResturant[i]!=null)
            w.write(allResturant[i].getName() + "  " + allResturant[i].getNumberPhone() + "  " + allResturant[i].getLocation() + "  " + allResturant[i].getLink() + "\n");

        }
    }

    public void writeTouristAreas() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\Tourist areas.txt"));
        for (int i = 0; i < numOfTouristAreas; i++) {
if(allTouristAreas[i]!=null)
            w.write(allTouristAreas[i].getName() + "  " + allTouristAreas[i].getNumberPhone() + "  " + allTouristAreas[i].getLocation() + "  " + allTouristAreas[i].getLink() + "\n");

        }


        w.close();


    }

    public void writeHospitals() throws FileNotFoundException {
        PrintWriter w = new PrintWriter(new File("E:\\Second level\\Final Project Programming\\Hospitals.txt"));
        for (int i = 0; i < numOfHospitals; i++) {
            if(allHospitals[i]!=null)
            w.write(allHospitals[i].getName() + "  " + allHospitals[i].getNumberPhone() + "  " + allHospitals[i].getLocation() + "  " + allHospitals[i].getLink() + "\n");

        }
        w.close();
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Management that = (Management) o;
//        System.out.println(idManagement);
//        System.out.println(that.idManagement);
//        return  idManagement.equals(that.idManagement);
//    }
//
//    public boolean ckeckForManagement(Management that) {
//        for (int i = 0; i < numOfManagement; i++) {
//            System.out.println(Managements[i].idManagement);
//            System.out.println(that.idManagement);
//
//            if (Managements[i].equals(that))
//                return true;
//
//        }
//
//        return false;
//    }

}




