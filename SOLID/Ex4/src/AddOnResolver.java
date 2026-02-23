import java.util.*;

public class AddOnResolver {

    public List<AddOnPricing> resolve(List<AddOn> addOns) {

        List<AddOnPricing> list = new ArrayList<>();

        for (AddOn a : addOns) {

            if (a == AddOn.LAUNDRY)
                list.add(new LaundryAddOn());

            if (a == AddOn.MESS)
                list.add(new MessAddOn());
        }

        return list;
    }
}