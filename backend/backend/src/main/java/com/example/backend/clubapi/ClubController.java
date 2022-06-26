package com.example.backend.clubapi;

import com.example.backend.clubapi.request.ClubChangeNameRequest;
import com.example.backend.jwt.JwtTokenUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(path = "club")
@AllArgsConstructor
public class ClubController {

    private ClubService clubService;
    private JwtTokenUtil jwtTokenUtil;


    @PostMapping("/create")
    public boolean clubCreate(@CookieValue(name = "JWT") String jwtID,@RequestBody ClubEntity clubEntity){
        if(jwtTokenUtil.checkLoggedIn(jwtID)){
            return clubService.clubCreate(clubEntity);
        } else
            return false;
    }

    @PutMapping("/change-name")
    public boolean changeName(@RequestBody ClubChangeNameRequest clubChangeNameRequest){
        System.out.println("PUT api/v1/club/change-name wurde angesprochen");

        return clubService.changeName(clubChangeNameRequest);
    }

    @DeleteMapping("/delete-club")
    public boolean deleteclub(@RequestBody ClubEntity clubEntity){
        System.out.println("DELETE api/v1/club/delete-club wurde angesprochen");

        return clubService.deleteClub(clubEntity.getClubName());
    }

    @GetMapping("/clublist")
    public List<ClubEntity> clubList(){
        System.out.println("GET api/v1/club/clublist wurde angesprochen");

        return clubService.clubList();
    }

}
