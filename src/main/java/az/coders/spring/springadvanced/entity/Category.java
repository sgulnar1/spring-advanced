package az.coders.spring.springadvanced.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private Product product;
}
