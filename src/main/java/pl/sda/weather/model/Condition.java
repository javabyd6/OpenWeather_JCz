package pl.sda.weather.model;

/**
 * @author Jarek Czaplicki
 */
public class Condition {
    private String text;
    private String icon;
    private String code;

    public Condition(String text, String icon, String code) {
        this.text = text;
        this.icon = icon;
        this.code = code;
    }

    public Condition() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
