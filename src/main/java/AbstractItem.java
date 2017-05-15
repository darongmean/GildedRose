/**
 * Created by darong on 5/15/17.
 */
public abstract class AbstractItem extends Item implements UpdateQuality {

    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
        int qualityChanged = getQuality() + getQualityChangeRate();
        qualityChanged = qualityChanged > 50 ? 50 : qualityChanged;
        qualityChanged = qualityChanged < 0 ? 0 : qualityChanged;

        setQuality(qualityChanged);
        setSellIn(getSellIn() - 1);
    }

    protected int getQualityChangeRate() {
        return 0;
    }
}
