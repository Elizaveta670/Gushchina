import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //считывает то что ввел пользователь
        System.out.println(isPalindrome(scanner.nextLine()));
    }
    public static String reverseString(String s2){
        StringBuilder sb=new StringBuilder();// создаеся отдельный проект, исп чтобы не было проблем с памятью
        for (int i=s2.length()-1;i>=0;i--){
            sb.append(s2.charAt(i));// символ по индексу
        }
        //добавляем символ из с2 на и место
        return sb.toString();
    }
    public  static boolean isPalindrome (String s1){
        return s1.equals(reverseString(s1));//проверка значения равенстваggg
    }
}

