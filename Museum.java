import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        Painting p1 = new Painting("Mona Lisa", "Leonardo DaVinci", "Oh wow it's smaller than I expected.", "oil");
        Painting p2 = new Painting("A Sunday Afternoon on the Island of La Grande Jatte", "Georges Seurat", "Oh wow it's larger than I expected.", "oil");
        Painting p3 = new Painting("No. 5, 1948", "Jackson Pollock", "I can do this.", "oil");
        Sculpture s1 = new Sculpture("David", "Michelangelo", "Honestly, worth the 2 hour queue.", "oil ... jk marble");
        Sculpture s2 = new Sculpture("Sculptor's Clayground", "Alan Resnick", "Clay is something special for sure!", "clay and nightmares");
        ArrayList<Art> museum = new ArrayList<Art> ();
        museum.add(p1);
        museum.add(p2);
        museum.add(p3);
        museum.add(s1);
        museum.add(s2);
        // Shuffling the ArrayList "museum"
        Collections.shuffle(museum);
        // Viewing all the Art in the museum
        for (Art piece : museum) {
            piece.viewArt();
        }
    }
}
