package com.max.task.classesandobjects.task15.service;

import com.max.task.classesandobjects.task12and13and14.Book;

import java.util.Comparator;

/**
 * The comparator that sort by author.
 *
 * @author Maxim Semenko
 */
public class SortByAuthorService implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
