package com.pipeline;

public class UserEventVO {
    private String timestamp;
    private String colorName;
    private String userName;

    public UserEventVO(String timestamp, String colorName, String userName) {
        this.timestamp = timestamp;
        this.colorName = colorName;
        this.userName = userName;
    }
}
