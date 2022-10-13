package carpartshop.rest.api.repository;

import carpartshop.rest.api.model.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPartRepository extends JpaRepository<CarPart, Long> {
}
