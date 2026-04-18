package Collection;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.TYPE) // type is used for class annotations
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.PARAMETER})
@interface CricketPlayer{
    String country() default "India";
    int age() default 22;
}

@CricketPlayer(country = "USA" , age = 30)
class RohitSharma{
    private int matches;

    @CricketPlayer
    public RohitSharma(){

    }
    void setMatch(@CricketPlayer int matches){
        this.matches = matches;
    }
}

public class CustomAnnotation {
    public static void main(String[] args) {
        RohitSharma rohit = new RohitSharma();
        Class<? extends RohitSharma>cls = rohit.getClass();
        CricketPlayer ann = cls.getAnnotation(CricketPlayer.class);
        String s = ann.country();
        System.out.println(s);
        int n = ann.age();
        System.out.println(n);
    }
}
