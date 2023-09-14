package com.geekster.todoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    List<User> todoList;

    //create todos -Post APIs

    //add a todo

    @PostMapping("uadd")
    public String addTodo(@RequestBody User myTodo)
    {
        todoList.add(myTodo);
        return "user added";
    }



    // get api

    //get all todos:

    @GetMapping("ulist")
    public List<User> getAllTodos()
    {
        return  todoList;
    }

    @GetMapping("oneuser/{id}")
    public User getAllTodos(@PathVariable Integer id)
    {

        for(User todo : todoList)
        {
            if(todo.getTodoId().equals(id)) {
                return todo;
            }
        }
        return null;
    }


    //update todo :

    // send a todo id :id1 and status:s1

    @PutMapping("todo/id/{id}/address")
    public String setTodoStatusById(@PathVariable Integer id,@RequestParam String address)
    {
        for(User todo : todoList)
        {
            if(todo.getTodoId().equals(id))
            {
                todo.setAddress(address);
                return "user: "   + id  + "updated to " +  address;
            }
        }

        return "Invalid id";
    }


    //delete api

    @DeleteMapping("udel/id/{id}")
    public String removeTodoById(@PathVariable Integer id)
    {
        for(User todo : todoList)
        {
            if(todo.getTodoId().equals(id))
            {
                todoList.remove(todo);
                return "user: "   + id  + " removed";
            }
        }

        return "Invalid id";
    }


    //get all done todos
    //add a list of todos
}
