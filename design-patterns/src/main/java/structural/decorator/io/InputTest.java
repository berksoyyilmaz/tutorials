package structural.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class InputTest {
  public static void main(String[] args) throws IOException {
    int character;
    String filePath = Objects.requireNonNull(InputTest.class.getClassLoader().getResource("decorator-file.txt")).getFile();
    try (InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)))) {
      while ((character = inputStream.read()) >= 0) {
        System.out.print((char) character);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
