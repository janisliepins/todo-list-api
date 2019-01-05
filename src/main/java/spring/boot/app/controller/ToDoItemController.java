package spring.boot.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.app.model.ToDoItem;
import spring.boot.app.service.ToDoItemService;

@RestController
public class ToDoItemController {
	
	@Autowired
	private ToDoItemService toDoService;
	
	@GetMapping("/todos")
	public List<ToDoItem> getAllItems(){
		return toDoService.getAllToDoItems();
	}
	
	@GetMapping("/todos/{id}")
	public ToDoItem getItem(@PathVariable String id){
		return toDoService.getToDo(id);
	}
	
	@PostMapping("/todos")
	public void addItem(@RequestBody ToDoItem todo){
		toDoService.addToDo(todo);
	}
	
	@PutMapping("/todos/{id}")
	public void updateItem(@RequestBody ToDoItem todo){
		toDoService.updateToDo(todo);
	}
	
	@DeleteMapping("/todos/{id}")
	public void deleteItem(@PathVariable String id){
		toDoService.deleteToDo(id);
	}	

}
