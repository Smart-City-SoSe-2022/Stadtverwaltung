package com.example.backend.schoolapi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {

  private final SchoolRepository schoolRepository;

  public boolean schoolCreate(SchoolEntity schoolEntity){

    schoolRepository.save(schoolEntity);
    return true;
  }

  public boolean deleteSchool(String schoolName){
    SchoolEntity schoolEntity = schoolRepository.findBySchoolName(schoolName).get();
    schoolRepository.delete(schoolEntity);
    return true;
  }

  public List<SchoolEntity> schoolList(){
    List<SchoolEntity> schoolEntities = schoolRepository.findAll();
    return schoolRepository.findAll();
  }
}
