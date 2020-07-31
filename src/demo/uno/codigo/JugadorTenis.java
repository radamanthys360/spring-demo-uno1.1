package demo.uno.codigo;

public class JugadorTenis implements Jugador {
	
	private RutinaService rutinaService;
	
	public JugadorTenis(RutinaService rutinaService) {
		this.rutinaService = rutinaService;
	}
	
	@Override
	public String ObtRutinaDiaria() {
		return rutinaService.rutinaDiaria();
	}

}
