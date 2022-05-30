package com.example.backend.clubapi;

import com.example.backend.clubapi.request.ClubChangeNameRequest;
import com.example.backend.clubapi.request.ClubCreationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClubService {

    private final ClubRepository clubRepository;

    /**
     * Diese Methode ist für das erstellen von neuen Clubs, die dann anschließend
     * in die Datenbank gespeichert wird.
     * @param clubEntity
     * @return
     */
    public boolean clubCreate(ClubEntity clubEntity) {
        // TODO: Logik zur Registrierung, einspeichern in DB

        clubRepository.save(clubEntity);
        return true;
    }

    /**
     * Diese methode ist für das ändern vom Clubnamen.
     * Es wird nach dem alten Clubnamen gesucht.
     * Wenn dieser gefunden wurde kann man den dann ändern.
     * @param clubChangeNameRequest
     * @return
     */
    public boolean changeName(ClubChangeNameRequest clubChangeNameRequest) {
        ClubEntity clubEntity;
        if (clubRepository.findByClubName(clubChangeNameRequest.getOldName()).isPresent()) {
            clubEntity = clubRepository.findByClubName(clubChangeNameRequest.getOldName()).get();
        } else {
            return false;
        }

        clubEntity.setClubName(clubChangeNameRequest.getNewName());
        clubRepository.save(clubEntity);

        return true;
    }

    /**
     * Methode für das Löschen von einem Club über die ID.
     * @param clubName
     * @return
     */
    public boolean deleteClub(String clubName){
        ClubEntity clubEntity = clubRepository.findByClubName(clubName).get();
        clubRepository.delete(clubEntity);
        return true;
    }

    public boolean clubList(){
        List<ClubEntity> clubEntities = clubRepository.findAll();

        return true;
    }
}
