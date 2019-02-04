package com.vishalbharti.fooddelivery.impl.model.foodType;

public class NonVegType implements Type {
    @Override
    public TypeFood getType() {
        return TypeFood.NON_VEG;
    }
}
