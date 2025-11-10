public class Specialist extends HealthProfessional {
    private String specialty;

    public Specialist() {}
    public Specialist(int id, String name, String department, String specialty) {
        super(id, name, department);
        this.specialty = specialty;
    }
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Specialist");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}