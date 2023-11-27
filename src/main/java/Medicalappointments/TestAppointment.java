package Medicalappointments;
import java.time.LocalDate;

import MedicalTests.BloodTest;
import MedicalTests.MedicalTest;
public class TestAppointment extends MedicalAppointment {
    private MedicalTest medicalTest;
    private String giver;
    public TestAppointment(MedicalTest medicalTest, LocalDate date, String giver){
        super(date);
        this.medicalTest = medicalTest ;
        this.giver = giver;
    }
    public String getDisplayText(){
        return "Test:"+ medicalTest.getName()+ ", given by: "+giver+", date "+date.toString()+", measuring parameter: "+medicalTest.getparameter()+"<br>";
    }
}