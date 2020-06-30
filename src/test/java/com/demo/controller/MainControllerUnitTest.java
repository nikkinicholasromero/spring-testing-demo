package com.demo.controller;

import com.demo.service.MainService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class MainControllerUnitTest {
    @InjectMocks
    private MainController target;

    @Mock
    private MainService mainService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);

        when(mainService.getGreetings()).thenReturn("Hello, World");
    }

    @Test
    public void main() {
        String actual = target.main();
        assertThat(actual).isEqualTo("Hello, World");
    }
}
