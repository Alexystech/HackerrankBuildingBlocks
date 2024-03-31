package com.alexier.io.src.entity;

import com.alexier.io.src.service.ProgrammerService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Programmer extends User {

  ProgrammerService programmerService = new ProgrammerService();
  private String position;
  private Integer experience;
}
