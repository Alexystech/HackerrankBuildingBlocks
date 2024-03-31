package com.alexier.io.src.service;

public class ProgrammerService implements ProgrammerImpl {
  public String develop () {
    String message = "Developing...";
    message = String.format(message, "application finished");
    return message;
  }
}
