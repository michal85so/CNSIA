package pl.policht.catalogservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.policht.catalogservice.configuration.PolarProperties;

@RestController
@AllArgsConstructor
public class HomeController {
    private PolarProperties polarProperties;

    @GetMapping("/")
    public String home() {
        return polarProperties.greeting();
    }
}
