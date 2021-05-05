package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign){
        System.out.println(campaign.getGame() + "'ya %"+ campaign.getDiscount() + "indirim uygulandı" );
    }

    @Override
    public void update(Campaign campaign){
        System.out.println("Kampanya güncellendi " + campaign.getGame() + " fiyatını kontrol ediniz");
    }

    @Override
    public void delete(Campaign campaign){
        System.out.println("Kampanyamız sona ermiştir " + campaign.getGame() + " fiyatını kontrol ediniz");
    }
}
