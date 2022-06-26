import java.util.*;
import java.time.*;

class Books{
    private String title;
    private String author;
    private int date;

    public Books(String author,String title,int date){
        this.author=author;
        this.title=title;
        this.date=date;

    }
    @Override
    public boolean equals(Object o){
        Books a = (Books)o;
        return (this.author==a.author&&this.title==a.title&&this.date==a.date);

    }

    @Override
    public int hashCode(){
        return Objects.hash(date,title,author);

    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getDate(){
        return date;
    }
    @Override
    public String toString(){
        return "Autor: "+getAuthor()+" "+" Tytul: \""+getTitle()+"\" "+" Data: "+getDate();

    }

}
class HashBook{

    public void getBooks(){


        Books b1 = new Books("Kathy Sierra","Rusz Głowa Java",2011);
        Books b2 = new Books("Robert C. Martin","Czysty Kod",2009);
        Books b3 = new Books("Adam Mickiewicz","Pan Tadeusz",1834);
        Books b4 = new Books("Henryk Sienkiewicz","Potop",1886);
        Books b5 = new Books("Henryk Sienkiewicz","Ogniem i Mieczem",1884);

        Set<Books> booksSet = new HashSet<>();
        booksSet.add(b1);
        booksSet.add(b2);
        booksSet.add(b3);
        booksSet.add(b4);
        booksSet.add(b5);
        for (Books thebooks: booksSet) {
            if ( thebooks.getDate()<= 2010) {
                System.out.println(thebooks);
            }};


    }
}

public class Kodilla {
    public static void main (String[] args) {
        HashBook hashbook = new HashBook();
        hashbook.getBooks();
    }
}