package com.exam.examproject.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
public class BoardResponse {
    String author;
    String title;
    String content;


}
