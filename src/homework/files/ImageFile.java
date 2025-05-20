package homework.files;

public class ImageFile extends File {
    private int width;
    private int height;
    private int bytesPerPixel;

    public ImageFile(int width, int height, int bytesPerPixel) {
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        long length = this.width * this.height * this.bytesPerPixel;
        System.out.println("Вес изображения: " + length + " байт");
        return length;
    }
}
