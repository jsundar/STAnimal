package com.interview.singtel.animal.controller;

import com.interview.singtel.animal.security.TokenGenerator;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AnimalControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	TokenGenerator tokenGenerator;

	private String jwtToken;

	String payload = "{\n" + "    \"animalEnum\" : \"dolphins\"\n" + "}";

	String invalidPayload = "{\n" + "    \"animalEnum\" : \"cow\"\n" + "}";

	@BeforeEach
	void setUp() {
		jwtToken = "Bearer " + tokenGenerator.generateToken("TestUser");
	}

	@Test
	@Order(1)
	void count_animal_by_its_activity_when_path_variable_as_swim_should_return_success() throws Exception {
		mockMvc.perform(
				get("/animals/swim/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("4"));
	}

	@Test
	@Order(2)
	void count_animal_by_its_activity_when_path_variable_as_fly_should_return_success() throws Exception {
		mockMvc.perform(
				get("/animals/fly/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("5"));
	}

	@Test
	@Order(3)
	void count_animal_by_its_activity_when_path_variable_as_sing_should_return_success() throws Exception {
		mockMvc.perform(
				get("/animals/sing/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("3"));
	}

	@Test
	@Order(4)
	void count_animal_by_its_activity_when_path_variable_as_talk_should_return_success() throws Exception {
		mockMvc.perform(
				get("/animals/talk/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("5"));
	}

	@Test
	@Order(5)
	void count_animal_by_its_activity_when_path_variable_as_walk_should_return_success() throws Exception {
		mockMvc.perform(
				get("/animals/walk/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("9"));
	}

	@Test
	@Order(6)
	void count_animal_by_its_activity_when_path_variable_as_fight_should_return_400() throws Exception {
		mockMvc.perform(
				get("/animals/walk/count").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("9"));
	}

	@Test
	@Order(7)
	void get_all_the_animals() throws Exception {
		mockMvc.perform(get("/animals/").contentType(MediaType.APPLICATION_JSON).header("Authorization", jwtToken))
				.andExpect(status().isOk()).andExpect(jsonPath("$.animals").exists());
	}

	@Test
	@Order(8)
	void create_new_animal() throws Exception {
		mockMvc.perform(post("/animals/").contentType(MediaType.APPLICATION_JSON).content(payload)
				.header("Authorization", jwtToken)).andExpect(status().isNoContent());
	}

	@Test
	@Order(9)
	void create_new_animal_with_invalid_animal_type() throws Exception {
		mockMvc.perform(post("/animals/").contentType(MediaType.APPLICATION_JSON).content(invalidPayload)
				.header("Authorization", jwtToken)).andExpect(status().isBadRequest());
	}

	@Test
	@Order(10)
	void delete_existing_animal() throws Exception {
		mockMvc.perform(post("/animals/").contentType(MediaType.APPLICATION_JSON).content(payload)
				.header("Authorization", jwtToken)).andExpect(status().isNoContent());
	}

}
