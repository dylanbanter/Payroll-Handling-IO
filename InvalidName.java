package payrollpackage;

public class InvalidName extends Exception {

	public InvalidName() {
		super("Error: Name is empty.");
	}
	public InvalidName(String Name) {
		super("Error: the name ("+ Name+") cannot be empty.");
	}
}
