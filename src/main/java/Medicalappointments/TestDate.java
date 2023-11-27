package Medicalappointments;
import java.time.LocalDate;
public class TestDate extends MedicalAppointment {
    public TestDate(LocalDate date){
        super(date);

    }
    public String getDisplayText(){
        return "Test date on "+date.toString()+"<br>";
    }
}
