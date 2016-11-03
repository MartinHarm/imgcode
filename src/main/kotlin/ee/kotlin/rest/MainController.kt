package ee.kotlin.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by martinha on 03.11.2016.
 */
@RestController
class MainController {
    @RequestMapping(value = "/")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, " + name
    }
}