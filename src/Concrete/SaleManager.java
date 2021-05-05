package Concrete;

import Abstract.SaleService;
import Entities.Sale;

public class SaleManager implements SaleService {
    @Override
    public void add(Sale sale){
        System.out.println(sale.getGame() + " sepete eklendi");
    }

    @Override
    public void delete(Sale sale){
        System.out.println(sale.getGame() + " sepetten çıkarıldı");
    }
}
