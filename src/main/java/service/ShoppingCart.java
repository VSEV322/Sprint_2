package service;

import model.Apple;
import model.Food;
import model.Meat;

public class ShoppingCart {
    Food[] bin = new Food[3];

    public ShoppingCart(Meat q, Apple w, Apple c) {
        bin[0] = q;
        bin[1] = w;
        bin[2] = c;
    }

    public double getPriceAll() {
        return (bin[0].getPrice() * bin[0].getAmount()) + (bin[1].getPrice() * bin[1].getAmount()) + (bin[2].getPrice() * bin[2].getAmount());
    }

    public double getPriceWithDiscount(double redSale, double greenSale) {
        return ((bin[0].getPrice() * bin[0].getAmount()) +
                ((bin[1].getPrice() - (greenSale * bin[1].getPrice() / 100)) * bin[1].getAmount()) +
                ((bin[2].getPrice() - (redSale * bin[2].getPrice() / 100)) * bin[2].getAmount())
        );
    }

    public double getPriceForVegetarian(boolean a, boolean b, boolean e) {
        if (a && b && e) // все вегетарианские
        {
            return (bin[0].getPrice() * bin[0].getAmount()) + (bin[1].getPrice() * bin[1].getAmount()) + (bin[2].getPrice() * bin[2].getAmount());
        } else if (a && b && !e) // третий обьект не вегетарианский
        {
            return (bin[0].getPrice() * bin[0].getAmount()) + (bin[1].getPrice() * bin[1].getAmount());
        } else if (a && !b && e) // второй обьект не вегетарианский
        {
            return (bin[0].getPrice() * bin[0].getAmount()) + (bin[2].getPrice() * bin[2].getAmount());
        } else if (!a && b && e) // первый обьект не вегетарианский
        {
            return (bin[1].getPrice() * bin[1].getAmount()) + (bin[2].getPrice() * bin[2].getAmount());
        } else {
            return 0;
        }
    }
}


