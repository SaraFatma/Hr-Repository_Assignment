package com.example.hr_portal.repository;

import com.example.hr_portal.model.Hr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface HrRepository extends JpaRepository<Hr, Integer> {
    Optional<Hr> findByHrUsername(String hrUsername);
}
