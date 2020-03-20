public class AreaXMLOutputter {
    SumProvider areaAggregator;

    public AreaXMLOutputter(SumProvider areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output() {
        return "<area>" + areaAggregator.sum() + "</area>";
    }
}