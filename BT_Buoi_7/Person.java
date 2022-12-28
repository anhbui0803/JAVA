
import Enum.*;
import java.util.*;

public class Person {
    String name, id;
    int age;
    Gender gender;
    Position pos;
    Type type;

    public Person() {}

    public Person(String name, String id, int age, int i, int j, int k) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = Gender.getGender(i);
        this.pos = Position.getPosition(j);
        this.type = Type.getType(k);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public Position getPos() {
        return pos;
    }

    public Type getType() {
        return type;
    }

}
