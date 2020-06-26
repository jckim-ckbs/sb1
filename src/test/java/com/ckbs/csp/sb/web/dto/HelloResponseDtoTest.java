package com.ckbs.csp.sb.web.dto;

import org.junit.Test;
import  com.ckbs.csp.sb.web.dto.HelloResponseDto;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lobok_test(){
        //given
        String name = "jc";
        int amount = 10;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        System.out.printf("lobok_test: "+name+", "+amount);

    }




}


