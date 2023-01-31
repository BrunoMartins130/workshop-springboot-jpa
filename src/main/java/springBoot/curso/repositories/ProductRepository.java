package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.curso.entitites.Category;
import springBoot.curso.entitites.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
