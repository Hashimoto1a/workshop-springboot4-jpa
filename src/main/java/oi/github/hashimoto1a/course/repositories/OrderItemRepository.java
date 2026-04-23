package oi.github.hashimoto1a.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.hashimoto1a.course.entities.OrderItem;
import oi.github.hashimoto1a.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
