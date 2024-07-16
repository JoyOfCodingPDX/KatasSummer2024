package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private static GildedRose addItemAndUpdateQuality(String itemName, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(itemName, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }

    @Test
    void itemNameIsRetainedAtEndOfDay() {
        String itemName = "foo";
        GildedRose app = addItemAndUpdateQuality(itemName, 0, 0);
        assertThat(app.items[0].name, equalTo(itemName));
    }

    @Test
    void itemQualityDecreasesByOneAtTheEndOfTheDay() {
        GildedRose app = addItemAndUpdateQuality("Item", 10, 20);
        assertThat(app.items[0].sellIn, equalTo(9));
        assertThat(app.items[0].quality, equalTo(19));
    }

    @Test
    void agedBrieIncreasesInQualityAtTheEndOfTheDay() {
        GildedRose app = addItemAndUpdateQuality("Aged Brie", 2, 0);
        assertThat(app.items[0].sellIn, equalTo(1));
        assertThat(app.items[0].quality, equalTo(1));
    }

    @Test
    void qualityOfAgedBrieNeverExceeds50() {
        GildedRose app = addItemAndUpdateQuality("Aged Brie", 2, 50);
        assertThat(app.items[0].sellIn, equalTo(1));
        assertThat(app.items[0].quality, equalTo(50));
    }

    @Disabled
    @Test
    void qualityOfConjuredItemDecreasesByTwoAtEndOfTheDay() {
        GildedRose app = addItemAndUpdateQuality("Conjured Item", 3, 6);
        assertThat(app.items[0].sellIn, equalTo(2));
        assertThat(app.items[0].quality, equalTo(4));
    }

    @Test
    void qualityOfBackstagePassIsZeroAfterDayOfConcert() {
        GildedRose app = addItemAndUpdateQuality("Backstage passes to a TAFKAL80ETC concert", 0, 57);
        assertThat(app.items[0].sellIn, equalTo(-1));
        assertThat(app.items[0].quality, equalTo(0));
    }

    @Test
    void qualityOfItemDecreasesByTwoAfterItsSellByDateHasPassed() {
        GildedRose app = addItemAndUpdateQuality("Item", 0, 20);
        assertThat(app.items[0].sellIn, equalTo(-1));
        assertThat(app.items[0].quality, equalTo(18));
    }
}
