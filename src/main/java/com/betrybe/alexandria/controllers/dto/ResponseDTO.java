package com.betrybe.alexandria.controllers.dto;

public record ResponseDTO<T>(String message, T data) {

}
