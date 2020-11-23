package criandoThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author alana 
 * Aplicativo com duas threads que manipulam um buffer
 */
public class SharedPrincipalTeste {
	/**
	 * Cria novo pool de threads com duas threads
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService pool = Executors.newCachedThreadPool();

		IBuffer shared = new BufferCircular();

		Produtor p = new Produtor(shared);

		Consumidor c = new Consumidor(shared);

		pool.execute(p);

		pool.execute(c);

		pool.shutdown();
	}
}
