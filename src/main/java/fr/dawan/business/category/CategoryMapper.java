package fr.dawan.business.category;

import fr.dawan.business.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper extends GenericMapper<Category,CategoryDto> {
}
