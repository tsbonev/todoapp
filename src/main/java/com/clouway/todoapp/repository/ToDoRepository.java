package com.clouway.todoapp.repository;

import com.clouway.todoapp.model.ToDoItem;

import java.util.*;

public interface ToDoRepository {

    List<ToDoItem> findAll();
    ToDoItem findById(Long id);
    Long insert(ToDoItem toDoItem);
    void update(ToDoItem toDoItem);
    void delete(ToDoItem toDoItem);

}
