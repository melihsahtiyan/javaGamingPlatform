package Concrete;

import Abstract.UserValidationService;
import Entities.User;

public class UserValidationManager implements UserValidationService {

    @Override
    public boolean validate(User user) {
        if (user.getUserValidation()==true){
            return true;
        }
        return false;
    }
}
