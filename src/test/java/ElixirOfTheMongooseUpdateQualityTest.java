import org.junit.Test;

/**
 * Created by darong on 5/14/17.
 */
public class ElixirOfTheMongooseUpdateQualityTest extends UpdateQualityTest {

    private final int someQuality = 3;
    private final int someSellIn = 1;

    @Test
    public void test_QualityDegrade_AsItGetsOlder() {
        item = ItemFactory.createElixirTheMongoose(someSellIn, someQuality);
        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, someQuality - 1);
    }

    @Test
    public void test_QualityDegradeTwice_IfSellByDateHasPassed() {
        int dateHasPassedSellIn = 0;
        item = ItemFactory.createElixirTheMongoose(dateHasPassedSellIn, someQuality);

        when_updateQuality_assert_SellInAndQuality(dateHasPassedSellIn - 1, someQuality - 2);
    }

    @Test
    public void test_QualityNeverNegative() {
        int minimumQuality = 0;
        item = ItemFactory.createElixirTheMongoose(someSellIn, minimumQuality);

        when_updateQuality_assert_SellInAndQuality(someSellIn - 1, minimumQuality);
    }
}
