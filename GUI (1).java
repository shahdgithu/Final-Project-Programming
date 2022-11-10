import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class GUI {
    Management m;
    private JPanel Main;
    private JPanel namePanel;
    private JPanel name;
    private JButton studentButton;
    private JButton touristButton;
    private JButton newResidentButton;
    private JButton managementButton;
    private JPanel Buttons;
    private JButton searchButton;
    private JButton viewButton;
    private JPanel student;
    private JPanel Tourist;
    private JButton searchButton1;
    private JButton viewButton1;
    private JPanel newresident;
    private JButton viewButton2;
    private JPanel management;
    private JButton addServicesButton;
    private JButton deleteServicesButton;
    private JButton searchForServicesButton;
    private JButton viewServicesButton;
    private JButton loginButton;
    private JButton back;
    private JButton backButton1;
    private JButton backButton;
    private JPanel StudentSearch;
    private JButton schoolsButton;
    private JButton universitysButton;
    private JPanel StudentView;
    private JButton schoolsButton1;
    private JButton universitysButton1;
    private JPanel TouristSearch;
    private JButton hotelsButton;
    private JButton resturantButton;
    private JButton touristAreasButton;
    private JPanel TouristView;
    private JButton viewHotelsButton;
    private JButton viewTouristAreasButton;
    private JButton viewResturantButton;
    private JPanel NewResidentView;
    private JButton viewHospitalsButton;
    private JPanel SearchSchool;
    private JTextField searchSchool;
    private JTextArea ViweSchools;
    private JPanel ViewSchool;
    private JPanel ViewHotels;
    private JButton searchButton4;
    private JTextArea VeiwHotels;
    private JPanel SearchHotel;
    private JTextField searchHotel;
    private JButton searchButton3;
    private JPanel SearchUniversity;
    private JTextField searchUniversity;
    private JButton searchButton5;
    private JButton backButton2;
    private JButton backButton3;
    private JButton backButton8;
    private JButton backButton7;
    private JButton backButton6;
    private JButton backButton5;
    private JButton backButton4;
    private JButton backButton9;
    private JButton exitButton;
    private JButton exitButton1;
    private JButton backButton10;
    private JButton backButton11;
    private JButton backButton12;
    private JPanel ViewUniversity;
    private JTextArea viewUniversity;
    private JButton backButton13;
    private JButton exitButton2;
    private JPanel SearchResturant;
    private JButton searchButton6;
    private JPasswordField passwordField1;
    private JButton backButton14;
    private JPanel ViewResturant;
    private JButton exitButton3;
    private JTextArea viewResturant;
    private JButton backButton15;
    private JPanel ViewTouristAreas;
    private JButton exitButton4;
    private JButton backButton17;
    private JTextArea textArea1;
    private JPanel SearchTouristAreas;
    private JTextField textField1;
    private JButton searchButton7;
    private JButton backButton16;
    private JButton button1;
    private JTextArea textArea2;
    private JButton backButton19;
    private JButton exitButton5;
    private JPanel ViewHospitals;
    private JPanel Admen;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton LOGINButton;
    private JButton addResturantButton;
    private JButton addTouristAreasButton;
    private JButton addUniversityButton;
    private JButton addSchoolsButton;
    private JButton addHotelButton;
    private JButton addHospitalButton;
    private JButton searchForResturantButton;
    private JButton searchForHospitalButton;
    private JButton searchForHotelButton;
    private JButton searchForScoolsButton;
    private JButton searchForUniversityButton;
    private JButton searchForTouristAreasButton;
    private JPanel ManagementAdd;
    private JPanel ManagementSearch;
    private JButton viewResturantButton2;
    private JButton viewHotelButton;
    private JButton viewSchoolButton;
    private JButton viewHospitalButton;
    private JButton viewTouristAreaButton;
    private JButton viewUniversityButton;
    private JPanel ManagementView;
    private JButton backButton18;
    private JButton backButton20;
    private JButton backButton21;
    private JButton deleteSchoolButton;
    private JButton deleteResturantButton;
    private JButton deleteUniversityButton;
    private JButton deleteTouristAreaButton;
    private JButton deleteHospitalButton;
    private JButton deleteHotelButton;
    private JButton backButton22;
    private JPanel ManagementDelete;
    private JTextField nameSchoolTextField;
    private JTextField numberPhoneTextField;
    private JTextField LocationTextField;
    private JRadioButton residenceRadioButton;
    private JTextField linkTextField;
    private JPanel AddSchool;
    private JButton addButton;
    private JTextField nameUniverTextField;
    private JTextField PhoneUniverTextField;
    private JTextField LocationUniverTextField;
    private JTextField LinkUniverTextField;
    private JRadioButton radioButton1;
    private JButton addButton1;
    private JPanel AddUnivversity;
    private JPanel AddHotel;
    private JTextField nameHotelTextField;
    private JTextField phoneHotelTextField;
    private JTextField LocationHotelTextField;
    private JTextField linkHotelTextField;
    private JTextField DescripHotelTextAreaTextArea;
    private JButton addButton2;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton addButton4;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JButton button3;
    private JPanel AddResturant;
    private JPanel AddTouristArea;
    private JPanel AddHospital;
    private JPanel SearchHospital;
    private JTextField textField19;
    private JButton searchButton2;
    private JButton button5;
    private JButton backButton23;
    private JButton backButton24;
    private JButton addButton3;
    private JButton backButton25;
    private JButton backButton26;
    private JButton backButton27;
    private JButton backButton28;
    private JPanel deletSchool;
    private JPanel deletUniversity;
    private JPanel deletHotel;
    private JPanel deletResturant;
    private JPanel deletTouristArea;
    private JPanel deletHospital;
    private JTextField textField20;
    private JButton EXITButton1;
    private JTextField textField21;
    private JButton EXITButton2;
    private JButton deleteButton1;
    private JButton deleteButton2;
    private JTextField textField22;
    private JButton deleteButton3;
    private JButton EXITButton3;
    private JTextField textField23;
    private JButton EXITButton4;
    private JButton deleteButton4;
    private JTextField textField24;
    private JButton EXITButton5;
    private JButton deleteButton5;
    private JTextField textField25;
    private JButton EXITButton;
    private JButton deleteButton;
    private JButton backButton29;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JTextArea textArea7;
    private JTextField textField26;
    private JTextArea textArea8;


    public GUI() throws FileNotFoundException {
        m = new Management();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });

        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });


        schoolsButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewSchool);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL schools\n";
                EducationalServices[] allSchool = m.viewAllScools();
                for (EducationalServices se : allSchool) {
                    if (se != null)
                        s = s + se.toString();
                }
                ViweSchools.setText(s);
            }
        });

        touristButton.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                namePanel.removeAll();
                                                namePanel.add(Tourist);
                                                namePanel.repaint();
                                                namePanel.revalidate();
                                            }
                                        }
        );
        newResidentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(newresident);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        managementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Admen);
                namePanel.repaint();
                namePanel.revalidate();
            }

        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(StudentView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(StudentSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                namePanel.removeAll();
                namePanel.add(TouristSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }

        });
        viewButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(NewResidentView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        schoolsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchSchool);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        universitysButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchUniversity);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        schoolsButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewSchool);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        universitysButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewUniversity);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL University \n\n";
                EducationalServices[] allSchool = m.viewAllUniversitys();
                for (EducationalServices se : m.viewAllUniversitys()) {
                    if (se != null)
                        s = s + se.toString();
                }
                viewUniversity.setText(s);

            }
        });
        hotelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchHotel);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        resturantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchResturant);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        touristAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchTouristAreas);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }

        });
        viewHotelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewHotels);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL Hotels: \n";
                TouristServices[] allHotel = m.viewAllHotels();
                for (TouristServices se : allHotel) {
                    if (se != null)
                        s = s + se.toString();
                }
                VeiwHotels.setText(s);
            }
        });
        viewResturantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewResturant);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL Resturant: \n";
                TouristServices[] allResturant = m.viewAllResturant();
                for (TouristServices se : allResturant) {
                    if (se != null)
                        s = s + se.toString();
                }
                viewResturant.setText(s);
            }
        });
        viewTouristAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewTouristAreas);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL Tourist Areas: \n";
                TouristServices[] allTouristAreas = m.viewAllTouristAreas();
                for (TouristServices se : allTouristAreas) {
                    if (se != null)
                        s = s + se.toString();
                }
                textArea1.setText(s);
            }
        });
        backButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Tourist);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(TouristSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Tourist);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewHospitalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                namePanel.removeAll();
                namePanel.add(ViewHospitals);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL Hospitals: \n";
                Services[] allHospitals = m.viewAllHospitals();
                for (Services se : allHospitals) {
                    if (se != null)
                        s = s + se.toString();
                }
                textArea2.setText(s);
            }
        });
        backButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(NewResidentView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        exitButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String f = textField2.getText();
                String l = textField2.getText();
                String id = textField3.getText();
                if (!f.equals(m.FirstNameManagement) || !l.equals(m.LastNameManagement) || !id.equals(m.idManagement))
                    JOptionPane.showMessageDialog(null, "You are not Management");
                else
                    namePanel.removeAll();
                namePanel.add(management);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addServicesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewServicesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementView);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForServicesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementSearch);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });

        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addSchoolsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddSchool);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addUniversityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddUnivversity);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddHotel);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addResturantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddResturant);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addTouristAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddTouristArea);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addHospitalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(AddHospital);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(management);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForScoolsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchSchool);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForUniversityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchUniversity);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchHotel);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForResturantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchResturant);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForTouristAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchTouristAreas);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchForHospitalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(SearchHospital);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementAdd);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewSchoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewSchool);
                namePanel.repaint();
                namePanel.revalidate();
                String s = "ALL schools\n";
                EducationalServices[] allSchool = m.viewAllScools();
                for (EducationalServices se : allSchool) {
                    if (se != null)
                        s = s + se.toString();
                }
                ViweSchools.setText(s);

            }
        });
        viewUniversityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewUniversity);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewHotels);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewResturantButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewResturant);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewTouristAreaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewTouristAreas);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        viewHospitalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ViewHospitals);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(management);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        EXITButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(name);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteSchoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletSchool);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteUniversityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletUniversity);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletHotel);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteResturantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletResturant);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteTouristAreaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletTouristArea);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        deleteHospitalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(deletHospital);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        backButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(ManagementDelete);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nameSchoolTextField.getText();
                String p = numberPhoneTextField.getText();
                String l = LocationTextField.getText();
                String r = linkTextField.getText();
                boolean re = Boolean.parseBoolean(residenceRadioButton.getText());
                boolean added = m.addNewScools(n, p, l, r, re);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");

                try {
                    m.writeSchoolFile();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
        addButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nameUniverTextField.getText();
                String p = PhoneUniverTextField.getText();
                String l = LocationUniverTextField.getText();
                String r = LinkUniverTextField.getText();
                boolean re = Boolean.parseBoolean(radioButton1.getText());
                boolean added = m.addNewUniversity(n, p, l, r, re);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");
                try {
                    m.writeUniversityFile();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        addButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nameHotelTextField.getText();
                String p = phoneHotelTextField.getText();
                String l = LocationHotelTextField.getText();
                String r = linkHotelTextField.getText();
                String d = DescripHotelTextAreaTextArea.getText();
                boolean added = m.addNewHotel(n, p, l, r, d);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");
                try {
                    m.writeHotelFile();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        addButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = textField5.getText();
                String p = textField6.getText();
                String l = textField7.getText();
                String r = textField8.getText();
                String d = textField9.getText();
                boolean added = m.addNewResturant(n, p, l, r, d);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");
                try {
                    m.writeResturant();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        addButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = textField10.getText();
                String p = textField11.getText();
                String l = textField12.getText();
                String r = textField13.getText();
                String d = textField14.getText();
                boolean added = m.addNewTouristAreas(n, p, l, r, d);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");
                try {
                    m.writeTouristAreas();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = textField15.getText();
                String p = textField16.getText();
                String l = textField17.getText();
                String r = textField18.getText();

                boolean added = m.addNewHospitals(n, p, l, r);
                if (added) JOptionPane.showMessageDialog(null, "done");
                else JOptionPane.showMessageDialog(null, "NO");
                try {
                    m.writeHospitals();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        backButton29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(Buttons);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });
        searchButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea3);
                namePanel.repaint();
                namePanel.revalidate();
                EducationalServices School = m.searchForSchool(searchSchool.getText());
                String s;
                if (School != null)
                    textArea3.setText(School.toString());
                EducationalServices[] allSchool = m.viewAllScools();
                for (EducationalServices sc : allSchool) {
                    if (sc != null)
                        s = School.toString();
                }
            }
        });
        searchButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea4);
                namePanel.repaint();
                namePanel.revalidate();
                EducationalServices University = m.searchForUniversity(searchUniversity.getText());
                String s;
                if (University != null)
                    textArea4.setText(University.toString());
                EducationalServices[] allUniversity = m.viewAllUniversitys();
                for (EducationalServices sc : allUniversity) {
                    if (sc != null)
                        s = University.toString();
                }
            }

        });
        backButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(student);
                namePanel.repaint();
                namePanel.revalidate();
            }
        });

        searchButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea5);
                namePanel.repaint();
                namePanel.revalidate();
                TouristServices Hotel = m.searchForHotel(searchHotel.getText());
                String s;
                if (Hotel != null)
                    textArea5.setText(Hotel.toString());
                TouristServices[] allHotel = m.viewAllHotels();
                for (TouristServices sc : allHotel) {
                    if (sc != null)
                        s = Hotel.toString();
                }
            }
        });
        searchButton7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea6);
                namePanel.repaint();
                namePanel.revalidate();
                TouristServices touristArea = m.searchForTouristAreas(textField1.getText());
                String s;
                if (touristArea != null)
                    textArea6.setText(touristArea.toString());
                TouristServices[] AllTouristAreas = m.viewAllTouristAreas();
                for (TouristServices sc : AllTouristAreas) {
                    if (sc != null)
                        s = touristArea.toString();}
            }
        });
        searchButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea7);
                namePanel.repaint();
                namePanel.revalidate();
                TouristServices Resturant = m.searchForResturant(textField26.getText());
                String s;
                if (Resturant != null)
                    textArea5.setText(Resturant.toString());
                TouristServices[] allResturant = m.viewAllResturant();
                for (TouristServices sc : allResturant) {
                    if (sc != null)
                        s = Resturant.toString();

                }
            }
        });
        searchButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namePanel.removeAll();
                namePanel.add(textArea8);
                namePanel.repaint();
                namePanel.revalidate();
                Services Hospital = m.searchForHospitals(textField19.getText());
                String s;
                if (Hospital != null)
                    textArea8.setText(Hospital.toString());
                Services[] AllHospital = m.viewAllTouristAreas();
                for (Services sc : AllHospital) {
                    if (sc != null)
                        s = Hospital.toString();
            }}
        });
    }
        public static void main (String[]args) throws FileNotFoundException {
            JFrame frame = new JFrame("GUI");
            frame.setContentPane(new GUI().Main);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 1000);
            frame.setVisible(true);

        }


    }
