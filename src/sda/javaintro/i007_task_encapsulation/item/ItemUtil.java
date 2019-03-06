package sda.javaintro.i007_task_encapsulation.item;

public class ItemUtil {
    public String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}
