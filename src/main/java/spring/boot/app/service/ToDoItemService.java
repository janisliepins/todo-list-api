package spring.boot.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.app.model.ToDoItem;
import spring.boot.app.repo.ToDoItemRepository;

@Service
public class ToDoItemService {
	
	@Autowired
	private ToDoItemRepository repository;
	
	public List<ToDoItem> getAllToDoItems(){
		List<ToDoItem> toDoItems = new ArrayList<>();
		repository.findAll().forEach(toDoItems::add);
		return toDoItems;
	}
	
	public ToDoItem getToDo(String id) {
		return repository.findOne(id);		
	}
	
	public void addToDo(ToDoItem todo) {
		repository.save(todo);
	}
	
	public void updateToDo(ToDoItem todo) {		
		repository.save(todo);
	}
	
	public void deleteToDo(String id) {
		repository.delete(id);
	}

}
