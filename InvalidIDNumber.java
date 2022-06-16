package payrollpackage;

public class InvalidIDNumber extends Exception {

	public InvalidIDNumber() {
		super("Error: ID Numbers cannot be negative or equal to 0.");
	}
	public InvalidIDNumber(int IDNumber) {
		super("Error: ID Number ("+IDNumber+") cannot be negative or greater than 84.");
	}
}
