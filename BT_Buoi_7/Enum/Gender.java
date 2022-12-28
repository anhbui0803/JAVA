
package Enum;
import java.util.*;

public enum Gender {
    MALE(0),
    FEMALE(1),
    OTHER(2);

    public final int gender;

    private Gender(int k) {
        this.gender = k;
    }

    public static Gender getGender(int k) {
        for (Gender i : Gender.values()) {
            if (i.gender == k) {
                return i;
            }
        }
        return null;
    }
}
