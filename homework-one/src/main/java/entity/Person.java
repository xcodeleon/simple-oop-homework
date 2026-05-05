package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter @Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
public abstract class Person {
     String name;
     int age;
     boolean married;

    public void display() {
        System.out.println(this);
    }
}
