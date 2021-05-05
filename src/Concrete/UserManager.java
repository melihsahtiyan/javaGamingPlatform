package Concrete;

import Abstract.UserService;
import Abstract.UserValidationService;
import Entities.User;

public class UserManager implements UserService {

    UserValidationService userValidationService;

    public UserManager(UserValidationManager userValidationService){
        this.userValidationService = userValidationService;
    }

    @Override
    public void add(User user){
        if (userValidationService.validate(user))
        System.out.println("Kullanıcı eklendi");
        System.out.println("Kullanıcı doğrulanamadı");
    }

    @Override
    public void update(User user){
        System.out.println("Kullanıcı güncellendi");
    }

    @Override
    public void delete(User user){
        System.out.println("Kullanıcı silindi");
    }
}
