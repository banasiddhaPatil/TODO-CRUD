package Repository;

import model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepo {
    @Autowired
    private List<Todo> myTodos;

    public List<Todo> getMyTodos() {
        return myTodos;
    }


    public void remove(Todo todo) {
        myTodos.remove(todo);
    }

    public void add(Todo todo) {
        myTodos.add(todo);
    }
}
