package com.example.backend.schoolapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/school")
@AllArgsConstructor
public class SchoolController {

  private SchoolService schoolService;

  @PostMapping("/create")
  public boolean schoolCreate(@RequestBody SchoolEntity schoolEntity){
    System.out.println("POST api/v1/school/create wurde angesprochen");

    return schoolService.schoolCreate(schoolEntity);
  }

  @DeleteMapping("/delete-school")
  public boolean deleteSchool(@RequestBody SchoolEntity schoolEntity){
    System.out.println("DELETE api/v1/school/delete-school wurde angesprochen");

    return schoolService.deleteSchool(schoolEntity.getSchoolName());
  }

  @GetMapping("/schoollist")
  public boolean schoolList(){
    System.out.println("GET api/v1/school/schoollist wurde angesprochen");

    return schoolService.schoolList();
  }


}
