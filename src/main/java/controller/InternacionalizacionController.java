package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.lang.String;

@RestController
public class InternacionalizacionController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")

    public String obtenerSaludo(Locale locale) {
        return messageSource.getMessage("welcome.message", null, locale);
    }
}
