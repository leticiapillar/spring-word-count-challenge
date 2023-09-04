package com.challenge.wordcount.services;

import com.challenge.wordcount.models.TextModel;

/**
 * @author Leticia Pillar <@leticiapillar>
 * @project word-count-challenge
 * @created 2023/09/04 - 9:34 AM
 */
public interface WordCountService {
    Integer countWords(TextModel textModel);
}
