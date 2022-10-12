package behavioral.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TextEditorTest {

  @Test
  void givenTextEditor_whenAddTextSaveAddMoreAndUndo_thenSavecStateRestored() {
    TextEditor textEditor = new TextEditor(new TextWindow());
    textEditor.write("Memento Design Pattern");
    textEditor.write("+Behavioral");
    textEditor.hitSave();

    textEditor.write("+Structural");

    textEditor.hitUndo();

    Assertions.assertEquals("Memento Design Pattern+Behavioral", textEditor.print());
  }
}
