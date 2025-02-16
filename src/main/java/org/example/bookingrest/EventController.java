package org.example.bookingrest;

import org.example.bookingrest.wsdl.EventRead;
import org.example.bookingrest.wsdl.GetEventResponse;
import org.example.bookingrest.wsdl.GetAllEventsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final SoapService soapService;

    public EventController(SoapService soapService) {
        this.soapService = soapService;
    }

//    @GetMapping("/{id}")
//    public EventRead getEvent(@PathVariable String id) {
//        return soapService.getEvent(id);
//    }

    @GetMapping
    public List<EventRead> getAllEvents() {
        return soapService.getAllEvents();
    }
}