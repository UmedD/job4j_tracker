
package checkstyle;

public class Broken {
    private static final String NEW_VALUE = "";
    private final int sizeOfEmpty = 10;
    private String name;
    private String surname;

    Broken() { }
    void echo() { }
    void method() { }
    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}