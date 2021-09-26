package me.tuanva.demo.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
/**
 * Class of CreateUserRequestDto that interact to the other layers. This class used for showing up
 * informations of user
 */
public class UserResponseDto {
  private String id;
  private String username;
  private String gender;
}
