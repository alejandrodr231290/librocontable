package cu.devtool.librocontable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
      
        Empleado empleado=new Empleado("Ale", "Dueñas", "direccion", "Developer", 25, 54862288, 1);
        model.addAttribute("empleado", empleado);     
        return "empleado_info";
    }
}
