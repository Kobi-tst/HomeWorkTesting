import org.example.AreaTr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AreaTests {
    @Test
    void positiveArea(){
        Assertions.assertEquals( 7, AreaTr.areaT(2, 7));
    }

    @Test
    void negativeH(){
        Assertions.assertEquals(null, AreaTr.areaT(-2, 7));
    }
}
