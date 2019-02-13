import java.util.ArrayList;
import java.util.Collections;

public class GiftDatabase extends Gift {
    private ArrayList<Gift> gifts;

    public GiftDatabase(){
        gifts = new ArrayList<>();
    }

    public void setGifts(ArrayList<Gift> gifts) {
        Collections.addAll(gifts,new Gift("Playstation","Male","Medium"),new Gift("Guitar","Male","Medium"),
                new Gift("Shoes","Male","Low"),new Gift("Books","Male","Low"),new Gift("Apple Watch","Male","High"),
                new Gift("Smart TV","Male","High"),new Gift("Sweater","Female","Medium"),new Gift("Perfume","Female","Medium"),
                new Gift("Wine Bottle","Female","Low"),new Gift ("Selfie Stick","Female","Low"),
                new Gift ("Weekend Getaway","Female","High"),new Gift("Jewelry","Female","High"));
        this.gifts = gifts;
    }

    public ArrayList<Gift> getGifts() {
        return gifts;
    }
}
