package springBoot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.curso.entitites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
