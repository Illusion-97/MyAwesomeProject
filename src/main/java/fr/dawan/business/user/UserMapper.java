package fr.dawan.business.user;

import fr.dawan.business.article.Article;
import fr.dawan.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends GenericMapper<User, UserDto> {
    @Override
    @Mapping(source = "articles", target = "articlesCount", qualifiedByName = "articleConverter")
    UserDto toDto(User entity);

    @Named("articleConverter")
    default long articlesToArticleCount(List<Article> articles) {
        if(articles == null) return 0;
        return articles.size();
    }
}
