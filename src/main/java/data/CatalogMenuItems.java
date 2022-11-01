package data;

import java.util.ArrayList;
import java.util.List;

public class CatalogMenuItems {

    public static List<String> menuItemsTemplate() {
        List<String> menuItemsTemplate = new ArrayList<>();
        menuItemsTemplate.add("Onlíner Prime");
        menuItemsTemplate.add("Электроника");
        menuItemsTemplate.add("Компьютеры и сети");
        menuItemsTemplate.add("Бытовая техника");
        menuItemsTemplate.add("Стройка и ремонт");
        menuItemsTemplate.add("Дом и сад");
        menuItemsTemplate.add("Авто и мото");
        menuItemsTemplate.add("Красота и спорт");
        menuItemsTemplate.add("Детям и мамам");
        menuItemsTemplate.add("Работа и офис");
        return menuItemsTemplate;
    }

    public static List<String> computerAndNetworkMenuItemsTemplate() {
        List<String> computerAndNetworkMenuItems = new ArrayList<>();
        computerAndNetworkMenuItems.add("Ноутбуки");
        computerAndNetworkMenuItems.add("Мониторы");
        computerAndNetworkMenuItems.add("SSD");
        computerAndNetworkMenuItems.add("Видеокарты в наличии");
        computerAndNetworkMenuItems.add("Оперативная память");
        computerAndNetworkMenuItems.add("Игровые компьютеры");
        return computerAndNetworkMenuItems;

    }


}
