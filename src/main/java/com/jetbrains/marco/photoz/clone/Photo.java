package com.jetbrains.marco.photoz.clone;

public class Photo {
    private String id;
    private String filename;
    public Photo()
    {

    }

    public Photo(String id, String filename) {
        this.id = id;
        this.filename = filename;
    }

//    public static String getName() {
//    }

//raw data


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

