package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private Double salary;

    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee(String name, int NI, Double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public Double raiseSalary(Double salary) {
        this.salary = salary + (salary * 0.1);
        return this.salary;

    }

        public Double payBonus(){
        return salary * 0.01;
        }
    }

