package org.example;

public class PercentageCoupon implements Coupon {
    private int ratio;
    public PercentageCoupon(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public int calc(int productAmount) {
        return Math.max((int) (productAmount - (productAmount * ratio * 0.01)),0);
    }
}
