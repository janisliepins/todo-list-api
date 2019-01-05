package spring.boot.app.repo;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import spring.boot.app.model.ToDoItem;

@EnableScan
public interface ToDoItemRepository extends CrudRepository<ToDoItem, String>{

}
