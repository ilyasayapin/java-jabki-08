package homework.files;

public class TextFile extends File {
    String content;

    public TextFile (String content) {
        this.content = content;
    }

    @Override
    public long getSize() {
        long length = this.content.length();
        System.out.println("Длина текста: " + length + " байт");
        return length;
    }
}
