import org.junit.Test;

/**
 * Created by darong on 5/14/17.
 */
public class BackstagePassesUpdateQualityTest extends UpdateQualityTest {
    private final int someQuality = 3;

    @Test
    public void test_QualityIncrease_AsItGetsOlder() {
        int sellInLongerThan10 = 11;
        item = ItemFactory.createBackstagePasses(sellInLongerThan10, someQuality);

        when_updateQuality_assert_SellInAndQuality(sellInLongerThan10 - 1, someQuality + 1);
    }

    @Test
    public void test_QualityIncreaseBy2_IfThereAre10DaysOrLess() {
        int sellIn10DaysOrLess = 10;
        item = ItemFactory.createBackstagePasses(sellIn10DaysOrLess, someQuality);

        when_updateQuality_assert_SellInAndQuality(sellIn10DaysOrLess - 1, someQuality + 2);
    }

    @Test
    public void test_QualityIncreaseBy3_IfThereAre5DaysOrLess() {
        int sellIn5DaysOrLess = 5;
        item = ItemFactory.createBackstagePasses(sellIn5DaysOrLess, someQuality);

        when_updateQuality_assert_SellInAndQuality(sellIn5DaysOrLess - 1, someQuality + 3);
    }

    @Test
    public void test_QualityDropToZero_AfterTheConcert() {
        int sellInHasPassed = 0;
        item = ItemFactory.createBackstagePasses(sellInHasPassed, someQuality);

        when_updateQuality_assert_SellInAndQuality(sellInHasPassed - 1, 0);
    }

    @Test
    public void test_QualityNeverMoreThan50() {
        int maximumQuality = 50;
        int sellInLongerThan10 = 11;
        item = ItemFactory.createBackstagePasses(sellInLongerThan10, maximumQuality);

        when_updateQuality_assert_SellInAndQuality(sellInLongerThan10 - 1, maximumQuality);
    }
}
