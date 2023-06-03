package org.tms.service;

import org.tms.page.ShoppingCartPage;
import org.tms.page.InventoryPage;

public class InventoryPageService {

    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualTextOfInventoryPage() {
        return inventoryPage.getTextOfNameOfMainPageSection();
    }

    public ShoppingCartPageService addBackPackToCart(){
        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.clickAddBackPackToCartButton()
                .clickShoppingCartLink();
        return new ShoppingCartPageService();
    }
}
