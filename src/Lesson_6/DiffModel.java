package Lesson_6;

public class DiffModel extends CalcModel {

    public DiffModel() {

    }

    @Override
    public int result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}