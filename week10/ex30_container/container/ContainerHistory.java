package container;

import java.util.List;
import java.util.ArrayList;

public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory() { history = new ArrayList<Double>(); }
    public void add(Double situation) { history.add(situation); }
    public void reset() { history.clear(); }
    public String toString() { return history.toString(); }

    public double maxValue() {
        if (history.size() == 0)
            return 0;

            Double max = 0.0;

        for (Double i : history) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public double minValue() {
        if(history.size() == 0)
            return 0;

            Double min = history.get(0);

        for (Double i : history) {
            if (i < min)
                min = i;
        }

        return min;
    }

    public double average() {
        if (history.size() == 0)
            return 0;

        Double sum = 0.0;

        for (Double i : history) {
            sum += i;
        }
        
        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.size() <= 1)
            return 0;

        ArrayList<Double> fluctuations = new ArrayList<Double> ();;

        for (int i = 0; i < history.size() - 1; i++) {
            fluctuations.add(Math.abs(history.get(i) - history.get(i + 1)));
        }

        Double max = 0.0;

        for (Double i : fluctuations) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public double variance() {
        double average = average();
        double numerator = 0.0;

        for (Double i : history) {
            numerator += Math.pow(i - average, 2);
        }

        return numerator / (history.size() - 1);
        
    }
}