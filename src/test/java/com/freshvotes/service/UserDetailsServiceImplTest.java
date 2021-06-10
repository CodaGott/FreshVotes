package com.freshvotes.service;

import com.freshvotes.models.User;
import com.freshvotes.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserDetailsServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testUser(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPass = "password123";
        String encodePassword = encoder.encode(rawPass);

        System.out.println(encodePassword);
        assertThat(rawPass, not(encodePassword));
    }

    @Test
    void testUserExist(){
        User user = new User();
        user.setUsername("dozy");
        user.setFirstName("name");
        user.setLastName("LastName");
        user.setPassword("password123");
        userRepository.save(user);
        assertEquals(user.getUsername(), "dozy");
    }
}