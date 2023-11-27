package MedicalTests;
import java.util.ArrayList;
import java.util.List;
import Medicalappointments.*;
import java.time.LocalDate;
public class BloodTest extends MedicalTest{
    public BloodTest(){
        super("BloodTest",LocalDate.now(), "Glucoselevel");
    }
    public List<MedicalAppointment > getMedicalAppointment(){
        ArrayList<MedicalAppointment> appointments = new ArrayList<MedicalAppointment>();
        String giver = "Nurse";
        LocalDate date = DateOfTest;
        appointments.add(new TestAppointment(this , date, giver));
        return appointments;
    }

}
