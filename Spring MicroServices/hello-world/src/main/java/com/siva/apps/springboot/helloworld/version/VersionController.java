package com.siva.apps.springboot.helloworld.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/v1/person")
    public PersonV1 getPersonV1(){
        return new PersonV1("Siva");
    }


    @GetMapping("/v2/person")
    public PersonV2 getPersonV2(){
        return new PersonV2(new PersonV2.Name("Siva","Karuppiah"));
    }



    @GetMapping(path = "/person",params = "version=1")
    public PersonV1 getPersonV1Param(){
        return new PersonV1("Siva");
    }


    @GetMapping(path = "/person",params = "version=2")
    public PersonV2 getPersonV2Param(){
        return new PersonV2(new PersonV2.Name("Siva","Karuppiah"));
    }




    @GetMapping(path = "/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getPersonV1Header(){
        return new PersonV1("Siva");
    }



    @GetMapping(path = "/person/header",headers = "X-API-VERSION=2")
    public PersonV2 getPersonV2Header(){
        return new PersonV2(new PersonV2.Name("Siva","Karuppiah"));
    }




    @GetMapping(path = "/person/accept",produces = "application/test.app-v1+json")
    public PersonV1 getPersonV1HeaderAccept(){
        return new PersonV1("Siva");
    }



    @GetMapping(path = "/person/accept",produces = "application/test.app-v2+json")
    public PersonV2 getPersonV2HeaderAccep(){
        return new PersonV2(new PersonV2.Name("Siva","Karuppiah"));
    }




}
