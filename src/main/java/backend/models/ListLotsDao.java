package backend.models;

import java.util.ArrayList;
import java.util.List;

public class ListLotsDao implements Ads {
    private List<Lot> ads;

    public List<Lot> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public int insert(Lot ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the dao would handle this
        ad.setId((int) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Lot> generateAds() {
        List<Lot> ads = new ArrayList<>();
        ads.add(new Lot(
        ));
        return ads;
    }
}
//        ads.add(new LOT(
//            2,
//            1,
//            "Super Nintendo",
//            "Get your game on with this old-school classic!"
//        ));
//        ads.add(new LOT(
//            3,
//            2,
//            "Junior Java Developer Position",
//            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//        ));
//        ads.add(new LOT(
//            4,
//            2,
//            "JavaScript Developer needed",
//            "Must have strong Java skills"
//        ));