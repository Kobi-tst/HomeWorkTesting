import org.example.Arifmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArifmeticTests {
    @Test
    void positiveSum(){
        Assertions.assertEquals(15,Arifmetic.sum(10,5));
    }

    @Test
    void negativeCh(){
        Assertions.assertEquals(0,Arifmetic.ch(10,0));
    }
}
