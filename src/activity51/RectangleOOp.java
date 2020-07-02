package activity51;

public class RectangleOOp {
    private float width;
    private float height;

    //Khoi tao
    public RectangleOOp(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public RectangleOOp() {
    }

    //Tao Getters/Setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Tinh Chu vi
    public float tinhChuVi() {
        return (2 * (width + height));
    }

    //Tinh dien tich
    public float tinhDienTich() {
        return (width * height);
    }

    //In width va height
    public void inWidthHeight() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    //Kiem tra co phai hinh vuong khong
    public boolean check() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
