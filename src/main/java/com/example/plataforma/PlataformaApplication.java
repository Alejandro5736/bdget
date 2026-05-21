package com.example.plataforma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;

@SpringBootApplication
public class PlataformaApplication {

    public static void main(String[] args) {
        // 1. Obtener la ruta absoluta de la carpeta wallet dinámicamente
        String walletPath = new File("src/main/resources/wallet").getAbsolutePath();
        
        // 2. Asignarla como propiedad del sistema para el driver de Oracle
        System.setProperty("oracle.net.tns_admin", walletPath);
        
        // 3. Iniciar la aplicación Spring Boot
        SpringApplication.run(PlataformaApplication.class, args);
    }
}