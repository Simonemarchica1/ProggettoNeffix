package repository;

import model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface genreRepository extends JpaRepository<Genre,Integer> {
}
