package cu.devtool.librocontable.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cu.devtool.librocontable.models.Empleado;
import cu.devtool.librocontable.models.dto.ClaseDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController // metodo solicitudes de tipo rest
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en Linea");
        respuesta.put("servidor", "devcode");
        respuesta.put("ip", "192.168.0.1");
        return respuesta;
    }

    @RequestMapping(path = "/test2", method = RequestMethod.GET)
    public Map<String, Object> test2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en Linea");
        respuesta.put("servidor", "RequestMethod.GET");
        return respuesta;
    }

    @RequestMapping(path = "/test3", method = RequestMethod.POST)
    public Map<String, Object> test3() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en Linea");
        respuesta.put("servidor", "RequestMethod.GET");
        return respuesta;
    }

    @RequestMapping(path = "/empleados", method = RequestMethod.GET)
    public Map<String, Object> empleados() {
        List<Empleado> lempleado = new ArrayList<>();
        lempleado.add(new Empleado("Ale", "Dueñas", "direccion", "Developer", 25, 54862288, 1));
        lempleado.add(new Empleado("Ale2", "Dueñas2", "direccion2", "Developer2", 34, 54862288, 2));
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("empleados", "Datos Empleados");
        respuesta.put("info", lempleado);
        return respuesta;
    }

    @GetMapping(path = "/empleado")
    public ClaseDto empleado() {
        ClaseDto usuario = new ClaseDto("Administrator", "alejandrodr");
        return usuario;
    }
}
