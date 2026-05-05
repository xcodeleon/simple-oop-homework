package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter @Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Employee extends Person {

     String company;
     String position;
     double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}
