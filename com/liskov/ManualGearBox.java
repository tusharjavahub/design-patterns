package com.liskov;

import com.liskov.GearBox;

class ManualGearBox extends GearBox {

    public void manualGearShift(){
        System.out.println("Manually shifting the gear ");
    }
}