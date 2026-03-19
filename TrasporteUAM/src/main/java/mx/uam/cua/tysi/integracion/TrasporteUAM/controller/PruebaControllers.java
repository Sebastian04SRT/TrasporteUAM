package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaControllers {

    @GetMapping("/prueba2")
    public String prueba() {
        return "SISISSISISIS UAMg";
    }

    @GetMapping("/hola1")
    public String hola() {
        return "ARRIBAAAAAAAAAA";
    }
}
