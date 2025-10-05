package Split;

import java.util.ArrayList;
import java.util.List;

public class EqualSplit implements Split{

    @Override
    public List<Float> calculate(int amount, List<Integer> values) {
        List<Float> list = new ArrayList<>();
        for(int i=0;i<values.size();i++)
            list.add((float) amount/values.size());
        return list;
    }
}
