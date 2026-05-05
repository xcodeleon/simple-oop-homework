package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WageEmployee extends Employee {

    double hours;
    double wage;

    public WageEmployee(String name, int age, boolean married,
                        String company, String position, double baseSalary,
                        double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hours * wage);
    }
}
