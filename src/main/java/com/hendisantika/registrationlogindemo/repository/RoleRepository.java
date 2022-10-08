package com.hendisantika.registrationlogindemo.repository;

import com.hendisantika.registrationlogindemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{
}
