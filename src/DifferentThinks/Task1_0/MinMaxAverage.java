package DifferentThinks.Task1_0;

public class MinMaxAverage {

    private double max;

    private double min;
    public MinMaxAverage(double max, double min) {
        this.max = max;
        this.min = min;
    }

    public void changeVoid(double el) {
        if (el > this.max) {
            setMax(el);
        }
        if (el < this.min) {
            setMin(el);
        }
    }
    public void setMax(double max) {
        this.max = max;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public double getMax() {
        return max;
    }
    public double getMin() {
        return min;
    }
}
