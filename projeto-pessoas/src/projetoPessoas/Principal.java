package projetoPessoas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		
		p1.setIdade(29);
		p2.setIdade(18);
		p3.setIdade(53);
		p4.setIdade(39);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p3.receberAumento(520.00f);
		p4.mudaTrabalho();
		p2.cancelarMatricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		}
	

}
