package bit.javaoop;

public class Employee extends AbstractEmployee {


    Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public boolean isSatisfied() {
        return getSalary() > 10_000;
    }

}
