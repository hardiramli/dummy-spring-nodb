package com.dummy.order.repository;

import com.dummy.order.entity.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

     @Query(value = """

        SELECT customer,
               COUNT(*) total_orders,
               SUM(amount) total_sales,
               AVG(amount) avg_order
        FROM orders
        WHERE order_date >= :date
        GROUP BY customer
        HAVING SUM(amount) > 1000
        ORDER BY total_sales DESC

        """,
        nativeQuery = true)
    List<Object[]> customerReport(LocalDate date);
}