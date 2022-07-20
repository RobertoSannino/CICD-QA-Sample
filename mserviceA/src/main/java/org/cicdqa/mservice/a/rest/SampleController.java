package org.cicdqa.mservice.a.rest;

import org.cicdqa.mservice.a.util.MessageUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/a")
@CrossOrigin({"http://localhost","http://localhost:3000"})
public class SampleController {

    @GetMapping("/home")
    public String homePage() {
        return MessageUtil.getHomeMessage("A");
    }

}
