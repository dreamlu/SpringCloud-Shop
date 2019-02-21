package com.kedacom.order.repository;

import com.kedacom.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * com.kedacom.order.repository
 * 2018-01-02-13:43
 * 2018
 *  on 2018-01-02.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
