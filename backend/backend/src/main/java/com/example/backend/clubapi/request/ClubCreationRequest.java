package com.example.backend.clubapi.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ClubCreationRequest {
    private final String clubName;
    private final String founder;
}


/*

"clubname": "heyclub",
"founder": "vadim"

*/