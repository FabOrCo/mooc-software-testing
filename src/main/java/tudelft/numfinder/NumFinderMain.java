package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {1, 2, 6, 8, 9, 6, 9, -165, 100});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
