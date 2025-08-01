import org.example.EqualsAB;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EqualsAbTests {

    @Test
    void positiveAB(){
        Assert.assertEquals(true, EqualsAB.equalsAB(10,5));
        Assert.assertEquals(true, EqualsAB.equalsAB(10,20));
        Assert.assertEquals(true, EqualsAB.equalsAB(10,10));
    }

}