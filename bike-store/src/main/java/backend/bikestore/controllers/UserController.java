package backend.bikestore.controllers;

import backend.bikestore.dtos.UserDto;
import backend.bikestore.models.User;
import backend.bikestore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User save(@RequestBody UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody UserDto userDto){
        User user = userRepository.findByEmail(userDto.getEmail());
        if(user.getPassword().equals(userDto.getPassword())){
            return user;
        }
        return null;
    }

}
