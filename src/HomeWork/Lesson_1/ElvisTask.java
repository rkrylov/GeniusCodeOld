package HomeWork.Lesson_1;

public class ElvisTask {
    public static void main(String[] arg){
        System.out.println(match(1,2,1,0));
    }

    static int match(int a, int b, int c, int d){
        int result;
        result = (a>=b&&c>=b)||(a<=b&&c<=d) ? (a==c&&b==d ? 2 : 1) : 0;
        return result;
    }
}
