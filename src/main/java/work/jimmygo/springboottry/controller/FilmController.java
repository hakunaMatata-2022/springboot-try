package work.jimmygo.springboottry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * security
 *
 * @author shenzui5233
 * @since 2024-04-30
 */
@Controller
public class FilmController {

    @GetMapping("/detail/{type}/{path}")
    public String toDetail(@PathVariable("type") String type, @PathVariable("path") String path) {
        return type + "/" + path;
    }
}
