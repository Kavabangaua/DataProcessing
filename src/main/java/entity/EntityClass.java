package entity;

public class EntityClass {

   private String title;
    private int age;
   private float width;

    public EntityClass(String title, int age, float width) {
        this.title = title;
        this.age = age;
        this.width = width;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "EntityClass{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", width=" + width +
                '}';
    }
}
