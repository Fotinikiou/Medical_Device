package Medicalappointments;
import java.time.LocalDate;
public abstract class MedicalAppointment {

    protected LocalDate date;

    public MedicalAppointment(LocalDate date){
        this.date = date;
    }
    public abstract String getDisplayText();
}
