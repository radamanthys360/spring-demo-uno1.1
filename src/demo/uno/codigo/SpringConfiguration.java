package demo.uno.codigo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("demo.uno.codigo")
public class SpringConfiguration {
	
	//declaramos la interfaz generica con la implementacion que necesitamos devolver
	@Bean
	public RutinaService rutinaTenisServices() {
		return new RutinaTenisServices();
	}
	
	//declaramos la clase jugador que deseamos inyectar
	@Bean
	public Jugador jugadorTenis() {
		return new JugadorTenis(rutinaTenisServices());
	}
	
	
}
