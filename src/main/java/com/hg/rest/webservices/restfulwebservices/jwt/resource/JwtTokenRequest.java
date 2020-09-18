package com.hg.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoZyIsImV4cCI6MTYwMDcxMDk5OCwiaWF0IjoxNjAwMTA2MTk4fQ._dAp4kgma8P8_M90Yzd8iPBi7laIV3u8Ljg7mJPeDcT7Q3VZzzEeEIqbChpLxQeKsdpa62xbQzDKwvJjHN-TFA"
//    	}
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

