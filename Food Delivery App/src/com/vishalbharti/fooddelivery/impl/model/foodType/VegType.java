package com.vishalbharti.fooddelivery.impl.model.foodType;

public class VegType implements Type {
    @Override
    public TypeFood getType() {
        return TypeFood.VEG;
    }
}
