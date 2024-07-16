package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void itemNameIsRetainedAtEndOfDay() {
        String itemName = "foo";
        GildedRose app = addItem(itemName, 0, 0);
        assertThat(app.items[0].name, equalTo(itemName));
    }

    @Test
    void itemQualityDecreasesByOneAtTheEndOfTheDay() {
        String itemName = "Item";
        int sellIn = 10;
        int quality = 20;
        GildedRose app = addItem(itemName, sellIn, quality);
        assertThat(app.items[0].sellIn, equalTo(9));
        assertThat(app.items[0].quality, equalTo(19));
    }

    private static GildedRose addItem(String itemName, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(itemName, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }

}
