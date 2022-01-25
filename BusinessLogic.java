package lastone;


public class BusinessLogic {

	public int totalBill(Patient patient) {
		int bill = patient.getBill() * 12;
		return bill;
	}

	public String doctorName(Patient patient) {
		String doctor = patient.getDoctor();
		return doctor;
	}

	public String getMedicines(Patient patient) {
		String medicines = patient.getMedicines();
		return medicines;
	}

}
