package ee.kotlin.rest

import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

/**
 * Created by Martin Härm on 03.11.2016.
 */
@RestController
class MainController {

    @CrossOrigin
    @RequestMapping(value = "/", method = arrayOf(RequestMethod.POST))
    fun fileSize(@RequestBody multipartFile: MultipartFile): String {
        return multipartFile.contentType+multipartFile.size
    }

    @CrossOrigin
    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun greeting(): String {
        return "TEST"
    }

}