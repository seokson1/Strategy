package org.example;

import java.util.Optional;

public interface CouponRepository {

    Optional<Coupon> findById(Long id);
}
