package homework.files;

public class ImageFile extends File {
    private int width;
    private int height;
    private int bytesPerPixel;

    public ImageFile(String name, int width, int height, int bytesPerPixel) {
        super(name);
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        long length = this.width * this.height * this.bytesPerPixel;
        System.out.printf("Вес %s: %s байт", super.getName(), length);
        System.out.println();
        return length;
    }
}
