package com.max.task.javafundamentals.task8;

import com.max.task.javafundamentals.task8.service.ListService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 11));
        List<Integer> from = new ArrayList<>(Arrays.asList(-1, 3, 4, 4, 5, 5, 5, 6, 7, 7, 9, 9, 9));
        ListService listService = new ListService();

        List<Integer> indexes = listService.findIndexes(in, from);
        System.out.println("Куда нужно вставлять, с учетом вставки слева направо " + indexes);
    }


}

