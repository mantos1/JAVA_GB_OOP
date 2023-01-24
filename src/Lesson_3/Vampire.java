package Lesson_3;

public class Vampire extends TreeNode implements AddChild, InfoAboutChild, Comparable<Vampire> {
    private String genderVampire;
    private Integer ageVampire;

    Vampire(String nameNode, int lengthTree, int level, String gender, Integer age) {
        super(nameNode, lengthTree, level);
        genderVampire = gender;
        ageVampire = age;
    }


    public void getGenderVampire() {
        String gender = this.genderVampire;

        if (gender == "муж") {
            gender = "Мужчина";
        } else {
            gender = "Женщина";
        }
        System.out.println(this.getName() + " имеет пол: " + gender);
    }

    public Integer getAgeVampire() {
        if (ageVampire == null) {
            ageVampire = 0;
        }
        return ageVampire;
    }

    @Override
    public String SearchChild(TreeNode root, String parentName, Integer childNumber) {
        return InfoAboutChild.super.SearchChild(root, parentName, childNumber);
    }

    public void printSearchCildVampire(String parentName, Integer childNumber) {
        System.out.println(SearchChild(this, parentName, childNumber));
    }

//    public String getSearchCildVampire(String parentName, Integer childNumber) {
//        return SearchChild(this, parentName, childNumber);
//    }

    @Override
    public TreeNode SearchChildObject(TreeNode root, String parentName, Integer childNumber) {
        return InfoAboutChild.super.SearchChildObject(root, parentName, childNumber);
    }
    public Vampire getSearchCildVampire(String parentName, Integer childNumber) {
        return (Vampire) SearchChildObject(this, parentName, childNumber);
    }

    @Override
    public void GetAllChildren(TreeNode root) {
        InfoAboutChild.super.GetAllChildren(root);
    }

    public void getAllChildrenVampire() {
        GetAllChildren(this);
    }

    @Override
    public int compareTo(Vampire o) {
        if (o == null) {
            return Integer.compare(this.getAgeVampire(), 0);
        } else {
            return Integer.compare(this.getAgeVampire(), o.getAgeVampire());
        }
//        if (this.getAgeVampire() > o.getAgeVampire()) {
//            return 1;
//        } else if (this.getAgeVampire() < o.getAgeVampire()) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
