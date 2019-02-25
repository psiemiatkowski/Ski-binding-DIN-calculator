package com.din.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/")
public class MainController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, consumes = APPLICATION_JSON_VALUE)
    public double getResult(@RequestBody Skier skier) {
        return skier.calculateDin();
    }
}
