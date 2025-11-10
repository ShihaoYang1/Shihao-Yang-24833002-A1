public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {}
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }
    public void printDetails() {
        System.out.println("=== Appointment ===");
        System.out.println("Patient: " + patientName);
        System.out.println("Mobile : " + mobilePhone);
        System.out.println("Time   : " + timeSlot);
        System.out.print("Doctor : ");
        doctor.printDetails();
        System.out.println("==================");
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
}