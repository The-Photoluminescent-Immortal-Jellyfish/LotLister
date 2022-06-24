package backend.models;

import java.util.ArrayList;
import java.util.List;

public class listLotsDao implements backend.models.ads {
    private List<lot> ads;

    public List<lot> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }
    public int insert(lot ad) {
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
    private List<lot> generateAds() {
        List<lot> ads = new ArrayList<>();
        ads.add(new lot(
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