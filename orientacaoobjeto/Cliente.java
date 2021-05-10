package orientacaoobjeto;

    /*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	
	private String nomeCliente;
	private String numTelefone;
	private String cidade;
	private int idade;
	
	public Cliente(String nomeCliente,String numTelefone,String cidade,int idade) 
	{
		this.nomeCliente = nomeCliente;
		this.numTelefone = numTelefone;
		this.cidade = cidade;
		this.idade = idade;
	}
	public Cliente(int idade)
	{
		this.idade = idade;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nCliente: "+nomeCliente+"\nTelefone para contato: "+numTelefone+"\nMora em: "+cidade+"\nIdade:"+idade);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	

}
