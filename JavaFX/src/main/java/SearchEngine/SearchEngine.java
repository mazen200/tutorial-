package SearchEngine;

import com.example.javafx.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchEngine {
    ArrayList<String> booksTitle = new ArrayList<>();

    ArrayList<String> authors = new ArrayList<>();
    void uploadAllBooks (){
        for (Book book:
             Book.books) {
            booksTitle.add(book.getTitle());
            authors.add(book.getAuthor());
        }
    }
}
