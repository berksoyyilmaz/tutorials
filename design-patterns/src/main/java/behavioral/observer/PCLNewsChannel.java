package behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

  private String news;

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    setNews((String) evt.getNewValue());
  }

  public String getNews() {
    return news;
  }

  public void setNews(String news) {
    this.news = news;
  }
}