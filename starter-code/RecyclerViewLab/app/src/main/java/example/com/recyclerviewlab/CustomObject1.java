package example.com.recyclerviewlab;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomObject1 {
    String text1;
    String description1;
    int color1;
    public CustomObject1() {
        text1 = "text1";
        description1 = "description1";
        color1 = R.color.colorAccent;
    }

    public CustomObject1 (String text1, String description1, int color1){
        this.text1=text1;
        this.description1=description1;
        this.color1=color1;

    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public int getColor1() {
        return color1;
    }

    public void setColor1(int color1) {
        this.color1 = color1;
    }
}
