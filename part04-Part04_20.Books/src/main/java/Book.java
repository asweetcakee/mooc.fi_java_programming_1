/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.publicationYear = year;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
    
    public void listItemsExtractor(Book book, String answer){
        if (answer.equals("everything")){
            System.out.println(book.toString());
        } else if (answer.equals("name")){
            System.out.println(book.getTitle());
        } else {
            System.out.println();
        }  
    }
    
}
