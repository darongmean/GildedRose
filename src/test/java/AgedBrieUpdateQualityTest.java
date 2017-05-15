import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by darong on 5/14/17.
 */
public class AgedBrieUpdateQualityTest extends UpdateQualityTest {
    private final int someQuality = 3;
    private final int someSellIn = 1;

    @Test
    public void test_QualityIncrease_AsItGetsOlder() {
        item = ItemFactory.createAgedBrie(someSellIn, someQuality);
        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, someQuality + 1);
    }

    @Test
    public void test_QualityIncreaseTwice_IfSellByDateHasPassed() {
        int dateHasPassedSellIn = 0;
        item = ItemFactory.createAgedBrie(dateHasPassedSellIn, someQuality);

        when_updateQuality_assert_SellInAndQuality(dateHasPassedSellIn - 1, someQuality + 2);
    }

    @Test
    public void test_QualityNeverMoreThan50() {
        int maximumQuality = 50;
        item = ItemFactory.createAgedBrie(someSellIn, maximumQuality);

        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, maximumQuality);
    }
}
