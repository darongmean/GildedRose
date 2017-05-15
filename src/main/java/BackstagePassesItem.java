public class BackstagePassesItem extends AbstractItem {
    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int getQualityChangeRate() {
        int qualityChangeRate = 1;
        if (getSellIn() <= 10) {
            qualityChangeRate = 2;
        }
        if (getSellIn() <= 5) {
            qualityChangeRate = 3;
        }
        if (getSellIn() <= 0) {
            qualityChangeRate = 0 - getQuality();
        }

        return qualityChangeRate;
    }
}
