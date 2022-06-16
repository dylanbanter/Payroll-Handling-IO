package payrollpackage;

public class PayrollDemo {

	public static void main(String[] args) {
		Payroll pay1 = new Payroll();
		try {	
			pay1.setName("Dylan");
			pay1.setIDNumber(3);
			pay1.setHoursWorked(40);
			pay1.setHourlyPay(45);
		} catch (InvalidName | InvalidIDNumber | InvalidHoursWorked | InvalidHourlyPay e) {
			System.out.println(e.getMessage());
		}
		System.out.println(pay1.showInfo());


	}

}
