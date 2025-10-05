package Split;

import java.util.ArrayList;
import java.util.List;

public class RatioSplit implements Split{
    @Override
    public List<Float> calculate(int amount, List<Integer> values) {
        List<Float> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<values.size();i++) sum+=values.get(i);
        for(int i=0;i<values.size();i++)
            list.add((float) (amount*values.get(i))/sum);
        return list;
    }
}
