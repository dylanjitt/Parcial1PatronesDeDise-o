package kitEscolar3;

public class Libro {
	private String titulo;
	private String tipo;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void infoLibro() {
		System.out.println("LIBRO: ");
		System.out.println("Titulo: "+titulo);
		System.out.println("Tipo: "+tipo);
		System.out.println("Autor: "+autor);
	}

}
