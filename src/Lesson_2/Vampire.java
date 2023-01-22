package Lesson_2;

public class Vampire extends TreeNode implements AddChild, InfoAboutChild {
    private String genderVampire;
    Vampire(String nameNode, int lengthTree, int level, String gender) {
        super(nameNode, lengthTree, level);
        genderVampire = gender;
    }

    public void getGenderVampire () {
        String gender = this.genderVampire;

        if (gender == "муж") {
            gender = "Мужчина";
        } else {
            gender = "Женщина";
        }
        System.out.println(this.getName() + " имеет пол: " +  gender);
    }

    @Override
    public String SearchChild(TreeNode root, String parentName, Integer childNumber) {
        return InfoAboutChild.super.SearchChild(root, parentName, childNumber);
    }
    public void getSearchCildVampire (String parentName, Integer childNumber) {
        System.out.println(SearchChild(this, parentName, childNumber));
    }

    @Override
    public void GetAllChildren(TreeNode root) {
        InfoAboutChild.super.GetAllChildren(root);
    }
    public void getAllChildrenVampire () {
        GetAllChildren(this);
    }
}
