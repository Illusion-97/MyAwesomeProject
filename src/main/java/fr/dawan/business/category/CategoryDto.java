package fr.dawan.business.category;

import fr.dawan.business.article.Article;
import fr.dawan.business.article.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private long id;
    private int version;
    private String name;
    private List<CategoryArticleDto> articles;
    private long articlesCount;
}
