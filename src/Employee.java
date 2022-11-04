public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double sum = 0.0;
        if (this.salary > 1000) {
           sum = this.salary * 3 / 100;
        }
        return sum;
    }

    public int bonus() {
        int mesai = workHours - 40;
        int sum = 0;
        if (workHours > 40) {
            for (int i = 0;i < mesai;i++) {
                sum = sum + 30;
            }

        }
        return sum;
    }

    public int raiseSalary() {
        int zam = 0;
        if (this.hireYear < 10) {
            zam += (this.salary * 5 / 100);
        }
        if (this.hireYear > 10 && this.hireYear < 19) {
            zam += (this.salary * 10 / 100);
        }
        if (this.hireYear > 19) {
            zam += (this.salary * 15 / 100);
        }
        return zam;
    }

    public String toString() {
        double total = this.salary + bonus() + raiseSalary() - tax();
        double totalMax = this.salary + bonus() + raiseSalary();
        System.out.println("Adı :" + this.name);
        System.out.println("Maası :" + this.salary);
        System.out.println("Çalışma saati :" + this.workHours);
        System.out.println("Başlangıç yılı :" + this.hireYear);
        System.out.println("Vergi" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maaş artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş :"+total);
        System.out.println("Toplam maaş" + totalMax);
       // return "" +this.name + " " + this.salary + " " + this.workHours + " " + this.hireYear + " " + t
        return this.name;
    }

}
