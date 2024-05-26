package doctors;

public class Patient {
	public String name, disease, appointmentNum, contactNumber;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDisease() {
		return disease;
	}

	public void appointmentNum(String appointmentNum) {
		this.appointmentNum = appointmentNum;
	}

	public String appointmentNum() {
		return appointmentNum;
	}

	public void contactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String contactNumber() {
		return contactNumber;
	}

}
