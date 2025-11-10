public class GeneralPractitioner extends HealthProfessional {
    private String clinicHours;

    public GeneralPractitioner() {}
    public GeneralPractitioner(int id, String name, String department, String clinicHours) {
        super(id, name, department);
        this.clinicHours = clinicHours;
    }
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Hours: " + clinicHours);
    }
}