import Concrete.UserManager;
import Concrete.UserValidationManager;
import Entities.Campaign;
import Entities.User;

public class Main {
    public static void main(String[] args){
        Campaign campaign=new Campaign();
        campaign.setId(1);
        campaign.setUserId(1);
        campaign.setGame("Civ VI");
        campaign.setPrice(100);
        campaign.setDiscount(60);

        User user=new User();
        user.setId(1);
        user.setFirstName("Melih");
        user.setLastName("Sahtiyan");
        user.setPassword("123456");
        user.setIdentityNumber("12345678910");
        user.setDateOfBirth("11/11/1991");
        user.setUserName("mgmgpltfrm");
        user.setUserValidation(false);

        UserManager userManager=new UserManager(new UserValidationManager());
        userManager.add(user);
        System.out.println(campaign.getPriceAfterSale());
    }
}
