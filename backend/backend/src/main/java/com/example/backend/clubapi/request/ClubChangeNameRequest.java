package com.example.backend.clubapi.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ClubChangeNameRequest {
    private final String oldName;
    private final String newName;
}

/*
{
    "oldName": "hallo",
    "newName": "bye"
}
 */
