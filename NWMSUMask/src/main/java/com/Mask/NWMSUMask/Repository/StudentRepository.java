package com.Mask.NWMSUMask.Repository;

import com.Mask.NWMSUMask.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, String> {

}
