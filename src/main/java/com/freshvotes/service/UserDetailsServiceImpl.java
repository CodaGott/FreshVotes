package com.freshvotes.service;

import com.freshvotes.models.User;
import com.freshvotes.repository.UserRepository;
import com.freshvotes.security.CustomSecurityUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+user.toString());
        if(user == null)
            throw new UsernameNotFoundException("Invalid username and password");

        return new CustomSecurityUser(user);

    }
}
