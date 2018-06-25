import org.junit.Test;

import static org.junit.Assert.*;

public class DummyClassTest {

    DummyClass dc = new DummyClass();


    @Test
    public void getValue() {
        assertEquals(dc.getValue(),5);
    }
}