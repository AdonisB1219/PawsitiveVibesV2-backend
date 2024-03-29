package com.pawsitiveVibes.users.models;

public class UpdateUser {
    private String email;
    private String username;
    private String password;
    private String image;

    public UpdateUser() {
        super();
    }

    public UpdateUser(String email, String username, String password, String image) {
        super();

        this.email = email;
        this.username = username;
        this.password = password;
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
