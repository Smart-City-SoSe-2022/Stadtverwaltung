package com.example.backend.schoolapi.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SchoolCreationRequest {

    private final String schoolName;
    private final String founderName;
    private final int teacher;
    private final int classrooms;
}
