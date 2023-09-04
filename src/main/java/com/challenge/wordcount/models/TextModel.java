package com.challenge.wordcount.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Leticia Pillar <@leticiapillar>
 * @project word-count-challenge
 * @created 2023/09/04 - 8:42 AM
 */
@Getter
@Setter
@ToString
public class TextModel {

//    @NotNull(message = "Text may not be null")
//    @NotEmpty(message = "Text may not be empty")
    @NotBlank(message = "Text may not be blank")
    private String text;
}
