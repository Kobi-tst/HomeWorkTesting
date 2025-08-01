import org.example.AreaTr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaTests {
    @Test
    void positiveArea(){
        Assert.assertEquals( 7, AreaTr.areaT(2, 7));
    }
    @Test
    void negativeH(){
        Assert.assertEquals(null, AreaTr.areaT(-2, 7));
    }
}
