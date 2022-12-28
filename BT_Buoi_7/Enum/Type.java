
package Enum;
import java.util.*;

public enum Type {
    CQ(0),
    CLC(1);

    public final int type;

    private Type(int k) {
        this.type = k;
    }

    public static Type getType(int k) {
        for (Type i : Type.values()) {
            if (i.type == k) {
                return i;
            }
        }
        return null;
    }
}
