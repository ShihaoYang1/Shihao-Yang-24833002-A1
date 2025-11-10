import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", "8am-4pm");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Lee", "General Medicine", "9am-5pm");
        Specialist sp1 = new Specialist(3, "Dr. Kim", "Cardiology", "Heart Specialist");
        gp1.printDetails();
        gp2.printDetails();
        sp1.printDetails();
        System.out.println("------------------------------");

        createAppointment("Alice", "0412345678", "10:00", gp1);
        createAppointment("Bob", "0412345679", "11:00", gp2);
        createAppointment("Carol", "0412345680", "12:00", sp1);
        createAppointment("Dave", "0412345681", "13:00", sp1);
        printExistingAppointments();
        cancelBooking("0412345679");
        printExistingAppointments();
        System.out.println("------------------------------");
    }

    public static void createAppointment(String patientName, String mobilePhone,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.isEmpty() ||
                mobilePhone == null || mobilePhone.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Required information missing – appointment NOT created.");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (Appointment app : appointments) {
            app.printDetails();
        }
    }

    public static void cancelBooking(String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for mobile: " + mobilePhone);
        }
    }
}