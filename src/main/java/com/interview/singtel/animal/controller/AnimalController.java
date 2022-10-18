package com.interview.singtel.animal.controller;

import com.interview.singtel.animal.constants.AnimalsActivityEnum;
import com.interview.singtel.animal.dto.AnimalDto;
import com.interview.singtel.animal.dto.AnimalsResponseDto;
import com.interview.singtel.animal.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AnimalController {

	private final AnimalService animalService;

	@GetMapping("/animals/{activity}/count")
	@ResponseStatus(HttpStatus.OK)
	public int countAnimalByItsActivity(@PathVariable AnimalsActivityEnum activity) {
		return animalService.count(activity.getAnimalActivity());
	}

	@PostMapping("/animals")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void addAnimal(@RequestBody AnimalDto animalDto) {
		animalService.addAnimal(animalDto.getAnimalEnum().getAnimal());
	}

	@DeleteMapping("/animals")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAnimal(@RequestBody AnimalDto animalDto) {
		animalService.deleteAnimal(animalDto.getAnimalEnum().getAnimal());
	}

	@GetMapping("/animals")
	@ResponseStatus(HttpStatus.OK)
	public AnimalsResponseDto getAnimal() {
		return AnimalsResponseDto.builder().animals(animalService.getAnimals()).build();
	}

}
