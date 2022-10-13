package carpartshop.rest.api.repository;

import carpartshop.rest.api.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
}
