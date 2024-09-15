package com.artesanias.ludex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean // No lo considere repository.
public interface CrudGenericoRepository<T,ID> extends JpaRepository<T,ID> {
}