package com.example.backend.schoolapi;

import com.example.backend.jwt.JwtTokenUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(path = "school")
@AllArgsConstructor
public class SchoolController {

  private SchoolService schoolService;
  private JwtTokenUtil jwtTokenUtil;

  @PostMapping("/create")
  public boolean schoolCreate(@CookieValue(name = "JWT") String jwtID , @RequestBody SchoolEntity schoolEntity){
      if(jwtTokenUtil.checkLoggedIn(jwtID)){
        return schoolService.schoolCreate(schoolEntity);
      } else
          return false;
  }

  @DeleteMapping("/delete-school")
  public boolean deleteSchool(@RequestBody SchoolEntity schoolEntity){
    System.out.println("DELETE api/v1/school/delete-school wurde angesprochen");

    return schoolService.deleteSchool(schoolEntity.getSchoolName());
  }

  @GetMapping("/schoollist")
  public List<SchoolEntity> schoolList(){
    System.out.println("GET api/v1/school/schoollist wurde angesprochen");

    return schoolService.schoolList();
  }

}
