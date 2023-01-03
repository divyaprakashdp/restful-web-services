package com.sprinfgDemo.rest.webServices.todo;

import com.sprinfgDemo.rest.webServices.todo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TodoResource {

    @Autowired
    private TodoHardcodedService todoService;


    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        Todo todo = todoService.deleteById(id);
        if(todo!=null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> updateTodo(@PathVariable String username, @PathVariable long id){
        Todo todo = todoService.deleteById(id);
        if(todo!=null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return todoService.getAll();
    }


//    @GetMapping("/users/{username}/todos")
//    public List<Todo> getTodosById(@PathVariable long ID){
//        return todoService.getById(ID);
//    }
}
