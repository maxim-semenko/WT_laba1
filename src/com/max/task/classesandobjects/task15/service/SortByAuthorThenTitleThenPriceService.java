package com.max.task.classesandobjects.task15.service;

import com.max.task.classesandobjects.task12and13and14.Book;

import java.util.Comparator;

/**
 * The comparator that sort by title and then price.
 *
 * @author Maxim Semenko
 */
public class SortByAuthorThenTitleThenPriceService implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public SortByAuthorThenTitleThenPriceService() {
        comparator = new SortByAuthorThenTitleService().thenComparing(new SortByPriceService());
    }

    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return comparator.compare(book1, book2);
    }
}
