package org.example.bookingrest;

import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.stereotype.Service;
import org.example.bookingrest.wsdl.*;
import org.springframework.ws.soap.client.SoapFaultClientException;

import java.util.Collections;
import java.util.List;

@Service
public class SoapService {
    private final WebServiceTemplate webServiceTemplate;

    public SoapService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public List<EventRead> getAllEvents() {
        try {
            GetAllEvents request = new GetAllEvents();

            Object response = webServiceTemplate.marshalSendAndReceive(request);

            // Извлечение значения из JAXBElement
            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                GetAllEventsResponse eventsResponse = (GetAllEventsResponse) jaxbElement.getValue();

                // Возвращаем список событий
                return eventsResponse.getReturn() != null
                        ? eventsResponse.getReturn().getList()
                        : Collections.emptyList();
            }

            // Если вдруг объект уже нужного типа
            if (response instanceof GetAllEventsResponse) {
                GetAllEventsResponse eventsResponse = (GetAllEventsResponse) response;
                return eventsResponse.getReturn() != null
                        ? eventsResponse.getReturn().getList()
                        : Collections.emptyList();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            // Логирование или обработка ошибок
            throw ex;
        }
    }
}