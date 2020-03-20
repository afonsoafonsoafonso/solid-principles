public class AreaStringOutputter {
    SumProvider areaAggregator;

    public AreaStringOutputter(SumProvider areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output() {
        return "Sum of areas: " + areaAggregator.sum();
    }
}
