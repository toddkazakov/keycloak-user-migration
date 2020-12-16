package com.danielfrak.code.keycloak.providers.rest.rest;

import java.util.Objects;

public final class UserPasswordDto {

    private String userId;

    private String password;

    public UserPasswordDto() {
    }

    public UserPasswordDto(String password, String userId) {
        this.password = password;
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPasswordDto that = (UserPasswordDto) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password);
    }
}
