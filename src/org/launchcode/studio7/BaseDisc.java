package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseDisc {
    private String name = new String();
    private double storageCapacity = 0;

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    private ArrayList<String> contents = new ArrayList<>();


    protected BaseDisc(String aName, double aStorageCapacity, ArrayList<String> aContents) {
        this.name = aName;
        this.storageCapacity = aStorageCapacity;
        this.contents = aContents;
    }

    public abstract void playMedia();

    public abstract void burnDisc(double mediaSize);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
