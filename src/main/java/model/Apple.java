package model;

import static model.constants.Colour.colour1;
import static model.constants.Colour.colour2;
import static model.constants.Discount.greenSale;
import static model.constants.Discount.redSale;

public class Apple extends Food implements Discountable {
    private String colour;
    private boolean isVegetarian;

    public Apple(int amount, int price, String colour) {
        super(amount, price, true);
        this.colour = colour;
        this.isVegetarian = super.isVegetarian;
    }

    @Override
    public double getDiscount() {
        if (colour == colour1) {
            return redSale;
        } else if (colour == colour2) {
            return greenSale;
        } else {
            return 0;
        }
    }

    public boolean getIsVegetarianApple() {
        return isVegetarian;
    }
}


