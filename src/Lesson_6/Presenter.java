package Lesson_6;

public class Presenter {
    View view;
    Model model;
    String typeOper;

    public Presenter(Model m, View v, String type) {
        model = m;
        view = v;
        typeOper = type;
    }

    public void buttonClick() {
        String caption;
        int a = view.getValue("Число 1: ");
        int b = view.getValue("Число 2: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        switch (typeOper) {
            case ("sum"):
                caption = "Сумма";
                break;
            case ("mult"):
                caption = "Произведение";
                break;
            case ("diff"):
                caption = "Разница";
                break;
            case ("divide"):
                caption = "Отношение";
                break;
            default:
                caption = "Сумма";
                break;
        }
        view.print(result, caption + ": ");
    }
}