public class Node {

    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public String toString() {
        return "The value of this Node is: " + value + ". Left Child: " + leftChild + ". Right Child: " + rightChild;
    }

}
