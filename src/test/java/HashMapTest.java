import com.ovenko.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by Bogdan on 25.05.2017.
 */
public class HashMapTest {

    private HashMap<Integer, Long> hashMap;

    @Before
    public void init() {
        hashMap = new HashMap<Integer, Long>();
    }

    @Test
    public void putTest() {
        Assert.assertEquals(26L, (long)hashMap.put(26, 26L));
    }

}
