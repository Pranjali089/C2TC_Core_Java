package annotations;
import java.lang.annotation.Retention;
@Retension(RetensionPolicy.RUNTIME)
public @interface SmartPhone 
{
    String os () default "symbian";
    int version() default 1;
}
