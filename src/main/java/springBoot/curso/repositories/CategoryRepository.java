package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.curso.entitites.Category;
import springBoot.curso.entitites.Order;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
