package com.sagarandcompany.SpringSecurityExample.repository;

import com.sagarandcompany.SpringSecurityExample.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}
