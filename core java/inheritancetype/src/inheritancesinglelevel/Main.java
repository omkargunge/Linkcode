package inheritancesinglelevel;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();

        doctor.open();   // inherited from Hospital
        doctor.treat();  // Doctor's own method
    }
}