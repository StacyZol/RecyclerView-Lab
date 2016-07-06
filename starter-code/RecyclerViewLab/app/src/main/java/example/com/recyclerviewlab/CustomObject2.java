package example.com.recyclerviewlab;

/**
 * Created by stacyzolnikov on 7/5/16.
 */
public class CustomObject2 {
    public String text2;
    public String description2;
    public String color2;
    public Boolean checkbox2;

    public CustomObject2 () {
        text2 = "text2";
        description2="description2";
        color2="color2";
        checkbox2 = true;
    }

    public CustomObject2 (String text2, String description2, String color2, boolean checkbox2){
        this.text2=text2;
        this.description2=description2;
        this.color2=color2;
        this.checkbox2=checkbox2;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public Boolean getCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(Boolean checkbox2) {
        this.checkbox2 = checkbox2;
    }
}
