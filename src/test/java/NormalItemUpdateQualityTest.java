import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by darong on 5/14/17.
 */
public class NormalItemUpdateQualityTest extends UpdateQualityTest {

    private final int someQuality = 3;
    private final int someSellIn = 1;

    @Test
    public void test_QualityDegrade_AsItGetsOlder() {
        item = createDexterityVestItem(someSellIn, someQuality);
        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, someQuality - 1);
    }

    @Test
    public void test_QualityDegradeTwice_IfSellByDateHasPassed() {
        int dateHasPassedSellIn = 0;
        item = createDexterityVestItem(dateHasPassedSellIn, someQuality);

        when_updateQuality_assert_SellInAndQuality(dateHasPassedSellIn - 1, someQuality - 2);
    }

    @Test
    public void test_QualityNeverNegative() {
        int minimumQuality = 0;
        item = createDexterityVestItem(someSellIn, minimumQuality);

        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, minimumQuality);
    }

    private AbstractItem createDexterityVestItem(int sellIn, int quality) {
        return ItemFactory.createItem("+5 Dexterity Vest", sellIn, quality);
    }
}
