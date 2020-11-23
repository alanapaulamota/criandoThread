package criandoThread;

import java.util.concurrent.ArrayBlockingQueue;


public class BlockingBuffer implements IBuffer {
	
	private final ArrayBlockingQueue<Integer>buffer;
	
	public BlockingBuffer() {
		
	
	buffer = new ArrayBlockingQueue<Integer>(1);
	
}
	public void set(int value ) throws InterruptedException {
buffer.put(value);
System.out.println("Produtor escreve:" + value);
System.out.println("Buffer cells occupied:" + buffer.size());

}
	
	public int get() throws  InterruptedException {
	int leiaValor = buffer.take();
	System.out.println("Consumidor lê:" + leiaValor);
	System.out.println("Buffer cells occupied:" + leiaValor);

	return leiaValor;
}
	@Override
	public void escrever(int valor) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int ler() throws InterruptedException {
		// TODO Auto-generated method stub
		return 0;
	}

}

