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
    private final String founderName;
    private final String clubName;
    private final int member;
    private final String task;
    private final String financing;
    private final String description;
}