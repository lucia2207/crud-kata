package co.com.sofka.crudkata.service;

import co.com.sofka.crudkata.models.TodoModel;
import co.com.sofka.crudkata.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<TodoModel> list(){
        return repository.findAll();
    }

    public TodoModel save(TodoModel todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public TodoModel get(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
