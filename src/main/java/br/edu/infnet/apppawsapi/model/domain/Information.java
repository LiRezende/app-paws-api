package br.edu.infnet.apppawsapi.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private String description;

    @Override
    public String toString() {

        return String.format("id (%d) - text (%s) - description (%s)",
                id, text, description
        );
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCampo() {
        return text;
    }
    public void setCampo(String text) {
        this.text = text;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
