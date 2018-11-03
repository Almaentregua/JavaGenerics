package javagenerics;

import javagenerics.domain.Candy;
import javagenerics.services.implementations.BagOfItems;

public class Application {
    public static void main(String[] args){

        Candy candy = new Candy();
        candy.setName("chocolate");
        candy.setExpiration("april 2020");

        Candy candy2 = new Candy();
        candy2.setName("bobon");
        candy2.setExpiration("November 2021");

        BagOfItems<Candy> bagOfItems = new BagOfItems<Candy>();
        bagOfItems.addElement(candy);
        bagOfItems.addElement(candy2);

        for (Candy element: bagOfItems
             ) {
            System.out.println(element.getName());
        }
    }
}
