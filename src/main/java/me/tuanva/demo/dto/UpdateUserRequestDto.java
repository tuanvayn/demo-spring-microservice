package me.tuanva.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;
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
public class UpdateUserRequestDto {
  @NotBlank private String id;

  @ApiModelProperty(dataType = "String", example = "Vu Anh Tuan")
  @NotBlank
  private String username;

  @ApiModelProperty(dataType = "String", example = "nam")
  @Pattern(regexp = "^(nam|nu)$")
  @NotBlank
  private String gender;
}
