package com.example.backend.schoolapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface SchoolRepository extends JpaRepository<SchoolEntity, Long> {


  Optional<SchoolEntity> findBySchoolName(String schoolName);
}
