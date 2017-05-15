/**
 * Created by darong on 5/15/17.
 */
public final class ConjuredItem extends NormalItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int getQualityChangeRate() {
        return super.getQualityChangeRate() * 2;
    }
}
