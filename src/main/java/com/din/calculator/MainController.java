package com.din.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@Controller
public class MainController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public double calculateDinResult(@RequestBody Skier skier) {
        return skier.calculateDin();
    }
}
