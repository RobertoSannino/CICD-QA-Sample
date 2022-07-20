package org.cicdqa.mservice.a.rest;

import org.cicdqa.mservice.a.utils.MessageUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/a")
public class SampleController {

    @GetMapping("/home")
    public String homePage() {
        return MessageUtil.getHomeMessage("A");
    }

}
