package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.curso.entitites.OrderItem;
import springBoot.curso.entitites.User;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
