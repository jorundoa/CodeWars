import static org.junit.Assert.*;
import org.junit.Test;

public class KeypadTest
{
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }

    @Test
    public void test(){
        assertEquals(55, Keypad.presses("qdbPpm:KYvVIigEJi$jLr$SsCLe"));

    }

}