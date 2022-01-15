
public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	Empregado(String nome, String sobrenome, double salarioMensal)
	{
		if (salarioMensal < 0) {
			salarioMensal = 0.0;
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	public double getSalarioAnual() {
		return salarioMensal*12;
	}
	public double getAumentoMensal() {
		return salarioMensal+(salarioMensal*0.1);
	}
	public double getAumentoAnual() {
		return (salarioMensal+(salarioMensal*0.1))*12;
	}
}
