package entides;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class Post {
	private SimpleDateFormat format=new SimpleDateFormat();
	private Date moment;
	private String titulo,conteudo;
	private Integer likes ;
	
	private List<Comentario>coment=new ArrayList<>();

	public Post(Date moment, String titulo, String conteudo, int likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}
	public List<Comentario> getComent() {
		return coment;
	}
	public void setPostagem(List<Comentario> comentario) {
		coment = comentario;
	}
	public Date getMoment() {
		return moment;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComentario(Comentario comentario) {
		coment.add(comentario);
	}
	@Override
	public String toString() {
		return "Post [moment=" + format.format(moment) + ", titulo=" + titulo + ", conteudo=" + conteudo + ", likes=" + likes
				+ ", coment=" + coment + "]";
	}
	
	
}
