public class HealthProfessional {
    protected int id;
    protected String name;
    protected String department;

    public HealthProfessional() {}
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}