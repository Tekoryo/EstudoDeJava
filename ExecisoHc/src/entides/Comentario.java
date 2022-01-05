package entides;

public class Comentario {
	private String Comentario;

	public Comentario(String comentario) {
		
		Comentario = comentario;
	}

	public String getComentario() {
		return Comentario;
	}

	public void setComentario(String comentario) {
		Comentario = comentario;
	}

	@Override
	public String toString() {
		return "Comentario [Comentario=" + Comentario + "]";
	}
	
	
}
