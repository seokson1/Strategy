package org.example;

import java.util.Optional;

public class MockCouponRepository implements CouponRepository {
    @Override
    public Optional<Coupon> findById(Long id) {
        if(id < 0) {
            return Optional.empty();
        }
        if(id < 100) {
            return Optional.of(new PercentageCoupon(10));
        }
        return Optional.of(new DiscountCoupon(500)); // return 값이 Optional 이기 때문에 Optional 무조건 해야됨.
    }
}
