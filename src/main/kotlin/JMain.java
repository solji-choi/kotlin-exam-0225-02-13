public class StringUtils {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}

public class JMain {
    public static void main(String[] args) {
        System.out.println(StringUtils.greet("Alice"));
    }
}
