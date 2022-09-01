package mvcTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	@RequestMapping("/todos")
	public String list(Model model) {
		return "todo/todoList";
	}
}
