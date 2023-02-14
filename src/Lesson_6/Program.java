package Lesson_6;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View(), "sum");
        p.buttonClick();
        Presenter p2 = new Presenter(new MultModel(), new View(), "mult");
        p2.buttonClick();
        Presenter p3 = new Presenter(new DiffModel(), new View(), "diff");
        p3.buttonClick();
        Presenter p4 = new Presenter(new DivideModel(), new View(), "divide");
        p4.buttonClick();
    }
}