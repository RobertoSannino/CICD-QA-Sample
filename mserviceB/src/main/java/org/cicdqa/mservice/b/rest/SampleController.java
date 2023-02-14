package org.cicdqa.mservice.b.rest;

import org.cicdqa.mservice.b.util.MessageUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/b")
@CrossOrigin({"http://localhost","http://localhost:3000"})
public class SampleController {

    @GetMapping("/home")
    public String homePage() {
        return "*** Micro-Service B !!! ***";
    }

    @GetMapping("/hello/{name}")
    public String hello(
            @PathVariable String name
    ) {
        return MessageUtil.getHelloMessage(name);
    }
}
