import java.util.Arrays;

public class Task1 {
    public static void translateNewLanguage(String string) {
        String[] arrStr = string.trim().split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = "п" + arrStr[i];
        }
        System.out.println(String.join(" ", arrStr));
    }

    public static void main(String[] args) {
        String string = "Новый язык для перевода";
        translateNewLanguage(string);
    }
}
//Переводчик с русского на выдуманный прусский: принимается предложение.
// Необходимо каждому слову в предложении прибавить в начале букву п и вывести в консоль результат.