package carpartshop.rest.api.repository;

import carpartshop.rest.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
