package com.codegym.service.user;

import com.codegym.model.User;
import com.codegym.model.dto.UserDTO;
import com.codegym.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User getByUsername(String username);

    Optional<User> findByUsername(String username);

    Optional<UserDTO> findUserDTOByUsername(String username);

}
