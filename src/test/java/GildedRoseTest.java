import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class GildedRoseTest {

    private ArrayList<Item> items;

    @Before
    public void setUp() throws Exception {
        items = new ArrayList<Item>();
    }

    @Test
    public void testDexterityVestItem() {
        Item dexterityVestItem = new Item("+5 Dexterity Vest", 10, 20);
        items.add(dexterityVestItem);

        GildedRose.updateQuality(items);

        assertEquals(dexterityVestItem.getQuality(), 19);
        assertEquals(dexterityVestItem.getSellIn(), 9);
    }

    @Test
    public void testAgedBrie() {
        Item agedBrieItem = new Item("Aged Brie", 2, 0);
        items.add(agedBrieItem);

        GildedRose.updateQuality(items);

        assertEquals(agedBrieItem.getQuality(), 1);
        assertEquals(agedBrieItem.getSellIn(), 1);
    }

    @Test
    public void testElixirOfTheMongoose() {
        Item elixirOfTheMongooseItem = new Item("Elixir of the Mongoose", 5, 7);
        items.add(elixirOfTheMongooseItem);

        GildedRose.updateQuality(items);

        assertEquals(elixirOfTheMongooseItem.getQuality(), 6);
        assertEquals(elixirOfTheMongooseItem.getSellIn(), 4);
    }

    @Test
    public void testSulfuras() {
        Item sulfurasItem = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        items.add(sulfurasItem);

        GildedRose.updateQuality(items);

        assertEquals(sulfurasItem.getQuality(), 80);
        assertEquals(sulfurasItem.getSellIn(), 0);
    }

    @Test
    public void testBackstage() {
        Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        items.add(backstageItem);

        GildedRose.updateQuality(items);

        assertEquals(backstageItem.getQuality(), 21);
        assertEquals(backstageItem.getSellIn(), 14);
    }

    @Test
    public void testConjuredManaCake() {
        Item conjuredManaCakeItem = new Item("Conjured Mana Cake", 3, 6);
        items.add(conjuredManaCakeItem);

        GildedRose.updateQuality(items);

        assertEquals(conjuredManaCakeItem.getQuality(), 5);
        assertEquals(conjuredManaCakeItem.getSellIn(), 2);
    }
}
