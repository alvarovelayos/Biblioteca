
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ebook1 = new Scanner(System.in);
        Library ebook = new Library();
        
        System.out.println("Introduce el isbn del libro");
        ebook.setIsbn(ebook1.nextInt());

        System.out.println("Indroduce el titulo del libro");
        ebook.setTitle(ebook1.nextLine());

        System.out.println("Indroduce autor:");
        ebook.setAuthor(ebook1.nextLine());

        System.out.println("Indroduce genero:");
        ebook.setGenre(ebook1.nextLine());

        System.out.println("Indroduce fecha publicacion:");
        ebook.setPublicationDate(ebook1.nextLine());

        System.out.println("El libro introducido por el bibliotecario es: ");
        System.out.println("El isbn: " + ebook.getIsbn());
        System.out.println("titulo: " + ebook.getTitle());
        System.out.println("autor: " + ebook.getAuthor());
        System.out.println("genero: " + ebook.getGenre());
        System.out.println("fecha publicacion: " + ebook.getPublicationDate());
    }

}
