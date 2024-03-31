package com.alexier.io.src.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {
  private Long idUser;
  private String userName;
  private String password;
  private Boolean active;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public User () { }
}
