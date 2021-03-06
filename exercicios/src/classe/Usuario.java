package classe;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.contentEquals(this.nome);
		boolean emailIgual = outro.email.contentEquals(this.email);
		
		return nomeIgual && emailIgual;
		
	}
	
	public int hashCode() {
		return super.hashCode();
	}
}
