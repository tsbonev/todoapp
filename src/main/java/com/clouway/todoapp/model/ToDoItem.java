package com.clouway.todoapp.model;

public class ToDoItem implements Comparable<ToDoItem> {

    private Long id;
    private String name;
    private boolean completed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(ToDoItem o) {
        return Long.compare(this.getId(), o.getId());
    }
}
