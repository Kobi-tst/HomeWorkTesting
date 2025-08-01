import org.example.EqualsAB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsAbTests {

    @Test
    void positiveAB(){
        Assertions.assertEquals(true, EqualsAB.equalsAB(10,5));
        Assertions.assertEquals(true, EqualsAB.equalsAB(10,20));
        Assertions.assertEquals(true, EqualsAB.equalsAB(10,10));
    }

}
