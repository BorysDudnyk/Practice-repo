// Kyu: 8
// Problem: Return "hello world!" string

public class HelloWorld {
  public static String greet() {
        StringBuilder sb = new StringBuilder();
        
        char[] data = {'h','e','l','l','o',' ','w','o','r','l','d','!'};
        
        for (int i = 0; i < data.length; i++) {
            sb.append(Character.toString(data[i]));
        }
        
        return sb.toString();
    }
}
