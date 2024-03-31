package com.alexier.io.src.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@Builder
@Getter
@Setter
public class Container {

  public static void main(String... args) {
    System.out.println("Main Container");
  }

  @Getter
  private String idContainer;
  private String name;
  private Integer pallets;
  private Float grossWeight;
  private Boolean active;

  public Container (String name, Integer pallets, Float grossWeight) {
    this.idContainer = UUID.randomUUID().toString();
    this.name = name;
    this.pallets = pallets;
    this.grossWeight = grossWeight;
    this.active = true;
  }

  public void genericFunction () {
    java.util.Date fechaUtil = new java.util.Date();
    java.util.Date fechaSql = new java.sql.Date(22222);
  }

  public void testNoReturnFunction () {
    return ;
  }
}