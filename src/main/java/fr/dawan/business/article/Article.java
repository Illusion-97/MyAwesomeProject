package fr.dawan.business.article;

import fr.dawan.business.category.Category;
import fr.dawan.business.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BaseEntity {
    private String title;
    @ManyToOne
    private Category category;
}
