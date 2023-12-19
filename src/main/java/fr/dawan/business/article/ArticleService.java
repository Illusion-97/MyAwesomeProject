package fr.dawan.business.article;

import fr.dawan.business.generic.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArticleService extends GenericService<Article,ArticleDto> {
    Page<Article> findByTitle(String title, Pageable pageable);
    Page<Article> findByCategory_NameLike(String name, Pageable pageable);
}
