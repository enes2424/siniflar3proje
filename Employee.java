public class Employee {
	String name;
	double salary; 
	int workHours, hireYear;
	
	Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if (salary <= 1000) return 0;
		return salary * 0.03;
	}
	
	double bonus() {
		if (workHours <= 40) return 0;
		return (workHours - 40) * 30;
	}
	
	double raiseSalary() {
		int workYears = 2021 - hireYear;
		if (workYears < 10) return salary * 0.05;
		if (workYears < 20) return salary * 0.1;
		return salary * 0.15;
	}
	
	public String toString() {
		return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()) + "\nToplam Maaş : " + (salary + raiseSalary());
	}
	
}