package spring.boot.app.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ToDoItems")
public class ToDoItem {
	
	private String id;
	private String title;
	private boolean isDone;
	
	public ToDoItem() {
		
	}

	public ToDoItem(String id, String title, boolean isDone) {
		super();
		this.id = id;
		this.title = title;
		this.isDone = isDone;
	}
	
	@DynamoDBHashKey(attributeName = "Id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@DynamoDBAttribute(attributeName = "Title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@DynamoDBAttribute(attributeName = "IsDone")
	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	@Override
	public String toString() {
		return String.format("ToDo[id=%s, title='%s', isDone='%s']", id, title, isDone);
	}

}
