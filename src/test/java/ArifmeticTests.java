import org.example.Arifmetic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArifmeticTests {
    @Test
    void positiveSum(){
        Assert.assertEquals(15,Arifmetic.sum(10,5));
    }

    @Test
    void negativeCh(){
        Assert.assertEquals(0,Arifmetic.ch(10,0));
    }
}
