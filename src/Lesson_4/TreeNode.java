package Lesson_4;

public abstract class TreeNode {
    private String name = "";
    private Integer lengthTreeDef = 0;
    private Integer levelDef = 0;
    TreeNode[] children;

    TreeNode(String nameNode, int lengthTree, int level) {
        this.name = nameNode;
        this.lengthTreeDef = lengthTree;
        this.levelDef = level;

        this.children = new TreeNode[lengthTree];

        int i = 0;
        while (i < lengthTree) {
            this.children[i] = null;
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
