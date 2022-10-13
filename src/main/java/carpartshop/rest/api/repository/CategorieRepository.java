package carpartshop.rest.api.repository;

import carpartshop.rest.api.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
