
public class Gerente extends Funcionario{
	private String departamento;
	
    public double calcularBonus(double percentualBonus) {
        double bonus = getSalario() * (percentualBonus / 100);
        return bonus;
    }
}
