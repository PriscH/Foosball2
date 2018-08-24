package jp.foosball.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ExampleController {

    @GetMapping("/")
    @ResponseBody
    fun index(model: Model): String {
        model["title"] = "Example Model"
        return "Example Content"
    }

}