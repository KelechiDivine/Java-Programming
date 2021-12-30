package hackerRank.algo_expert;

import hackerRank.StringCalculation;

public class ValueInBst {
    private BST bst;
    private final StringCalculation stringCalculation = new StringCalculation();

    /* Write a function that takes in a tree and  an integer value and returns the closest value to that target value.
     */

    public int findClosetValueInBST(BST tree, int target) {
        int closestBSTValue = 0;

        for (int i = 0; i < tree.value; i++) {
            closestBSTValue = tree.value;
            if (closestBSTValue == target) {
                System.out.println();
            }
        }
        return -1;
    }

    public int value(int numberOfTree, int[] givenArray) {
        int countTree = 0;
        for (int treeNumberVariable = 0; treeNumberVariable < numberOfTree - 1; treeNumberVariable++) {
            if (givenArray[treeNumberVariable] == givenArray[treeNumberVariable] - 1) {
                countTree++;
                treeNumberVariable += 1;
            }
        }
        return countTree;
    }

    public void checkValueOnTheRightBst() {
        BST[] bstRightValue = new BST[1];
        bst.right = bstRightValue[0];

        if (bst.left.value == bst.right.value) {
            throw new IllegalArgumentException("The left node can't be equals to the right node.");
        }

        if (bst.left.value > bst.right.value) {
            throw new IllegalArgumentException("The left node can't be greater than the right node.");
        }
    }

    public void checkValueOnTheLeftBst() {
        BST[] bstLeftValue = new BST[1];
        bst.left = bstLeftValue[0];

        if (bst.left.value == bst.right.value) {
            throw new IllegalArgumentException("The left node can't be equals to the right node.");
        }

        if (bst.left.value > bst.right.value) {
            throw new IllegalArgumentException("The left node can't be greater than the right node.");
        }
    }

//    By taking the difference of target and number i.e. target – number or number – target. A negative or positive difference will indicate the direction to move ( left or right). For this program, we are not worrying about the nature of difference so we will use absolute value. We can use Maths.abs() here.
}
