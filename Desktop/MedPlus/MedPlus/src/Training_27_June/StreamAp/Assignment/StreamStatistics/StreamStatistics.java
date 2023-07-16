package Training_27_June.StreamAp.Assignment.StreamStatistics;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamStatistics {
public static void main(String[] args) {
	List<Integer> listInteger = new ArrayList<Integer>();
	listInteger.add(4);
	listInteger.add(5);
	listInteger.add(3);
	listInteger.add(4);
	listInteger.add(5);
    IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
    listInteger.stream()
            .mapToInt((p)->p)
            .forEach(intSummaryStatistics);
    System.out.println("count= "+intSummaryStatistics.getCount());
    System.out.println("Minimum= "+intSummaryStatistics.getMin());
    System.out.println("Maximum= "+intSummaryStatistics.getMax());
    System.out.println("sum= "+intSummaryStatistics.getSum());
    System.out.println("Average= "+ intSummaryStatistics.getAverage());
}
}
