package cat.itacademy.s04.t01.n01.s04t01n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // GET con RequestParam (parámetro "nombre" con valor por defecto "UNKNOWN")
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }

    // GET con PathVariable (ruta /HelloWorld2 o /HelloWorld2/{nombre})
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(name = "nombre", required = false) String nombre) {
        if (nombre == null || nombre.isBlank()) {
            nombre = "UNKNOWN";
        }
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }
}