import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class GildedRoseTest {
    @Test
    public void testDexterityVestItem() {
        Item dexterityVestItem = new Item("+5 Dexterity Vest", 10, 20);

        GildedRose.updateQuality(dexterityVestItem);

        assertEquals(dexterityVestItem.getQuality(), 19);
        assertEquals(dexterityVestItem.getSellIn(), 9);
    }

    @Test
    public void testAgedBrie() {
        Item agedBrieItem = new Item("Aged Brie", 2, 0);

        GildedRose.updateQuality(agedBrieItem);

        assertEquals(agedBrieItem.getQuality(), 1);
        assertEquals(agedBrieItem.getSellIn(), 1);
    }

    @Test
    public void testElixirOfTheMongoose() {
        Item elixirOfTheMongooseItem = new Item("Elixir of the Mongoose", 5, 7);

        GildedRose.updateQuality(elixirOfTheMongooseItem);

        assertEquals(elixirOfTheMongooseItem.getQuality(), 6);
        assertEquals(elixirOfTheMongooseItem.getSellIn(), 4);
    }

    @Test
    public void testSulfuras() {
        Item sulfurasItem = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        GildedRose.updateQuality(sulfurasItem);

        assertEquals(sulfurasItem.getQuality(), 80);
        assertEquals(sulfurasItem.getSellIn(), 0);
    }

    @Test
    public void testBackstage() {
        Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

        GildedRose.updateQuality(backstageItem);

        assertEquals(backstageItem.getQuality(), 21);
        assertEquals(backstageItem.getSellIn(), 14);
    }

    @Test
    public void testConjuredManaCake() {
        Item conjuredManaCakeItem = new Item("Conjured Mana Cake", 3, 6);

        GildedRose.updateQuality(conjuredManaCakeItem);

        assertEquals(conjuredManaCakeItem.getQuality(), 5);
        assertEquals(conjuredManaCakeItem.getSellIn(), 2);
    }
}
