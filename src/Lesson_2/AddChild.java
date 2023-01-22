package Lesson_2;

public interface AddChild {
    public default void addChildren (TreeNode root, TreeNode ... child) {
        int max_iter = 0;

        if (root.getLengthTreeDef() < child.length) {
            max_iter = root.getLengthTreeDef();
        } else {
            max_iter = child.length;
        }
        for (int i = 0; i < max_iter; ++i) {
            root.children[i] = child[i];
        }
    }
}
