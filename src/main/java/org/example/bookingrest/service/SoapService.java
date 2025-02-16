package org.example.bookingrest.service;

import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.WebServiceTemplate;
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

    public String getQwe() {
        try {
            GetQwe request = new GetQwe();
            Object response = webServiceTemplate.marshalSendAndReceive(request);

            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                GetQweResponse eventsResponse = (GetQweResponse) jaxbElement.getValue();

                return eventsResponse.getReturn();
            }

            if (response instanceof GetAllEventsResponse) {
                GetQweResponse eventsResponse = (GetQweResponse) response;
                return eventsResponse.getReturn();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }


    public List<EventRead> getAllEvents() {
        try {
            GetAllEvents request = new GetAllEvents();
            Object response = webServiceTemplate.marshalSendAndReceive(request);

            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                GetAllEventsResponse eventsResponse = (GetAllEventsResponse) jaxbElement.getValue();

                return eventsResponse.getReturn() != null
                        ? eventsResponse.getReturn().getList()
                        : Collections.emptyList();
            }

            if (response instanceof GetAllEventsResponse) {
                GetAllEventsResponse eventsResponse = (GetAllEventsResponse) response;
                return eventsResponse.getReturn() != null
                        ? eventsResponse.getReturn().getList()
                        : Collections.emptyList();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }


    public EventRead getEvent(String id) {
        try {
            GetEvent request = new GetEvent();
            request.setId(id);
            Object response = webServiceTemplate.marshalSendAndReceive(request);

            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                GetEventResponse eventsResponse = (GetEventResponse) jaxbElement.getValue();
                return eventsResponse.getReturn();
            }

            if (response instanceof GetAllEventsResponse) {
                GetEventResponse eventResponse = (GetEventResponse) response;
                return eventResponse.getReturn();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }

    public Event save(EventWrite dto) {
        try {
            AddEvent request = new AddEvent();
            request.setEventWrite(dto);
            Object response = webServiceTemplate.marshalSendAndReceive(request);

            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                AddEventResponse eventsResponse = (AddEventResponse) jaxbElement.getValue();
                return eventsResponse.getReturn();
            }

            if (response instanceof GetAllEventsResponse) {
                AddEventResponse eventResponse = (AddEventResponse) response;
                return eventResponse.getReturn();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }


    //TODO: надо забрать статус респонса
    public void delete(String eventIdStr) {
        try {
            DeleteEvent request = new DeleteEvent();
            request.setEventId(eventIdStr);
            Object response = webServiceTemplate.marshalSendAndReceive(request);

//            if (response instanceof JAXBElement) {
//                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
//                DeleteEventResponse eventsResponse = (DeleteEventResponse) jaxbElement.getValue();
//            }
//
//            if (response instanceof GetAllEventsResponse) {
//                DeleteEventResponse eventResponse = (DeleteEventResponse) response;
//            }
//
//            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }


    public Ticket copyTicketWithDoublePriceAndVip(String ticket_id, String person_id) {
        try {
            CopyTicketWithDoublePriceAndVip request = new CopyTicketWithDoublePriceAndVip();
            request.setTicketId(ticket_id);
            request.setPersonId(person_id);
            Object response = webServiceTemplate.marshalSendAndReceive(request);

            if (response instanceof JAXBElement) {
                JAXBElement<?> jaxbElement = (JAXBElement<?>) response;
                CopyTicketWithDoublePriceAndVipResponse eventsResponse = (CopyTicketWithDoublePriceAndVipResponse) jaxbElement.getValue();
                return eventsResponse.getReturn();
            }

            if (response instanceof GetAllEventsResponse) {
                CopyTicketWithDoublePriceAndVipResponse eventResponse = (CopyTicketWithDoublePriceAndVipResponse) response;
                return eventResponse.getReturn();
            }

            throw new RuntimeException("Unexpected response type: " + response.getClass());
        } catch (SoapFaultClientException ex) {
            throw ex;
        }
    }
}