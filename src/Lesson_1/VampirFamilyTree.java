package Lesson_1;

import java.util.ArrayList;

public class VampirFamilyTree {
    public static String SearchChild(TreeNode root, String parentName, Integer childNumber) {
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

    public static ArrayList<String> GetAllChildren(TreeNode root) {
        ArrayList<String> childrensAll = new ArrayList<>();
        dfs(root, childrensAll, 0);
        return childrensAll;
    }

    private static void dfs(TreeNode root, ArrayList<String> childrensAll, int level) {
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

    public static void main(String[] args) {
        TreeNode mainVampir = new TreeNode("Дракула", 3, 0);
        mainVampir.children[0] = new TreeNode("Сын Дракулы", 5,1);
        mainVampir.children[1] = new TreeNode("Первая дочь Дракулы", 1,1);
        mainVampir.children[2] = new TreeNode("Вторая дочь Дракулы", 2,1);
        mainVampir.children[0].children[0] = new TreeNode("Первый внук Дракулы от сына", 2,2);
        mainVampir.children[0].children[1] = new TreeNode("Второй внук Дракулы от сына", 2,2);
        mainVampir.children[0].children[2] = new TreeNode("Третий внук Дракулы от сына", 2,2);
        mainVampir.children[0].children[3] = new TreeNode("Четвертый внук Дракулы от сына", 2,2);

        //Поиск конкретного ребенка по порядковому номеру
        System.out.println(SearchChild(mainVampir, "Сын Дракулы", 2) + "\n");

        System.out.println("------------------\n");

        //Вывод всех детей
        ArrayList<String> childAll = GetAllChildren(mainVampir);
        for (String vamp : childAll) {
            if (! vamp.trim().equals(mainVampir.getName())) {
                System.out.println(vamp.trim());
            }
        }
    }
}
