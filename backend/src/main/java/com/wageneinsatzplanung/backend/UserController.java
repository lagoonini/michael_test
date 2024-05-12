package com.wageneinsatzplanung.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usermanager")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    /*@PostMapping(path ="/users")
    void addUser(@RequestBody UserPojo user) {
        userRepository.save(new User(user.name, user.email));
    }*/

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
