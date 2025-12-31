
/**
 * Main class for Hospital Management System.
 */
public class HospitalManagementSystem {
}

/**
 * Represents a person in the hospital system.
 */
class Person {

    protected int personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;

    /**
     * Displays personal details of the person.
     */
    public void viewPersonalDetails() {
    }
}

/**
 * Represents a patient in the hospital.
 */
class Patient extends Person {

    private int patientID;

    /**
     * Books an appointment with a doctor.
     */
    public void bookAppointment() {
    }
}

/**
 * Represents a doctor in the hospital.
 */
class Doctor extends Person {

    private int doctorID;
    private String department;

    /**
     * Views patient details.
     */
    public void seePatientDetails() {
    }

    /**
     * Prescribes treatment or medication to a patient.
     */
    public void prescribeTreatment() {
    }
}

/**
 * Represents an appointment in the hospital system.
 */
class Appointment {

    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;

    /**
     * Reschedules the appointment.
     */
    public void rescheduleAppointment() {
    }

    /**
     * Cancels the appointment.
     */
    public void cancelAppointment() {
    }

    /**
     * Displays appointment details.
     */
    public void viewAppointmentDetails() {
    }
}

/**
 * Represents a treatment given to a patient.
 */
class Treatment {

    private int treatmentID;
    private String type;
    private String description;

    /**
     * Updates the treatment description.
     */
    public void updateDescription() {
    }

    /**
     * Displays treatment details.
     */
    public void viewTreatmentDetails() {
    }
}
