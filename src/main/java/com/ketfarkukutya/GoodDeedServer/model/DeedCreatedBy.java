package com.ketfarkukutya.GoodDeedServer.model;

import javax.validation.constraints.NotNull;

public class DeedCreatedBy {
    @NotNull
    private String nickname = null;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
