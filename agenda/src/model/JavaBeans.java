package model;

/**
 * Encapsulamneto dos dados (fluxo)
 * 
 * @author matheus cesarini
 *
 */
public class JavaBeans {
	// variáveis encapsuladas usadas no fluxo
	private String idcon;
	private String nome;
	private String fone;
	private String email;

	/**
	 * idcon
	 * 
	 * @return idcon
	 */
	public String getIdcon() {
		return idcon;
	}

	/**
	 * idcon
	 * 
	 * @param idcon
	 */
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}

	/**
	 * nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * fone
	 * 
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * fone
	 * 
	 * @param fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}

	/**
	 * emial
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * construtor
	 */
	public JavaBeans() {
		super();
	}

	/**
	 * construtor para uso do Arraylist
	 * 
	 * @param idcon
	 * @param nome
	 * @param fone
	 * @param email
	 */
	public JavaBeans(String idcon, String nome, String fone, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

}
