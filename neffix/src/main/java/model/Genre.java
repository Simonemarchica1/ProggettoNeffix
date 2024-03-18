package model;

import jakarta.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "film_id", nullable = false)
    private Integer Film_id;

    public Genre() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getFilm_id() {
        return Film_id;
    }

    public void setFilm_id(Integer film_id) {
        Film_id = film_id;
    }

    public Genre(Integer id, String name, Integer film_id) {
        Id = id;
        Name = name;
        Film_id = film_id;
    }
}
