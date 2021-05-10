package orientacaoobjeto;

import java.text.NumberFormat;

public class Patinete {
	
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private String modelo;
	private String marca;
	private String propulsao;
	private double valor;
	
	public Patinete (String modelo,String marca,String propulsao,double valor)
	{
		this.modelo = modelo;
		this.marca = marca;
		this.propulsao = propulsao;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPropulsao() {
		return propulsao;
	}

	public void setPropulsao(String propulsao) {
		this.propulsao = propulsao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String formatarValor()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoValor = nf.format(valor);
		return formatoValor;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nProduto: Patinete "+modelo+" "+marca+" de propulsão "+propulsao+"\nValor: "+this.formatarValor());
	}

}
