package cu.devtool.librocontable.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cu.devtool.librocontable.models.Empleado;
import cu.devtool.librocontable.models.Producto;
import cu.devtool.librocontable.models.dto.ClaseDto;
import cu.devtool.librocontable.models.dto.ParametroDto;
import cu.devtool.librocontable.service.Producto_Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    // DTO
    @GetMapping("/empleado")
    public ClaseDto empleado() {
        ClaseDto usuario = new ClaseDto("Administrator", "alejandrodr");
        return usuario;
    }

    // RequestParam
    @GetMapping("/parametro") // leer parametro, required = false para q no sea obligado
    public ParametroDto parametro(@RequestParam(required = false, defaultValue = "Sin parametros") String informacion) {
        ParametroDto info = new ParametroDto(informacion);
        return info;
    }

    // video 15
    // PathVariable
    // capturar partes especificas del path de una solicitud (parametro por ruta)
    @GetMapping("/mensaje/{mensaje}")
    public ParametroDto partes(@PathVariable String mensaje) {
        ParametroDto info = new ParametroDto(mensaje);
        return info;
    }

    // video 16
    @PostMapping("/solicitud")
    public Empleado creaEmpleado(@RequestBody Empleado empleado) {
        return empleado;
        /*
         * post parametros
         * {
         * "nombre":"Ale",
         * "apellido":"Duenas",
         * "direccion":"direccion",
         * "direccion2":"direccion2",
         * "puesto":"puesto",
         * "edad":30,
         * "telefono":54862288,
         * "id":1
         * }
         */
    }

    // video 17
    //config en application.propeties
    @Value("${config.codigo}")  
    private int codigo;
    @Value("${config.usuario}")
    private String usuario;
    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/valores")
    public Map<String, Object> valores() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("usuario", usuario);
        respuesta.put("codigo", codigo);
        respuesta.put("valores", valores);
        return respuesta;
    }
    //video23  
    @GetMapping("/producto/{idProducto}")
    public Producto productos(@PathVariable int idProducto) {
        //instancia unica por cada cliente
        Producto_Service servicio=new Producto_Service();

        return servicio.findId(idProducto);
    }   
    @GetMapping("/productos")
    public List<Producto> productos() {
        Producto_Service servicio=new Producto_Service();
        return servicio.findAll();
    }

}
