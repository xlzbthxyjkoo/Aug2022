package com.example.todo.controller;

import com.example.todo.dto.Member;
import com.example.todo.dto.Todo;
import com.example.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@SessionAttributes("loginUser")
public class TodoController {
    private final TodoService todoService;
    @RequestMapping("/todos")
    public String list(Model model){
        model.addAttribute("todos",todoService.todos());
        return "todos";
    }
    @RequestMapping("/todos/{memberId}")
    public String membrsTodo(@PathVariable Long memberId,Model model){
        model.addAttribute("todos",todoService.byMemberTodos(memberId));
        return "todos";
    }
    @PostMapping("/todo/add")
    @ModelAttribute("loginUser")
    public RedirectView add(Model model, @RequestParam String todo){
        Member  loginUser = (Member)model.getAttribute("loginUser");
        if(todo == null || todo == ""){
            return new RedirectView("/todos");
        }else {
            Todo todoE = new Todo(todo);
            todoE.setMember(loginUser);

            todoService.addTdoo(todoE);
            return new RedirectView("/todos");
        }
    }
    @GetMapping("/todo/del/{id}")
    public RedirectView del(@PathVariable Long id){
        todoService.delTodo(id);
        return new RedirectView("/todos");
    }
    @GetMapping("/todo/update/{id}")
    public RedirectView update(@PathVariable Long id){
        todoService.updateTodo(id);
        return new RedirectView("/todos");
    }
}
