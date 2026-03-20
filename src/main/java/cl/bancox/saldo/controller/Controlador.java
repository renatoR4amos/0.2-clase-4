package cl.bancox.saldo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

     @GetMapping("/hola")
    public String holaMundo() {
        return "que pasa calabaza!";
    }



}
