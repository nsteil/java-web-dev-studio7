package org.launchcode.studio7;

import java.security.PublicKey;
import java.util.ArrayList;


public class DVD extends BaseDisc implements OpticalDisc{
    private final static double TRANSFER_SPEED = 11;
    private double storageRemaining = getStorageCapacity();

    protected DVD(String aName, double aStorageCapacity, ArrayList<String> aContents) {
        super(aName, aStorageCapacity, aContents);
    }



    @Override
    public void playMedia() {
        System.out.println("Welcome to Jumanji!\n1) Menu\n2) Bonus Features");
    }

    @Override
    public void burnDisc(double mediaSize) {
        if (storageRemaining < mediaSize) {
            System.out.println("Not enough room on the disc!");
        } else {
            storageRemaining -= mediaSize;
            System.out.println("It will take approximately " + (mediaSize/TRANSFER_SPEED) + " seconds to finish burning the disc. There will be " + storageRemaining + " MB left on this disc.");
        }
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
