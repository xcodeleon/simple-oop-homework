package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleManager extends Employee {

    double totalSales;
    double bonus;

    public SaleManager(String name, int age, boolean married,
                       String company, String position, double baseSalary,
                       double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (totalSales * bonus / 100);
    }
}
