package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/prueba1")
    public String prueba() {
        return "Bienvenido a trasporte UAMg";
    }

    @GetMapping("/hola2")
    public String hola() {
        return "Bienvenido a trasporte UAM";
    }
}