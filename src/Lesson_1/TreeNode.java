package Lesson_1;

public class TreeNode {
    private String name = "";
    private Integer lengthTreeDef = 0;
    private Integer levelDef = 0;
    TreeNode[] children;

    TreeNode(String nameNode, int lengthTree, int level) {
        name = nameNode;
        lengthTreeDef = lengthTree;
        levelDef = level;

        children = new TreeNode[lengthTree];

        int i = 0;
        while (i < lengthTree) {
            children[i] = null;
            i += 1;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getLengthTreeDef() {
        return lengthTreeDef;
    }
    public Integer getLevelDef() {
        return levelDef;
    }

}
