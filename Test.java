import java.io.FileNotFoundException;
import java.net.IDN;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    Management m;
    Scanner in;
    public Test() throws FileNotFoundException {
        in = new Scanner(System.in);
      m =new Management();
    }


    public void delete() {
        System.out.println("1:schools \t\t 2:university\t\t3:Hotels\n "+
                " 4:Resturant \t\t 5: Tourist areas\t\t 6: Hospitals");

        int x=in.nextInt();
        if(x==1){
        System.out.println("input schools  to delete");
        String name= in.next();
        boolean deleted=m.deleteSchool(name);
        if (deleted)
            System.out.println("deleted successfully");
        else
            System.out.println("no Services with this ID");
        }
        if(x==2){
            System.out.println("input university  to delete");
            String name= in.next();
            boolean deleted=m.deleteUniversity(name);
            if (deleted)
                System.out.println("deleted successfully");
            else
                System.out.println("no Services with this ID");
        }
        if(x==3){
            System.out.println("input Hotels  to delete");
            String name= in.next();
            boolean deleted=m.deleteHotel(name);
            if (deleted)
                System.out.println("deleted successfully");
            else
                System.out.println("no Services with this ID");
        }
        if(x==4){
            System.out.println("input Resturant  to delete");
            String name= in.next();
            boolean deleted=m.deleteResturant(name);
            if (deleted)
                System.out.println("deleted successfully");
            else
                System.out.println("no Services with this ID");
        }
        if(x==5){
            System.out.println("input Tourist areas  to delete");
            String name= in.next();
            boolean deleted=m.deleteTouristAreas(name);
            if (deleted)
                System.out.println("deleted successfully");
            else
                System.out.println("no Services with this ID");
        }
        if(x==6){
            System.out.println("input Hospitals  to delete");
            String name= in.next();
            boolean deleted=m.deleteHospitals(name);
            if (deleted)
                System.out.println("deleted successfully");
            else
                System.out.println("no Services with this ID");
        }
    }

    public void find() {
        System.out.println("1:schools \t\t 2:university\t\t3:Hotels\n "+
                " 4:Resturant \t\t 5: Tourist areas\t\t 6: Hospitals");
       int x=in.nextInt();
       if(x==1)
       {
           System.out.println("Enter school name:");
           String name =in.next();
           EducationalServices s= m.searchForSchool(name);
           if (s!=null)
               System.out.println(s.getName()+"\t"+s.getNumberPhone()
                       +"\t"+s.getLocation()+"\t"+s.getLink()+"\t"+s.isResidence());
           else
               System.out.println("no School with this name");


       }
       if(x==2) {
           System.out.println("Enter university name:");

           String name = in.next();
           EducationalServices s = m.searchForUniversity(name);
           if (s != null)
               System.out.println(s.getName() + "\t" + s.getNumberPhone()
                       + "\t" + s.getLocation() + "\t" + s.getLink()+"\t"+s.isResidence());
           else
               System.out.println("no Services with this name");
       }
        if(x==3) {
            System.out.println("Enter Hotel name:");

            String name = in.next();
            TouristServices s = m.searchForHotel(name);
            if (s != null)
                System.out.println(s.getName() + "\t" + s.getNumberPhone()
                        + "\t" + s.getLocation() + "\t" + s.getLink()+"\t"+s.getDescription());
            else
                System.out.println("no Services with this name");
        }
        if(x==4) {
            System.out.println("Enter Resturant name:");

            String name = in.next();
            TouristServices  s = m.searchForResturant(name);
            if (s != null)
                System.out.println(s.getName() + "\t" + s.getNumberPhone()
                        + "\t" + s.getLocation() + "\t" + s.getLink()+"\t"+s.getDescription());
            else
                System.out.println("no Services with this name");
        }
        if(x==5) {
            System.out.println("Enter Tourist Areas name:");

            String name = in.next();
          TouristServices s = m.searchForTouristAreas(name);
            if (s != null)
                System.out.println(s.getName() + "\t" + s.getNumberPhone()
                        + "\t" + s.getLocation() + "\t" + s.getLink()+"\t"+s.getDescription());
            else
                System.out.println("no Services with this name");
        }
        if(x==6) {
            System.out.println("Enter Hospital name:");

            String name = in.next();
            Services s = m.searchForHospitals(name);
            if (s != null)
                System.out.println(s.getName() + "\t" + s.getNumberPhone()
                        + "\t" + s.getLocation() + "\t" + s.getLink());
            else
                System.out.println("no Services with this name");
        }

    }
public void viewForStudent(){
    System.out.println("1:schools\t\t2:University");
    int x=in.nextInt();

    if(x==1)
    { EducationalServices[]all=  m.viewAllScools();
        System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
        for (int i = 0; i <all.length ; i++) {
            if (all[i]!=null)
            {
                System.out.println(all[i].getName()+"\t"+
                        all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                        "\t"+all[i].getLink()+all[i].isResidence());
            }
        }

    }
    else   if(x==2)

    { EducationalServices[]all=  m.viewAllUniversitys();
        System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
        for (int i = 0; i <all.length ; i++) {
            if (all[i]!=null)
            {
                System.out.println(all[i].getName()+"\t"+
                        all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                        "\t"+all[i].getLink()+all[i].isResidence());
            }
        }
    }

}
    public void viewForTourist(){
        int x=in.nextInt();

        if(x==1)
        { TouristServices[]all=  m.viewAllHotels();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].getDescription());
                }
            }

        }
        else   if(x==2)

        { TouristServices[]all=  m.viewAllResturant();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].getDescription());
                }
            }
        }
        else   if(x==3)

        { TouristServices[]all=  m.viewAllHotels();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].getDescription());
                }
            }
        }

    }
    public void viewForNewResident() {
        int x = in.nextInt();

        if (x == 1) {
            Services[] all = m.viewAllHospitals();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i < all.length; i++) {
                if (all[i] != null) {
                    System.out.println(all[i].getName() + "\t" +
                            all[i].getNumberPhone() + "\t" + all[i].getLocation() +
                            "\t" + all[i].getLink());
                }
            }
        }
    }
            public void view() {
        int x=in.nextInt();

        if(x==1)
        { EducationalServices[]all=  m.viewAllScools();
        System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
        for (int i = 0; i <all.length ; i++) {
            if (all[i]!=null)
            {
                System.out.println(all[i].getName()+"\t"+
                        all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                        "\t"+all[i].getLink()+all[i].isResidence());
            }
        }

        }
     else   if(x==2)

        { EducationalServices[]all=  m.viewAllUniversitys();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].isResidence());
                }
            }
        }
        else if(x==3)

        {  TouristServices[]all=  m.viewAllHotels();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].getDescription());
                }
            }
        }
        else if(x==4)

        {TouristServices[]all=  m.viewAllResturant();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink()+all[i].getDescription());
                }
            }
        }
        else if(x==5)

        {TouristServices[]all=  m.viewAllTouristAreas();
                System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
                for (int i = 0; i <all.length ; i++) {
                    if (all[i]!=null)
                    {
                        System.out.println(all[i].getName()+"\t"+
                                all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                                "\t"+all[i].getLink()+all[i].getDescription());
                    }
                }
        }
       else if(x==6)

        {Services[]all=  m.viewAllHospitals();
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                {
                    System.out.println(all[i].getName()+"\t"+
                            all[i].getNumberPhone()+"\t"+all[i].getLocation()+
                            "\t"+all[i].getLink());
                }
            }
        }

    }

    public void add(){
        String name ;
        String numberPhone;
        String location;
        String link ;
        boolean residence;
        String description;
        int x=in.nextInt();

  if(x==1) {
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            name = in.next();
            numberPhone = in.next();
            location = in.next();
            link = in.next();
            residence = in.nextBoolean();
            boolean added = m.addNewScools(name, numberPhone, location, link, residence);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");
           }
else if(x==2)
          {
            System.out.println("name\tnumber phone\tlocation\tlink\tresidence");
            name = in.next();
            numberPhone = in.next();
            location = in.next();
            link = in.next();
            residence = in.nextBoolean();
            boolean added = m.addNewUniversity(name, numberPhone, location, link, residence);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");
        }
else if(x==3)
        { System.out.println("name\tnumber phone\tlocation\tlink\tdescription");
            name =in.next();
            numberPhone=in.next();
            location=in.next();
            link=in.next();
            description = in.next();
            boolean added=m.addNewHotel(name,numberPhone,location,link,description);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");

        }
else if(x==4)
        { System.out.println("name\tnumber phone\tlocation\tlink\tdescription");
            name =in.next();
            numberPhone=in.next();
            location=in.next();
            link=in.next();
            description = in.next();
            boolean added=m.addNewResturant(name,numberPhone,location,link,description);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");
        }
else if(x==5)
        { System.out.println("name\tnumber phone\tlocation\tlink\tdescription");
            name =in.next();
            numberPhone=in.next();
            location=in.next();
            link=in.next();
            description = in.next();
            boolean added=m.addNewTouristAreas(name,numberPhone,location,link,description);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");
        }

else if(x==6)
        { System.out.println("name\tnumber phone\tlocation\tlink");
            name =in.next();
            numberPhone=in.next();
            location=in.next();
            link=in.next();
            boolean added=m.addNewHospitals(name,numberPhone,location,link);
            if (added)
                System.out.println("added successfully");
            else
                System.out.println("too mutch Services ");
        }


    }


    public  void start() throws FileNotFoundException {

        System.out.println(" \n\n\t\t  ************* Smart Tour Guide *************\n ");


        System.out.println("1:Student \t\t2:Tourist \n" +
                "3:New resident \t\t4:Management \n 0:Exit\n");
int EntryType =in.nextInt();
if (EntryType==4){

    System.out.println("Enter your First name :");
    String FirstNameManagement=in.next();
    System.out.println("Enter your Last name :");
   String LastNameManagement=in.next();
    System.out.println("Enter your id:");
   String idManagement=in.next();
   if(!FirstNameManagement.equals(m.FirstNameManagement))
//
//boolean x=m.ckeckForManagement(new Management(FirstNameManagement,LastNameManagement,idManagement));
//if(x==false)
{ System.out.println("the Management is not found.");
    System.exit(0);}

else
    while (true) {
            System.out.println("1: Add New Services \t\t2:View All Services\n" +
                    "3: search For Services\t\t4:Delete Services\n0:Save \t\t-1:Exit\n");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1: Add schools \t\t 2:Add university\t\t3:Add Hotels\n "+
                            " 4:Add Resturant \t\t 5:Add Tourist areas\t\t 6: Add Hospitals");
                    add();
                    break;
                case 2:
                    System.out.println("1: view all schools \t\t 2:view all university\t\t3:view all Hotels\n "+
                            " 4:view all Resturant \t\t 5:view all Tourist areas\t\t 6: view all Hospitals");
                    view();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    delete();
                    break;
                case 0:
                    m.writeUniversityFile();
                    m.writeSchoolFile();
                    m.writeResturant();
                    m.writeTouristAreas();
                    m.writeHospitals();
                    break;
                case -1:
                    System.out.println("Good Bye");
                    System.exit(0);
            }

        }
    }

else if(EntryType==1)
{ while (true) {
    System.out.println("1: search For Services\t\t2:View Services\n0:exit");
    int choice = in.nextInt();
    switch (choice){
        case 1:
            find();
            break;
        case 2:
            viewForStudent();
            break;

        case 0:
            System.exit(0);
    }
}

}

    else if (EntryType==2){
    while (true) {
        System.out.println("1: search For Services\t\t2:View Services\n0:exit");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                find();
                break;
            case 2:
                viewForTourist();
                break;

            case 0:
                System.exit(0);
    }

    }
    }
    else if(EntryType==3){
    while (true) {
        System.out.println("1:View All Services\t\t0:exit");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                viewForNewResident();
                break;

            case 0:
                System.exit(0);
        }

}


    }
    else if (EntryType==0) {
    System.out.println("Good Bye");System.exit(0);

}
    }

}