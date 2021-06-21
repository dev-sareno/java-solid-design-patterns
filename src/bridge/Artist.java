package bridge;

public class Artist {
    private String name;
    private String bio;
    private String url;

    public Artist(String name, String bio, String url) {
        this.name = name;
        this.bio = bio;
        this.url = url;
    }

    public Artist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
