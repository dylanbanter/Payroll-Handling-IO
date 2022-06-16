package payrollpackage;

public class InvalidHoursWorked extends Exception {

	public InvalidHoursWorked() {
		super("Error: invalid hours worked."); 
	}
	public InvalidHoursWorked(int HoursWorked) {
		super("Error: the hourly pay ("+HoursWorked+") cannot be negative or greater than 84.");
	}
}
