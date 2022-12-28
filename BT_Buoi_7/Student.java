
import Enum;
import java.util.*;

public class Student extends Person { 
    private String _class;

    public Student() {
        super();
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
    
}
