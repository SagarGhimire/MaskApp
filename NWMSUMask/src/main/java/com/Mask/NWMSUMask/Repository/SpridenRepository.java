package com.Mask.NWMSUMask.Repository;

import com.Mask.NWMSUMask.model.SpridenStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpridenRepository extends CrudRepository<SpridenStudent,String> {
    @Query(value = "Select SPRIDEN_ID from saturn.spriden where SPRIDEN_ID= :ID",nativeQuery = true)
    public SpridenStudent findBySpridenID(String ID);
}
