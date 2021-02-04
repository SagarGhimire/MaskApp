package com.Mask.NWMSUMask.Repository;

import com.Mask.NWMSUMask.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Admin,Integer> {
    Optional<Admin> findByUserName(String username);

}
