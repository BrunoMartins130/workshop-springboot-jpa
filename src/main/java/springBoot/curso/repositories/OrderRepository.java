package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.curso.entitites.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
