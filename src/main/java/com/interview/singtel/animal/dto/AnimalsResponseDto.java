package com.interview.singtel.animal.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
public class AnimalsResponseDto implements Serializable {

	private final List<String> animals;

}
