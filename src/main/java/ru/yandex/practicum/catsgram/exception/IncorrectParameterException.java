package ru.yandex.practicum.catsgram.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncorrectParameterException extends RuntimeException {
    private String parameter;

    public IncorrectParameterException(String parameter) {
        super(parameter);
        this.parameter = parameter;
    }
}
