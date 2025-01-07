package cu.devtool.librocontable.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import cu.devtool.librocontable.models.Empleado;

@Controller
public class EjemploController {

    @GetMapping("/")
    public String info(Model model) {
        model.addAttribute("titulo", "Servidor en Linea");
        model.addAttribute("servidor", "devcode");
        model.addAttribute("ip", "192.168.0.1");
        return "detalles_info";
    }

    @GetMapping("/empleado")
    public String empleado(Model model) {

        Empleado empleado = new Empleado("Ale", "Dueñas", "direccion", "Developer", 25, 54862288, 1);
        // empleado.setDireccion2("direccion2");
        model.addAttribute("empleado", empleado);
        return "empleado_info";
    }

    @ModelAttribute("empleados") // agregar atributos al modelo, esta disponible para todas las vistas
                                 // renderizadas en el controlador (super util)
    public List<Empleado> ListaEmpleados() {
        return Arrays.asList(
                new Empleado("María", "Perez", "Calle segunda no.2","Secretaria", 20, 123654987, 02),
                new Empleado("Pedro", "Segundo", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
                new Empleado("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
                new Empleado("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
                new Empleado("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
                new Empleado("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05));
    }
    
}
