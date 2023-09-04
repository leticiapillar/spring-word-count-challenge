package com.challenge.wordcount.services;

import com.challenge.wordcount.models.TextModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Leticia Pillar <@leticiapillar>
 * @project word-count-challenge
 * @created 2023/09/04 - 9:35 AM
 */
@Service
@Slf4j
public class WordCountServiceImpl implements WordCountService {
    @Override
    public Integer countWords(TextModel textModel) {
        if (textModel == null) {
            log.error("Text model is null: {}", textModel);
        }
        if (textModel.getText().isEmpty()) {
            log.error("Text model is empty: {}", textModel.getText());
        }
        if (textModel.getText().isBlank()) {
            log.error("Text model is blank: {}", textModel.getText());
        }
        return textModel.getText().trim().split("\\s+").length;
    }
}
