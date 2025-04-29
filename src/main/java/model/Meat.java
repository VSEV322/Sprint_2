package model;

public class Meat extends Food {
    private boolean isVegetarian;
    public Meat (int amount, double price)
    {
        super(amount,price,false);
        this.isVegetarian = super.isVegetarian;

    }
    public boolean getIsVegetarianMeat()
    {
        return isVegetarian;
    }

}

