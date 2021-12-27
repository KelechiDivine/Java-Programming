package hackerRank.algo_expert;

public class ValueInBst {

    public int findSearchTree(BST tree, int target){
        BST g = tree.left;
        BST h = tree.right;

        return -1;
    }

    public void value(int numberOfTree, int [] givenArray){
        int countTree = 0;

        for (int treeNumberVariable = 0; treeNumberVariable < numberOfTree - 1 ; treeNumberVariable++){
            if (givenArray[treeNumberVariable] == givenArray[treeNumberVariable] - 1){
                countTree++;
                treeNumberVariable +=1;
            }
        }
    }

}
