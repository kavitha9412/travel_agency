package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    private final List<TodoInscription> liste1 = new ArrayList<>();
    private final List<TodoTravels> liste2 = new ArrayList<>();

    @PostMapping(value = "/api/inscription")
    public void AddList(@RequestBody TodoInscription newTodo){
        liste1.add(newTodo);
    }
    @GetMapping(value = "/api/travels")
    public List<TodoTravels> SendList(@RequestParam String userName) {
        liste2.add(new TodoTravels("Caribbean",32.4 ));
        liste2.add(new TodoTravels("Australia",35.1 ));
        return liste2;

    }

}
