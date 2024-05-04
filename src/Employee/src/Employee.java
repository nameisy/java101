public class Employee {

    String name; // Çalışanın adı.
    double salary; // Çalışanın maaşı.
    int workHouse; // Haftalık çalışma saati.
    int hireYear; // İşe başlangıç yılı.
    int workingYear;

    public Employee(String name, double salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public int bonus() {
        int extraBonus = 0;
        if (this.workHouse > 40) {
            extraBonus = (this.workHouse - 40) * 30;
            return extraBonus;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        workingYear = hireYear - 2021;
        double raiseSalary;
        if (workingYear < 10) {
            raiseSalary = this.salary * 0.05;
        } else if (workingYear > 9 && workingYear < 20) {
            raiseSalary = this.salary * 0.10;
        } else {
            raiseSalary = this.salary * 0.15;
        }
        return raiseSalary;
    }

    public String toString() {
        double total = (salary + raiseSalary() + bonus()) - tax();
        System.out.println("\nToplam: " + total);

        return "\nName: " + name + "\nSalary: " + salary + "\nWorkHouse: " + workHouse + "\nHireYear: " + hireYear ;

    }

}
