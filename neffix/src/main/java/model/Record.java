package model;

import jakarta.persistence.*;

@Entity
@Table(name = "record")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer Id;

    @Column(name = "film_id", nullable = false)
    private Integer Film_id;

    @Column(name = "user_id", nullable = false)
    private Integer User_id;

    public Record() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getFilm_id() {
        return Film_id;
    }

    public void setFilm_id(Integer film_id) {
        Film_id = film_id;
    }

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public Record(Integer id, Integer film_id, Integer user_id) {
        Id = id;
        Film_id = film_id;
        User_id = user_id;
    }
}
