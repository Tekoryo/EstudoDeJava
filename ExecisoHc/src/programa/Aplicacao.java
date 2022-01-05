package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


import entides.Post;
import entides.Comentario;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		Scanner Sc=new Scanner(System.in);
		SimpleDateFormat Sd=new SimpleDateFormat();
		
		System.out.print("Quatidade de postagem: ");
		int n=Sc.nextInt();
		Post[] post=new Post[n];
		for(int i=0;i<post.length;i++) {
			System.out.print("Momento da postagem: ");
			String Mp=Sc.next();
			System.out.print("Titulo da postagem: ");
			String Tp=Sc.next();
			System.out.print("Conteúdo da postagem: ");
			String Cp=Sc.next();
			System.out.print("Likes: ");
			int Likes=Sc.nextInt();
			System.out.print("Quatos comentarios: ");
			int Qc=Sc.nextInt();
			for(int c=1;c<Qc;c++) {
				System.out.print("Dígite o comentario #"+c+": ");
				String comentario=Sc.next();
				post[i].addComentario(new Comentario(comentario));
				
			}
			post[i]=new Post(Sd.parse(Mp),Tp,Cp,Likes);
		}
		for(Post p: post) {
			System.out.println(p.toString());
		}
		
		
		
		
		
		Sc.close();
	}

}
