package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@Table (name = "students")
@ToString
public class Student {

    @Id
    private long id;
    private String name;
    private String major;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
