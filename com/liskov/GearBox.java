package com.liskov;

public class GearBox {
    public void gearShift() {
        System.out.println("Gear shifted ");
    }


    public static void main(String[] args) {
        GearBox box = new AutoGearBox();
        box.gearShift();
    }
}
