package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result < 0) {
            throw new ElementNotFoundException("элемент не найден");
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"aa", "bbb"}, "aa"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
