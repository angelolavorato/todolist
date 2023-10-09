package br.com.angelosoldati.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * Public
 * Private
 * Protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

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
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);

  }

}
