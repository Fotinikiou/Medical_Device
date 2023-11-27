package MedicalTests;
import java.time.LocalDate;
import Medicalappointments.*;
import java.util.List;
public abstract class MedicalTest {
    protected LocalDate DateOfTest;
    protected String name;
    private String parameter;
    public MedicalTest(String name, LocalDate DateOfTest, String parameter){
        this.name = name;
        this.DateOfTest = DateOfTest;
        this.parameter = parameter ;
    }
    public String getName(){
        return name;
    }
    public String getparameter(){
        return parameter;
    }
    public abstract List<MedicalAppointment> getMedicalAppointment();
}
