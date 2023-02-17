package org.cicdqa.mservice.a.rest;

import org.cicdqa.mservice.a.util.MessageUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/a")
@CrossOrigin({"http://localhost","http://localhost:3000"})
public class SampleController {

    @GetMapping("/home")
    public String homePage() {
        return MessageUtil.getHomeMessage("A");
    }

    @GetMapping("/hello/{name}")
    public String helloMessage(@PathVariable String name) {
        return MessageUtil.getHelloMessage(name);
    }


}
