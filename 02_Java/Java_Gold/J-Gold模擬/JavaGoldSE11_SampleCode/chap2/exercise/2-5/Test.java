import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
Åy   á@   Åz
public @interface Test {
    String[] value();
}