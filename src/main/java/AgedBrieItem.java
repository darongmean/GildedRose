public class AgedBrieItem extends AbstractItem {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int getQualityChangeRate() {
        return getSellIn() < 1 ? 2 : 1;
    }
}
