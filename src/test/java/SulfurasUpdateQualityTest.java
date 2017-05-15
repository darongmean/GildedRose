import org.junit.Test;

/**
 * Created by darong on 5/14/17.
 */
public class SulfurasUpdateQualityTest extends UpdateQualityTest {

    @Test
    public void test_QualityIsAlways80_AndNeverBeSold() {
        int someSellIn = 1;
        item = ItemFactory.createSulfuras(someSellIn);
        
        when_updateQuality_assert_SellInAndQuality(someSellIn, 80);
    }
}
