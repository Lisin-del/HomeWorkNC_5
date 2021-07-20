package Zoo;

import java.util.List;

public class ConditionImpl implements Condition {
    private List<Species> isAvailableFor;

    public ConditionImpl(List<Species> isAvailableFor) {
        this.isAvailableFor = isAvailableFor;
    }

    @Override
    public List<Species> isAvailableFor() {
        return isAvailableFor;
    }
}
