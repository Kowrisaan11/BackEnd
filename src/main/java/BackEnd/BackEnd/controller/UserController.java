package BackEnd.BackEnd.controller;

import BackEnd.BackEnd.model.User;
import BackEnd.BackEnd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user added";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
