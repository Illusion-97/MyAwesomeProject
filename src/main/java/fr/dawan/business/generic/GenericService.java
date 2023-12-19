package fr.dawan.business.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GenericService<E extends BaseEntity, D> {
    Page<E> findAll(Pageable pageable); // Tous les enregistrements avec pagination
    Optional<E> findById(long id);
    Optional<D> findDtoById(long id);
    E saveOrUpdate(E entity);
    void deleteById(long id);
}
