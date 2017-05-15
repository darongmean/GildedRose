/**
 * Created by darong on 5/14/17.
 */
public class ItemFactory {
    public static AbstractItem createItem(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrieItem("Aged Brie", sellIn, quality);
        }
        if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        }
        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
            return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, 80);
        }
        if("Conjured Mana Cake".equals(name)){
            return new ConjuredItem("Conjured Mana Cake", sellIn, quality);
        }

        return new NormalItem(name, sellIn, quality);
    }

    public static AbstractItem createAgedBrie(int sellIn, int quality) {
        return createItem("Aged Brie", sellIn, quality);
    }

    public static AbstractItem createSulfuras(int sellIn) {
        return createItem("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    public static AbstractItem createBackstagePasses(int sellIn, int quality) {
        return createItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static AbstractItem createConjured(int sellIn, int quality) {
        return createItem("Conjured Mana Cake", sellIn, quality);
    }
}
