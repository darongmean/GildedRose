/**
 * Created by darong on 5/14/17.
 */
public class ItemFactory {
    public static AbstractItem createItem(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return createAgedBrie(sellIn, quality);
        }
        if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            return createBackstagePasses(sellIn, quality);
        }
        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
            return createSulfuras(sellIn);
        }

        return createNormalItem(name, sellIn, quality);
    }

    public static AbstractItem createDexterityVest(int sellIn, int quality) {
        return createItem("+5 Dexterity Vest", sellIn, quality);
    }

    public static AgedBrieItem createAgedBrie(int sellIn, int quality) {
        return new AgedBrieItem("Aged Brie", sellIn, quality);
    }

    public static AbstractItem createElixirTheMongoose(int sellIn, int quality) {
        return createItem("Elixir of the Mongoose", sellIn, quality);
    }

    public static SulfurasItem createSulfuras(int sellIn) {
        return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    public static BackstagePassesItem createBackstagePasses(int sellIn, int quality) {
        return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createConjured(int sellIn, int quality) {
        return createItem("Conjured Mana Cake", sellIn, quality);
    }

    public static NormalItem createNormalItem(String name, int sellIn, int quality) {
        return new NormalItem(name, sellIn, quality);
    }

}
