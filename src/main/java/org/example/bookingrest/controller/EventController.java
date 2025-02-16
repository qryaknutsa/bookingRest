package org.example.bookingrest.controller;

import org.example.bookingrest.service.SoapService;
import org.example.bookingrest.wsdl.Event;
import org.example.bookingrest.wsdl.EventRead;
import org.example.bookingrest.wsdl.EventWrite;
import org.example.bookingrest.wsdl.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final SoapService soapService;

    public EventController(SoapService soapService) {
        this.soapService = soapService;
    }

    @GetMapping("/{id}")
    public EventRead getEvent(@PathVariable String id) {
        return soapService.getEvent(id);
    }

    @GetMapping
    public List<EventRead> getAllEvents() {
        return soapService.getAllEvents();
    }


    @PostMapping
    public Event saveEvent(@RequestBody EventWrite event) {
        return soapService.save(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        soapService.delete(id);
    }

    @PostMapping("/{ticket_id}/{person_id}")
    public Ticket copyTicketWithDoublePriceAndVip(@PathVariable String ticket_id, @PathVariable String person_id) {
        return soapService.copyTicketWithDoublePriceAndVip(ticket_id, person_id);
    }
}