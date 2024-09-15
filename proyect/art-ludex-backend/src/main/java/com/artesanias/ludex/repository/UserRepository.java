package com.artesanias.ludex.repository;

import com.artesanias.ludex.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudGenericoRepository<User, Long> {
}
