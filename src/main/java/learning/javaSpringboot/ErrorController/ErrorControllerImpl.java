package learning.javaSpringboot.ErrorController;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorControllerImpl implements ErrorController {

    @RequestMapping("${server.error.path}")
    public void error404() {
    	System.out.print("Method: ResponseEntity");
    }
}