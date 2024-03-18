package repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface filmRepository extends JpaRepository<Film, Integer> {
}
