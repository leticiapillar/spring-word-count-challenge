package com.challenge.wordcount.controllers;

import com.challenge.wordcount.models.TextModel;
import com.challenge.wordcount.services.WordCountService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Leticia Pillar <@leticiapillar>
 * @project word-count-challenge
 * @created 2023/09/04 - 8:30 AM
 */
@Controller
@AllArgsConstructor
@Slf4j
public class WordCountController {

    private final WordCountService wordCountService;

    @GetMapping()
    public String showWordCountForm(TextModel textModel) {
        log.debug("Show word count form ...");
        return "word-count-form";
    }

    @PostMapping()
    public String wordCount(@Valid TextModel textModel, BindingResult result, Model model) {
        log.debug("Submit word count form ...");
        if (result.hasErrors()) {
            return "word-count-form";
        }

        Integer totalWords = wordCountService.countWords(textModel);
        log.debug("totalWords {}", totalWords);
        model.addAttribute("totalwords", totalWords);
        return "word-count-result";
    }
}
