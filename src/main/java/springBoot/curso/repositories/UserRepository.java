package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.curso.entitites.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
