package org.cicdqa.mservice.b.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/b")
@CrossOrigin({"http://localhost","http://localhost:3000"})
public class SampleController {

    @GetMapping("/home")
    public String homePage() {
        return "*** Micro-Service B updated!!! ***";
    }
}
