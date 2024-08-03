package com.lernikgasparyan.proyectoLernik.controlador;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Hay que indicar mediante una notación para que se detecte que es un controlador
@RestController
@RequestMapping("/apisaludoss") /* Las solicitudes que se reciban se mostrarán en la ruta deseada, además que el resto de EndPoints deberán de tener este Path
también
*/
public class ControladorSaludos {

    //EndPoint
   @GetMapping("/hola")
    public String saludoGeneral(){
        return "Buenas tardes!!!";
    }

    // Otro EndPoint

    @GetMapping("/holaPersona")
    public String saludarPersona(String nombre,int edad){
        return "Hola "+nombre + "con edad "+ edad;
    }
}
