package com.example.backend.clubapi;

import com.example.backend.clubapi.request.ClubChangeNameRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/club")
@AllArgsConstructor
public class ClubController {

    private ClubService clubService;

    @PostMapping("/create")
    public boolean clubCreate(@RequestBody ClubEntity clubEntity){
        System.out.println("POST api/v1/club/create wurde angesprochen");

        return clubService.clubCreate(clubEntity);
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
    public boolean clubList(){
        System.out.println("GET api/v1/club/clublist wurde angesprochen");

        return clubService.clubList();
    }

}
