package org.example;

public class Main {

    private static CouponService couponService = new CouponService();
    public static void main(String[] args) {
        /*Coupon discountCoupon = new DiscountCoupon(2000);
        System.out.println(discountCoupon.calc(3000));

        Coupon percentageCoupon = new PercentageCoupon(10);
        System.out.println(percentageCoupon.calc(3000));*/
        int productPrice = 1000;

        Product ipadPro = new Product("ipadPro5", 15000000);

        //if문의 대체함.
        Coupon percentageCoupon = couponService.getCoupon(10L);
        System.out.println(percentageCoupon.calc(productPrice)); // 900

        Coupon discountCoupon = couponService.getCoupon(500L);
        System.out.println(discountCoupon.calc(productPrice)); // 500

        int discountAmount = ipadPro.discount(percentageCoupon);
        System.out.println("최종가격: " + discountAmount);
    }
}