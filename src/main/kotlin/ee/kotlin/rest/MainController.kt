package ee.kotlin.rest

import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.awt.Color
import javax.imageio.ImageIO

/**
 * Created by Martin Härm on 03.11.2016.
 */
@RestController
class MainController {

    @CrossOrigin
    @RequestMapping(value = "/", method = arrayOf(RequestMethod.POST))
    fun fileSize(@RequestParam("file") multipartFile: MultipartFile): String {
        val image = ImageIO.read(multipartFile.inputStream)

        val xpixels=image.width-1

        val ypixels=image.height-1

        val sb: StringBuilder = StringBuilder()


        for(yCord in 0..ypixels) {
            for(xCord in 0..xpixels) {
                //Since the image is grayscale black and white
                //I can check how much red is in each pixel
                sb.append(Color(image.getRGB(xCord, yCord)).red.toString())
                sb.append("|")
            }
            sb.append("<br />")
        }

        sb.append("<br />")

        return sb.toString()
    }

}