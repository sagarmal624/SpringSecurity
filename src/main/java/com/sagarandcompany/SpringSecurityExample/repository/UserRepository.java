package com.sagarandcompany.SpringSecurityExample.repository;

import com.sagarandcompany.SpringSecurityExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}
