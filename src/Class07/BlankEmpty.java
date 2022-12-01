package Class07;

public class BlankEmpty {
    public static void main(String[] args) {
        String blank = " ";
        String empty = " ";
        System.out.println("empty = " + empty.isEmpty()); //space is considered a character in java, so this is not empty
        System.out.println("blank = " + blank.isBlank());
    }
}
