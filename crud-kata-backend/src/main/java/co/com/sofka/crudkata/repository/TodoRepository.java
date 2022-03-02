package co.com.sofka.crudkata.repository;

import co.com.sofka.crudkata.models.TodoModel;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <TodoModel , Long> {

}

