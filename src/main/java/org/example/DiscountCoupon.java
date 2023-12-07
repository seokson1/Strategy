package org.example;

public class DiscountCoupon implements Coupon {
    private int discount;
    public DiscountCoupon(int discount) {
        this.discount = discount;
    }

    @Override
    public int calc(int productAmount) {
        return Math.max(productAmount - discount,0); // Math.max 사용 할인 결과 값이 0으로 내려 갈 수 있기 때문에
    }
}
