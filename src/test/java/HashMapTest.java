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

    @Test
    public void putTwoElementsWithSameKeysTest() {
        hashMap.put(26, 26L);
        hashMap.put(26, 28L);
        long expected = 28L;
        Assert.assertEquals(expected, (long)hashMap.get(26));
    }

    @Test
    public void getTest() {
        hashMap.put(12, 62L);
        long expected = 62L;
        Assert.assertEquals(expected, (long)hashMap.get(12));
    }

    @Test
    public void getIfNoSuchKeyTest(){
        hashMap.put(12, 62L);
        hashMap.put(1, 6L);
        hashMap.put(3, 75L);
        hashMap.put(9, 12L);
        Assert.assertEquals(null, hashMap.get(4));
    }

    @Test
    public void sizeTest(){
        hashMap.put(12, 62L);
        hashMap.put(1, 6L);
        hashMap.put(3, 75L);
        hashMap.put(9, 12L);
        int expected = 4;
        Assert.assertEquals(expected, hashMap.size());
    }

    @Test
    public void sizeWithSomeNumberOfIdenticalKeysTest(){
        hashMap.put(12, 62L);
        hashMap.put(1, 13L);
        hashMap.put(3, 15L);
        hashMap.put(9, 16L);
        hashMap.put(1, 27L);
        hashMap.put(12, 44L);
        int expected = 4;
        Assert.assertEquals(expected, hashMap.size());
    }

    /*@Test
    public void*/


}
