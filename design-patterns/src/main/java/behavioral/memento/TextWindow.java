package behavioral.memento;

public class TextWindow {

  private StringBuilder currentText;

  public TextWindow() {
    currentText = new StringBuilder();
  }

  public void addText(String text) {
    currentText.append(text);
  }

  public String getCurrentText() {
    return currentText.toString();
  }

  public TextWindowState save() {
    return new TextWindowState(currentText.toString());
  }

  public void restore(TextWindowState save) {
    currentText = new StringBuilder(save.getText());
  }
}