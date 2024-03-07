package com.siva.apps.springboot.helloworld.version;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonV2 {
    Name name;

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    static class Name{
        private String firstName;
        private String lastName;
    }
}
