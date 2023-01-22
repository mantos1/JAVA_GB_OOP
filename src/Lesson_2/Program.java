package Lesson_2;

public class Program {
    public static void main(String[] args) {
        Vampire mainVampire = new Vampire("Дракула", 3, 0, "муж");

        //Создание и добавление детей
        Vampire Child1 = new Vampire("Сын Дракулы", 5, 1, "муж");
        Vampire Child2 = new Vampire("Первая дочь Дракулы", 1, 1, "жен");
        Vampire Child3 = new Vampire("Вторая дочь Дракулы", 2, 1, "жен");
        mainVampire.addChildren(mainVampire, Child1, Child2, Child3);

        //Создание и добавление внуков
        Vampire grandSon1 = new Vampire("Первый внук Дракулы от сына", 2, 2, "муж");
        Vampire grandSon2 = new Vampire("Второй внук Дракулы от сына", 2, 2, "муж");
        Vampire grandSon3 = new Vampire("Третий внук Дракулы от сына", 2, 2, "муж");
        Vampire grandSon4 = new Vampire("Четвертый внук Дракулы от сына", 2, 2, "муж");
        Child1.addChildren(Child1, grandSon1, grandSon2, grandSon3, grandSon4);

        //Поиск конкретного ребенка по порядковому номеру
        mainVampire.getSearchCildVampire("Сын Дракулы", 2);

        System.out.println("------------------\n");

        //Вывод всех детей
        mainVampire.getAllChildrenVampire();

        System.out.println("------------------\n");

        grandSon3.getGenderVampire();

    }
}
