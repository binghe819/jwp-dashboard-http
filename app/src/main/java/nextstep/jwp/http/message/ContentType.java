package nextstep.jwp.http.message;

import java.util.Arrays;

public enum ContentType {
    HTML("text/html;charset=utf-8", "html"),
    JAVASCRIPT("text/javascript", "js"),
    CSS("text/css", "css"),
    SVG("image/svg+xml", "svg");

    private String description;
    private String extension;

    ContentType(String description, String extension) {
        this.description = description;
        this.extension = extension;
    }

    public String getDescription() {
        return description;
    }

    public String getExtension() {
        return extension;
    }

    public static ContentType valueByFileExtension(String extension) {
        return Arrays.stream(values())
            .filter(contentType -> contentType.extension.equals(extension))
            .findFirst()
            .orElseThrow();
    }
}
