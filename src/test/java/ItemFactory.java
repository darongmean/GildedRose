/**
 * Created by darong on 5/14/17.
 */
public class ItemFactory {
    public static Item createItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    public static Item createDexterityVest(int sellIn, int quality) {
        return createItem("+5 Dexterity Vest", sellIn, quality);
    }

    public static Item createAgedBrie(int sellIn, int quality) {
        return createItem("Aged Brie", sellIn, quality);
    }

    public static Item createElixirTheMongoose(int sellIn, int quality) {
        return createItem("Elixir of the Mongoose", sellIn, quality);
    }

    public static Item createSulfuras(int sellIn) {
        return createItem("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    public static Item createBackstagePasses(int sellIn, int quality) {
        return createItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createConjured(int sellIn, int quality) {
        return createItem("Conjured Mana Cake", sellIn, quality);
    }
}
