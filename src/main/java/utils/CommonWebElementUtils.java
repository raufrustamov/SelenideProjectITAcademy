package utils;

import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;
import java.util.List;

public class CommonWebElementUtils {
    public  List<String> getTextsFromWebElements(ElementsCollection values){
        List<String> itemCatalog = new ArrayList<>();
        values.stream().forEach(webElement ->{
            if (!webElement.getText().isEmpty()) {
                itemCatalog.add(webElement.getText());
            }});
        return itemCatalog;
    }

}
