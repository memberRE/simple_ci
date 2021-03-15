import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidBoxTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getVolume() {
        CuboidBox mybox = new CuboidBox(1,2,3);
        int ret = (int)mybox.getVolume();
        Assert.assertEquals(ret, 6);

    }
}