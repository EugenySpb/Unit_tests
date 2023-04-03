package org.example;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public SalesManager(int[] sales) {
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long statistics() {
        long stat = 0;
        long min = min();
        long max = max();
        long count = 0;
        for (long sale : sales) {
            if (sale != min && sale != max) {
                stat += sale;
                count++;
            }
        }
        return stat / count;
    }
}
