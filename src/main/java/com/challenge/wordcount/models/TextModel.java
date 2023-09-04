package com.challenge.wordcount.models;

import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "{NotBlank.TextModel.Text}")
    private String text;
}
