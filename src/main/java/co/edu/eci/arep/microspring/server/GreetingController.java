package co.edu.eci.arep.microspring.server;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public static String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hola " + name;
    }

    @GetMapping("/pi")
    public static String pi(@RequestParam(value = "Pedro", defaultValue = "Dianna") String name) {
        return Double.toString(Math.PI);
    }

}
