package criandoThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingBufferTest {

	public static void main(String[] args) {

		ExecutorService application = Executors.newCachedThreadPool();

		IBuffer shared = new BlockingBuffer();

		application.execute(new Produtor(shared));
		application.execute(new Consumidor(shared));

		application.shutdown();

	}

}
