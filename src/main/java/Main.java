import model.Apple;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.colour1;
import static model.constants.Colour.colour2;


public class Main {
    public static void main(String[] args) {
        //создание обьектов
        Meat meat = new Meat(5, 100);
        Apple greenApple = new Apple(8, 60, colour2);
        Apple redApple = new Apple(10, 50, colour1);
        // Массив
        ShoppingCart can = new ShoppingCart(meat,greenApple,redApple);
        System.out.println("Общая сумма товаров без скидки = " + can.getPriceAll());
        System.out.println("Общая сумма товаров со скидкой = " + can.getPriceWithDiscount(redApple.getDiscount(), greenApple.getDiscount()));
        System.out.println("Сумма всех вегетарианских продуктов без скидки = " + can.getPriceForVegetarian(meat.getIsVegetarianMeat(), greenApple.getIsVegetarianApple(), redApple.getIsVegetarianApple()));
    }
}