package com.Mask.NWMSUMask.Repository;

import com.Mask.NWMSUMask.model.location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<location,Integer> {
    @Override
    List<location> findAll();
}
