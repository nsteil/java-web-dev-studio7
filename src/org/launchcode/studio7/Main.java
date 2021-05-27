package org.launchcode.studio7;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
    CD fireMixtape = new CD("Nate's Fire Beats", 700, new ArrayList<>(Arrays.asList("Track #1","Spicy Second","Twisted Third","The Finale")));
    fireMixtape.playMedia();
    fireMixtape.skipToTrack(3);
    fireMixtape.burnDisc(450);
        // TODO: Call each CD and DVD method to verify that they work as expected.
    DVD newMovie = new DVD("Jumanji", 17408,new ArrayList<>(Arrays.asList("Jumanji Menu", "Jumanji Movie", "Jumanji Bonus Features")));
    newMovie.playMedia();
    newMovie.burnDisc(2048);
    newMovie.spinDisc();
    fireMixtape.spinDisc();
    }
}
