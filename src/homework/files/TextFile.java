package homework.files;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public long getSize() {
        long length = this.content.length();
        System.out.printf("Вес %s: %s байт", super.getName(), length);
        System.out.println();
        return length;
    }
}
