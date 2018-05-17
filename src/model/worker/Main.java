package model.worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ManualWorker bulider = new ManualWorker();
        Manager engeneer = new Manager();
        WhiteCollar secretary = new WhiteCollar();
        BoardMember ceo = new BoardMember();
        Trainee studenta = new Trainee();
        Trainee studentb = new Trainee();

        Date topaste;

        bulider.setName("Bartłomiej");
        bulider.setSurname("Rudy");
        topaste = changeDate("03-05-1974");
        bulider.setBirthyear(topaste);;
        bulider.setPayBasis(20.00);
        bulider.setWorkedHours(170);
        bulider.setAdditionalHours(30);
        String[] newskills = new String[2];
        newskills[0] = "prawo jazdy b";
        newskills[1] = "wózek widłowy";
        bulider.setSkills(newskills);
        bulider.CalculateSalary();

        engeneer.setName("Mikołaj");
        engeneer.setSurname("Lawniczak");
        topaste = changeDate("12-03-1968");
        engeneer.setBirthyear(topaste);
        engeneer.setPayBasis(30.00);
        engeneer.setBonusPercent(3);
        engeneer.setAddSalary(200.00);
        engeneer.setDepartment("Produkcja");
        engeneer.setRoomNo("422");
        engeneer.setPhone("58 533-422-145");
        engeneer.setMobile("778-345-233");
        engeneer.CalculateSalary();

        secretary.setName("Iwona");
        secretary.setSurname("Piechotka");
        topaste = changeDate("21-04-1988");
        secretary.setBirthyear(topaste);
        secretary.setPayBasis(2000.00);
        secretary.setBonusPercent(5);
        secretary.CalculateSalary();
        secretary.setPhone("555-666-777");
        secretary.setRoomNo("102c");

        ceo.setName("Konstantyn");
        ceo.setSurname("Orlicki");
        topaste = changeDate("12-03-1977");
        ceo.setBirthyear(topaste);
        ceo.setPayBasis(20000.00);
        ceo.setNumberofMeetings(4);
        ceo.setMeetingSalary(1000.00);
        ceo.setAssistant(secretary);
        ceo.CalculateSalary();

        secretary.setManager(ceo);

        studenta.setName("Damian");
        studenta.setSurname("Mak");
        topaste = changeDate("14-06-1995");
        studenta.setBirthyear(topaste);
        studenta.setScholarship(true);
        studenta.setPayBasis(1500.00);
        studenta.setPatron(bulider);
        studenta.CalculateSalary();

        studentb.setName("Ksenia");
        studentb.setSurname("Lukomska");
        topaste = changeDate("25-11-1997");
        studentb.setBirthyear(topaste);
        studentb.setScholarship(false);
        studentb.setPayBasis(1500.00);
        studentb.setPatron(engeneer);
        studentb.CalculateSalary();


        bulider.BasicInfo();
        bulider.AdditionalInfo();
        secretary.BasicInfo();
        secretary.AdditionalInfo();
        engeneer.BasicInfo();
        engeneer.AdditionalInfo();
        ceo.BasicInfo();
        ceo.AdditionalInfo();
        studenta.BasicInfo();
        studenta.AdditionalInfo();
        studentb.BasicInfo();
        studentb.AdditionalInfo();
    }

    public static Date changeDate(String humanformat) {

        SimpleDateFormat curdate = new SimpleDateFormat("dd-mm-yyyy");

        Date date = null;
        try {
            date = curdate.parse(humanformat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
