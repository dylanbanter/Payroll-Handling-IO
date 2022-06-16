package payrollpackage;
public class Payroll {
	private String Name;
	private int IDNumber;
	private int HoursWorked;
	private double HourlyPay;
	/** Empty constructor to instantiate a new instance */
	public Payroll() {}
	
	/** Constructor for parameters */
	public Payroll(String Name, int IDNumber, int HoursWorked, double HourlyPay) {}
	
	/** Set Methods 
	 * If name is empty */
	public void setName(String Name) throws InvalidName {
		if (Name.equalsIgnoreCase("")) {
			throw new InvalidName(Name);
		} else {
		this.Name = Name;
		}
	}
	
	/** If ID Number is a negative number or 0*/
	public void setIDNumber(int IDNumber) throws InvalidIDNumber {
		if (IDNumber <= 0) {
			throw new InvalidIDNumber(IDNumber);
		} else {
			this.IDNumber = IDNumber;
		}
	}
	/** Hours worked is negative or greater than 84 */
	public void setHoursWorked(int HoursWorked) throws InvalidHoursWorked {
		if (HoursWorked < 0 || HoursWorked > 84) {
			throw new InvalidHoursWorked(HoursWorked);
		} else {
		this.HoursWorked = HoursWorked;
		}
	}
	
	/** If pay is negative or greater than 25 */
	public void setHourlyPay(double HourlyPay) throws InvalidHourlyPay {
		if (HourlyPay < 0 || HourlyPay > 25) {
			throw new InvalidHourlyPay(HourlyPay);
		} else {
		this.HourlyPay = HourlyPay;
		}
	}
	
	/** Get methods */
	public String getName() {return Name;}
	public int getIDNumber() {return IDNumber;}
	public int getHoursWorked() {return HoursWorked;}
	public double getHourlyPay() {return HourlyPay;}
	public double getGrossPay () {return HourlyPay * HoursWorked;}
	
	public String showInfo() {
		return "The gross pay of " + Name + " is " + getGrossPay();

	}

}
