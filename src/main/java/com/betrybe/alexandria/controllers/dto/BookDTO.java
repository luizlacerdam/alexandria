package com.betrybe.alexandria.controllers.dto;

import com.betrybe.alexandria.models.entities.Book;

public record BookDTO(Long id, String title, String genre) {

  public Book toBook() {
    return new Book(id, title, genre, null, null, null);
  }

}
