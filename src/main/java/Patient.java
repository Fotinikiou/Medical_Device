import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Medicalappointments.*;
import MedicalTests.*;
public class Patient {
    private String name;
    private ArrayList<MedicalTest> medicaltests = new ArrayList<MedicalTest>();
    private TestDate testdate;
    public Patient (String name){
        this.name = name;
        testdate = new TestDate(LocalDate.now());
    }
    public void addtest(MedicalTest medicaltest){
        medicaltests.add(medicaltest);
    }
    public String getTestDisplay(){
        // Get a string displaying the appointment information for this patient
        // Surround with <html></html> tags so it can be displayed in a JLabel with <br> to make newlines
        // Note - if printing to the console instead, use \n instead of <br>
        String display=new String("<html>");
        display+="Patient: "+name+"<br>";
        display+=testdate.getDisplayText();
        for(MedicalTest vax:medicaltests){
            List<MedicalAppointment> appts=vax.getMedicalAppointment();
            for (MedicalAppointment apt:appts){
                display+=apt.getDisplayText();
            }
        }
        return display+"<br></html>";


}}

