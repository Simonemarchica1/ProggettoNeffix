package model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer Id;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "genre_id", nullable = false)
    private String Genre_id;


    @Column(name = "duration", nullable = false)
    private Date Duration;

    @Column(name = "trama", length = 200, nullable = false)
    private String Trama;

    public Film() {
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

    public Date getDuration() {
        return Duration;
    }

    public void setDuration(Date duration) {
        Duration = duration;
    }

    public String getTrama() {
        return Trama;
    }

    public void setTrama(String trama) {
        Trama = trama;
    }
    public String getGenre_id(String genre_id) {
        return genre_id;
    }

    public void setGenre_id(String genre_id) {
        Genre_id = genre_id;
    }

    public Film(Integer id, String name, Date duration, String trama, String genre_id) {
        Id = id;
        Name = name;
        Duration = duration;
        Trama = trama;
        Genre_id = genre_id;

    }
}
