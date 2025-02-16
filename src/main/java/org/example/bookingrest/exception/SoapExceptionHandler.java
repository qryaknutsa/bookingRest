package org.example.bookingrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ws.soap.client.SoapFaultClientException;

@ControllerAdvice
public class SoapExceptionHandler {

    @ExceptionHandler(SoapFaultClientException.class)
    public ResponseEntity<ErrorResponse> handleSoapFaultException(SoapFaultClientException ex) {
        // Проверяем текст ошибки и маппим на нужный тип
        String errorMessage = ex.getMessage();

        if (errorMessage.contains("мероприятие не найдено")) {
            ErrorResponse error = new ErrorResponse(
                    HttpStatus.NOT_FOUND.value(),
                    "По вашему запросу мероприятие не найдено."
            );
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }

        // Для других типов ошибок можно добавить дополнительную логику
        ErrorResponse error = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Произошла ошибка при обработке запроса."
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Класс ErrorResponse остается таким же, как в предыдущем примере
    public static class ErrorResponse {
        private int status;
        private String message;

        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }

        // Геттеры и сеттеры
        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}