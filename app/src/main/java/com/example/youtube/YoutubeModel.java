package com.example.youtube;

public class YoutubeModel {
    private String heading;
    private int ImageId;

    public YoutubeModel(String heading, int imageId) {
        this.heading = heading;
        ImageId = imageId;
    }

    public String getHeading() {
        return heading;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
