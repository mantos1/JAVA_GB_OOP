package Lesson_3;

import java.util.ArrayList;

public interface InfoAboutChild {
    public default String SearchChild(TreeNode root, String parentName, Integer childNumber) {
        String child = null;
        if (root.getName() == parentName) {
            if (root.children[childNumber - 1] == null) {
                child = "Нет такого ребенка";
            } else {
                child = root.children[childNumber - 1].getName();
            }
        } else {
            for (int i = 0; i < root.getLengthTreeDef(); ++i) {
                if (root.children[i] != null && child == null) {
                    child = SearchChild(root.children[i], parentName, childNumber);
                }
            }
        }
        return child;
    }

    public default TreeNode SearchChildObject(TreeNode root, String parentName, Integer childNumber) {
        TreeNode child = null;
        if (root.getName() == parentName) {
            if (root.children[childNumber - 1] == null) {
                child = null;
            } else {
                child = root.children[childNumber - 1];
            }
        } else {
            for (int i = 0; i < root.getLengthTreeDef(); ++i) {
                if (root.children[i] != null && child == null) {
                    child = SearchChildObject(root.children[i], parentName, childNumber);
                }
            }
        }
        return child;
    }

    public default void GetAllChildren(TreeNode root) {
        ArrayList<String> childrensAll = new ArrayList<>();
        dfs(root, childrensAll, 0);
        //return childrensAll;
        for (String vamp : childrensAll) {
            if (!vamp.trim().equals(root.getName())) {
                System.out.println(vamp.trim());
            }
        }
    }
    private void dfs(TreeNode root, ArrayList<String> childrensAll, int level) {
        if (root == null) {
            return;
        }
        String s = "";
        s = "-".repeat(level);
        childrensAll.add(s + " " + root.getName());
        for (int i = 0; i < root.getLengthTreeDef(); ++i) {
            if (root.children[i] != null) {
                dfs(root.children[i], childrensAll, root.children[i].getLevelDef());
            }
        }
    }

}
