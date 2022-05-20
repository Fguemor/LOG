package ejercicio.dual;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
public class TestLog {
	//Se instancia el trazador a partir de la clase actual
	//es decir se quiere trazar código dentro de 
	private static final Logger LOGGER=LogManager.getLogger(TestLog.class);
	public static void main(String[] args) {
		//se van a trazar en la salida predeterminada del trazador
		//con nivel de depuracion e informacion
		LOGGER.debug("Iniciando aplicación desde método main");
		LOGGER.debug("Debug Message logged");
		LOGGER.info("Info message logged");
		LOGGER.warn("warn message");
		LOGGER.fatal("");
		ArithmeticException ae=new ArithmeticException (" Excepción Aritmética!!");
		LOGGER.error("Error message", ae);
		for(int i=0;i<1000;i++) {
			LOGGER.warn("warn message"+(i+1));
		}

	}



}
