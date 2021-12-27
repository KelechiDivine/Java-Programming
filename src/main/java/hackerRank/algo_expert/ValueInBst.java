package hackerRank.algo_expert;

public class ValueInBst {
    private BST bst;

    /* Write a function that takes in a tree and  an integer value and returns the closest value to that target value.
     */

    public int findClosetValueInBST(BST tree, int target){
        if (target == 0){
            throw new NullPointerException("The target value can't be null.");
        }

        if (target < 0){
            throw new ArrayIndexOutOfBoundsException("Tree number can't be an integer.");
        }

        if (tree.left.value >= 0 ){
            checkValueOnTheLeftBst();
        }

        if (tree.right.value >= 0){
            checkValueOnTheRightBst();
        }

       return -1;
    }

//    TODO: Create a method that receives the assigned number of trees a user number wants.
    public int value(int numberOfTree, int [] givenArray){
//        TODO: Create a count variable and assign it to 0
        int countTree = 0;

//        TODO: Loop through the number of trees a user will enter
        for (int treeNumberVariable = 0; treeNumberVariable < numberOfTree - 1 ; treeNumberVariable++){
//            TODO: Check if the number of trees a user enter is equals to the number od trees assigned by a user
            if (givenArray[treeNumberVariable] == givenArray[treeNumberVariable] - 1){
                countTree++;
                treeNumberVariable +=1;
            }
        }
//        TODO: Return the trees
        return countTree;
    }

    public void checkValueOnTheRightBst(){
        BST[] bstRightValue = new BST[1];

        bst.right = bstRightValue[0];

        if (bst.left.value == bst.right.value) {
            throw new IllegalArgumentException("The left node can't be equals to the right node.");
        }

        if (bst.left.value> bst.right.value){
            throw new IllegalArgumentException("The left node can't be greater than the right node.");
        }
}


    public void checkValueOnTheLeftBst(){
        BST[] bstLeftValue = new BST[1];

        bst.left = bstLeftValue[0];

        if (bst.left.value == bst.right.value) {
            throw new IllegalArgumentException("The left node can't be equals to the right node.");
        }

        if (bst.left.value> bst.right.value){
            throw new IllegalArgumentException("The left node can't be greater than the right node.");
        }
    }
}
