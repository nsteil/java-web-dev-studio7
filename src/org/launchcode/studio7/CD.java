package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
   private final static double TRANSFER_SPEED = 1.5;
   private double remainingCapacity = getStorageCapacity();




    public CD(String aName, double aStorageCapacity, ArrayList<String> aSomeContents){
        super(aName,aStorageCapacity,aSomeContents);
    }

    @Override
    public void playMedia() {
        System.out.println("Playing " + getContents().get(0) + " now!");
    }

    @Override
    public void burnDisc(double mediaSize) {
        if (remainingCapacity < mediaSize) {
            System.out.println("Not enough room on the disc!");
        } else {
            remainingCapacity -= mediaSize;
            System.out.println("It will take approximately " + (mediaSize/TRANSFER_SPEED) + " seconds to finish burning the disc. There will be " + remainingCapacity + " MB left on this disc.");
        }
    }

    public void skipToTrack(int track) {
        System.out.println("Jumping to track " + track + ". Now playing "  + getContents().get(track-1));
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
