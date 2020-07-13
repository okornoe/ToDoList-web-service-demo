package com.t.todolist;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private ArrayList<Task> tasks = new ArrayList<>();


    public TaskController() {
    }

    @PostMapping(path = "/tasks")
    public void addTask(@RequestBody Task task) {
        tasks.add(task);
    }

    @GetMapping(path = "/tasks/{id}")
    public Task getTask(@PathVariable int id) {
        return tasks.get(id - 1);
    }
}
