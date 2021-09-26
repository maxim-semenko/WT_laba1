package com.max.task.classesandobjects.task15.service;

import com.max.task.classesandobjects.task12and13and14.Book;

import java.util.Comparator;

/**
 * The comparator that sort by author and then title.
 *
 * @author Maxim Semenko
 */
public class SortByAuthorThenTitleService implements Comparator<Book> {

    Comparator<Book> comparator;

    public SortByAuthorThenTitleService() {
        comparator = new SortByAuthorService().thenComparing(new SortByTitleService());
    }

    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return comparator.compare(book1, book2);
    }

}
