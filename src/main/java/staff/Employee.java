package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private double salary;

    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public double raiseSalary(double percentage) {
        this.salary = salary + (salary * percentage / 100);
        return this.salary;

    }

        public double payBonus(){
        return salary * 0.01;
        }
    }

