/*
  Nome: Evelyn S. Mafra Bessa,
  Nome: Yago de Almeida Nunes.

    Avaliação 01
*/

import java.io.Reader;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    int op=1;
    Scanner sc = new Scanner(System.in);
    Author author1 = new Author("Machado de Assis", "Brasileiro");
    Author author2 = new Author("Clarice Lispector", "Ucraniana");
    Readers reader1 = new Readers("Victor Pinheiro");
    Readers reader2 = new Readers("Rodrigo Santos");
    author1.addBook("Dom Casmurro");
    author1.addBook("Memórias póstumas de Brás Cubas");
    author2.addBook("O lustre");
    author2.addBook("Laços de família");
    author2.addBook("A hora da estrela");
    reader1.addBooks(author1.getBooks().get(0));
    reader1.addBooks(author1.getBooks().get(1));
    reader2.addBooks(author2.getBooks().get(1));
    Author[] authorList = {author1, author2};
    Readers[] readerList = {reader1, reader2};
    Integer count = 0;
  
    while(op!=0){
      System.out.print("\n");
      System.out.println("===== Menu =====");
      System.out.println("[0] Finalizar Programa");
      System.out.println("[1] Listar Autores");
      System.out.println("[2] Listar livros de autores");
      System.out.println("[3] Buscar Autor de livro");
      System.out.println("[4] Listar leitores de livro");
      System.out.println("[5] Listar livros de leitor");
      System.out.println("Digite a opção: ");
      op = Integer.parseInt(sc.nextLine());
      System.out.print("\n");
      switch(op){
      case 1:
        System.out.println("Lista de Autores: ");
        for (Author author : authorList) {
          System.out.println("- " + author.getName());
        }
        break;
      case 2:
        System.out.println("Digite o nome do autor: ");
        String getAuthor = sc.nextLine();
        for (Author author : authorList) {
           if ((getAuthor.compareTo(author.getName()) == 0)){
             System.out.println("Lista de livros deste autor: ");
             for (Book j : author.getBooks()){
                 System.out.println("- " + j.getTitle());
               }
               count ++;
            }
        }
        if (count == 0){
          System.out.println("Não encontrado");
        }
        count = 0;
        break;
      case 3:
        System.out.println("Digite o título: ");
        String title1 = sc.nextLine();
        for (Author author : authorList) {
           for (Book i : author.getBooks()){
             if ((title1.compareTo(i.getTitle()) == 0)){
               System.out.println("Autor de " + title1+ ": " + author.getName());
               count ++;
               }
            }
        }
        if (count == 0){
          System.out.println("Não encontrado");
        }
        count = 0;
        break;
      case 4:
        System.out.println("Selecione o título: ");
        String title2 = sc.nextLine();
        for (Author author : authorList) {
           for (Book i : author.getBooks()){
             if ((title2.compareTo(i.getTitle()) == 0)){
               System.out.println("Lista de leitores deste livro: ");
               for (Readers j : i.getReaders()){
                 System.out.println("- " + j.getName());
               }
               count ++;
              }
            }
        }
        if (count == 0){
          System.out.println("Não encontrado");
        }
        count = 0;
        break;
      case 5:
        System.out.println("Digite o nome: ");
        String getReader = sc.nextLine();
        for (Readers readers : readerList) {
           if ((getReader.compareTo(readers.getName()) == 0)){
             System.out.println("Lista de livros deste leitor: ");
             for (Book j : readers.getBooks()){
                 System.out.println("- " + j.getTitle());
               }
               count ++;
            }
        }
        if (count == 0){
          System.out.println("Não encontrado");
        }
        count = 0;
        break;
      default:
        System.out.println("Programa Finalizado");
    }
    }
    
  }
}