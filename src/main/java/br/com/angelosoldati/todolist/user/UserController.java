package br.com.angelosoldati.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;

/**
 * Modificador
 * Public
 * Private
 * Protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  /*
   * String (Texto)
   * Interger (int)
   * Double
   * Float
   * char
   * Date
   * void
   */
  @PostMapping("/")
  public UserModel create(@RequestBody UserModel userModel) {

    var user = this.userRepository.findByUsername(userModel.getUsername());

    if (user != null) {
      System.out.println("Usuário Já existe	");
      return null;
    }

    var userCreated = this.userRepository.save(userModel);
    return userCreated;
  }

}
