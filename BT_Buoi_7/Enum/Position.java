
package Enum;
import java.util.*;

public enum Position {
    TEACHER(0),
    STUDENT(1),
    GUARD(2);

    public final int pos;

    private Position(int k) {
        this.pos = k;
    }

    public static Position getPosition(int k) {
        for (Position i : Position.values()) {
            if (i.pos == k) {
                return i;
            }
        }
        return null;
    }
}
