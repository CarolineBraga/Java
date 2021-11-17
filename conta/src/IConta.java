package lista7;

public interface IConta {

	public int getNumero();
	public ICliente getTitular();
	public double getSaldo();
	public void depositar (double valor);
	public void sacar (double valor);
	public StringBuilder listarExtrato();
	
}
