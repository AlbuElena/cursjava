package curs2;

public class SalaryCalculator {
	
		int hoursWorked = 40;
		
		public static void main(String[] args) {
			
			Tester tester1 = new Tester();
			tester1.setName("Oana");
			tester1.setRatePerHour(30);
			tester1.setAge(29);
			Tester tester2 = new Tester();
			tester2.setName("Maria");
			tester2.setRatePerHour(25);
			tester2.setAge(28);
	
			System.out.println(tester1.getName());
			System.out.println(tester2.getName());
			
			//tester2.getRatePerHour();// =25
			//calculateSalary(tester1.getRatePerHour()
			//calculateSalary(300)
			
			SalaryCalculator calc = new SalaryCalculator();
			
			System.out.println("Salariul lui " + tester1.getName() + " este " + calc.calculateSalary(tester1.getRatePerHour()) );
			System.out.println(tester1.getName() + " are : " + tester1.getAge() + " ani!");
			System.out.println("Salariul lui " + tester2.getName() + " este " + calc.calculateSalary(tester2.getRatePerHour()) );
			System.out.println(tester2.getName() + " are : " + tester2.getAge() + " ani!");
					
		}
		
		public int calculateSalary(int ratePerHour) {
			int salary = ratePerHour * hoursWorked;
			return salary;
		}	

}
