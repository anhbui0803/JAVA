
import Enum.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        
        Person person = new Person("Quoc Anh", "11210275", 20, 0, 1, 0);
        System.out.println(person.getName());
        System.out.println(person.getId());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getPos());
        System.out.println(person.getType());
    }
}