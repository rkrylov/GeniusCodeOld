package HomeWork.Lesson_5;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int x = 0; x < 11; x++)
            list.add(x);
        list.remove(5);

        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list.contains(4));
        System.out.println(list.toString());
        System.out.println(list.size());

        list.clear();

        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(5));
    }
}