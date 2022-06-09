public class KdNode {

    // member variables
    public KdNode left;
    public KdNode right;
    public double[] coords;
    //public double dimensions = coords.length;

    // constructor
    public KdNode(KdNode left, KdNode right, double[] coords){
        left = left;
        right = right;
        coords = coords;
    }

    public KdNode(String coordsString) {
        String[] coordStrings = coordsString.split(",");
        coords = new double[coordStrings.length];
        for (int i = 0; i < coordStrings.length; i++) {
            coords[i] = Double.parseDouble(coordStrings[i]);
        }
    }

    // getters & setters
    public KdNode getLeft() {
        return left;
    }

    public KdNode getRight() {
        return right;
    }

    public double[] getCoords() {
        return coords;
    }
/*
    public void setDimensions() {
        dimensions = coords.length;
    }
*/

}
