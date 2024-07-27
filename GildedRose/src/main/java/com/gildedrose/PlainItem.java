package com.gildedrose;

public class PlainItem extends Item {
  public PlainItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  public void updateQuality() {
    this.sellIn--;
    if (this.sellIn < 0) {
      decrementQuality(2);

    } else {
      decrementQuality(1);
    }
  }

  private void decrementQuality(int decrement) {
    if (this.quality > 0) {
      this.quality -= decrement;
    }
  }
}
