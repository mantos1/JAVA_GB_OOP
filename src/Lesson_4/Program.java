package Lesson_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Vampire mainVampire = new Vampire("Дракула", 3, 0, "муж", 500);

        //Создание и добавление детей
        Vampire Child1 = new Vampire("Сын Дракулы", 5, 1, "муж", 300);
        Vampire Child2 = new Vampire("Первая дочь Дракулы", 1, 1, "жен", 250);
        Vampire Child3 = new Vampire("Вторая дочь Дракулы", 2, 1, "жен", 200);
        mainVampire.addChildren(mainVampire, Child1, Child2, Child3);

        //Создание и добавление внуков
        Vampire grandSon1 = new Vampire("Первый внук Дракулы от сына", 2, 2, "муж", 170);
        Vampire grandSon2 = new Vampire("Второй внук Дракулы от сына", 2, 2, "муж", 140);
        Vampire grandSon3 = new Vampire("Третий внук Дракулы от сына", 2, 2, "муж",160);
        Vampire grandSon4 = new Vampire("Четвертый внук Дракулы от сына", 2, 2, "муж",100);
        Child1.addChildren(Child1, grandSon1, grandSon2, grandSon3, grandSon4);

        //Создаем лист с детьми
        List<Vampire> t = new ArrayList<>();
        for (int i = 1; i <= Child1.getLengthTreeDef(); i++){
            Vampire addChild = Child1.getSearchCildVampire("Сын Дракулы", i);
            if (addChild != null) {
                t.add(Child1.getSearchCildVampire("Сын Дракулы", i));
            };
        }
        //Вывод листа
        System.out.println(t);
        System.out.println("------------------\n");

        //Сортировка по возрасту
        Collections.sort(t);
        System.out.println(t);
        System.out.println("------------------\n");

        //Поиск конкретного ребенка по порядковому номеру
        mainVampire.printSearchCildVampire("Сын Дракулы", 2);

        System.out.println("------------------\n");

        //Вывод всех детей
        mainVampire.getAllChildrenVampire();

        System.out.println("------------------\n");

        //Вывод пола вампира (3 по счету внука)
        grandSon3.getGenderVampire();

        System.out.println("------------------\n");

        Child3.getType();
    }
}
