package com.company;

import java.util.Arrays;
import java.util.Objects;

class library{
//    int n;
    String []Total_books=new String[5];
    String []Available_books=new String[5];
    String []issued_books=new String[5];

    public void setTotalBooks(String...Total_books){
        this.Total_books=Total_books;
    }
    public void toIssueBooks(String...books_to_issue){
        this.issued_books=books_to_issue;
    }
    public void issueInProcess(){
        for (String element:issued_books) {
            for (int i = 0; i < 5; i++) {
                if (!Objects.equals(Total_books[i], element)) {
                    Available_books[i]=Total_books[i];
                }
                else{
                    Total_books[i]=null;
                }
            }
        }

    }
    public void issueCompleted(){
        System.out.println("Issued Books from library: "+Arrays.toString(issued_books));
        System.out.println("Available Books in library: "+Arrays.toString(Available_books));
    }
}

public class CWH_28_libraryManagementSystem {
    public static void main(String[] args) {
        library obj28 = new library();
        obj28.setTotalBooks("Harry Potter", "Sherlock Holmes", "GOT", "Twilight", "Lord of the rings");
        System.out.println("Total Books in library: "+Arrays.toString(obj28.Total_books));
        obj28.toIssueBooks("Harry Potter");
        obj28.issueInProcess();
        obj28.issueCompleted();
        obj28.toIssueBooks("GOT");
        obj28.issueInProcess();
        obj28.issueCompleted();

    }
}
