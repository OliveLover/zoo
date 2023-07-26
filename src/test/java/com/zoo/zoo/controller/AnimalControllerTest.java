package com.zoo.zoo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zoo.zoo.model.dto.AdoptRequestDto;
import com.zoo.zoo.service.AnimalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.zoo.zoo.model.entity.AnimalType.FOX;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
class AnimalControllerTest {
    MockMvc mockMvc;

    @Mock
    ObjectMapper objectMapper;

    @Mock
    AnimalService animalService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new AnimalController(animalService)).build();
    }

    @Test
    void adoptAnAnimal() throws Exception {
        // given
        AdoptRequestDto requestDto = new AdoptRequestDto(FOX, "미호", "female");
        String answer = "success";

        when(animalService.adoptAnAnimal(any())).thenReturn(new ResponseEntity<>(answer, HttpStatus.OK));
        // when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/animal")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsBytes(requestDto)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(answer))
                .andDo(print());
    }
}