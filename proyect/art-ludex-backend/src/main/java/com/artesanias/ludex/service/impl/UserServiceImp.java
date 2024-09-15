package com.artesanias.ludex.service.impl;

import com.artesanias.ludex.model.User;
import com.artesanias.ludex.repository.CrudGenericoRepository;
import com.artesanias.ludex.repository.UserRepository;
import com.artesanias.ludex.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImp extends CrudGenericoServiceImp<User, Long> implements UserService {

    private final UserRepository userRepository;

    @Override
    protected CrudGenericoRepository<User, Long> getRepo() {
        return userRepository;
    }
}
