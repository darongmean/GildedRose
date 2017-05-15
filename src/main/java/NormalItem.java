public class NormalItem extends AbstractItem {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int getQualityChangeRate() {
        return getSellIn() < 1 ? -2 : -1;
    }
}
