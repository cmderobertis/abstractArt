public class Painting extends Art {
    private String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }

    void viewArt() {
        System.out.printf("Title: %s\nAuthor: %s\nDescription: %s\nPaint Type: %s\n\n", this.getTitle(), this.getAuthor(), this.getDescription(), this.getPaintType());
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }
}
