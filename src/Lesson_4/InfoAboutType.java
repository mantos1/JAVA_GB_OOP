package Lesson_4;

public interface InfoAboutType<T> {

    public default String getTypeObject(T Object) {
        String result = "";
        String type = Object.getClass().getName().toString();
        type = type.substring(type.indexOf(".") + 1, type.length());

        if (type.equalsIgnoreCase("Vampire")) {
            result = "Вампир";
        } else if (type.equalsIgnoreCase("Human")) {
            result = "Человек";
        }
        return result;
    }
}
