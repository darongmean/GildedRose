import static org.junit.Assert.assertEquals;

/**
 * Created by darong on 5/14/17.
 */
public abstract class UpdateQualityTest {
    protected AbstractItem item;

    protected void when_updateQuality_assert_SellInAndQuality(int expectedSellIn,
                                                              int expectedQuality) {
        item.doUpdateQuality();

        assertEquals(expectedQuality, item.getQuality());
        assertEquals(expectedSellIn, item.getSellIn());
    }
}
