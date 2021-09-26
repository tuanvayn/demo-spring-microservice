package me.tuanva.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import me.tuanva.demo.model.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
/**
 * Class of GetAllUserResponseDto that interact to the other layers. This class used for showing up
 * list of User
 */
public class GetAllUserResponseDto {
  List<User> data;
}
