package criandoThread;


public interface IBuffer {

	/**
	 * Coloca o valor int no Buffer
	 * @param valor
	 * @throws InterruptedException
	 */
	public void escrever (int valor) throws InterruptedException;
	
	/**
	 * @return Retorna o valor int a partir do buffer
	 * @throws InterruptedException
	 */
	public int ler() throws InterruptedException;	
}
