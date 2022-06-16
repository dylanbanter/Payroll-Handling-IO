package payrollpackage;

public class InvalidHourlyPay extends Exception {

	public InvalidHourlyPay() {
		super("Error: invalid hourly pay."); 
	}
	public InvalidHourlyPay(double HourlyPay) {
		super("Error: the hourly pay ("+HourlyPay+") cannot be negative or greater than 25.");
	}
}
