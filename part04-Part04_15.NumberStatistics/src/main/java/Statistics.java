
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if ((this.sum / Double.valueOf(this.count)) > 0) {
            return this.sum / Double.valueOf(this.count);
        }

        return 0.0;
    }
}
