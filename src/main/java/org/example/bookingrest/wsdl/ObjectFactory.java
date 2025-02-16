
package org.example.bookingrest.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.bookingrest.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CoordinatesWrite_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "CoordinatesWrite");
    private final static QName _EventRead_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "EventRead");
    private final static QName _EventReadList_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "EventReadList");
    private final static QName _EventWrite_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "EventWrite");
    private final static QName _AddEvent_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "addEvent");
    private final static QName _AddEventResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "addEventResponse");
    private final static QName _CopyTicketWithDoublePriceAndVip_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "copyTicketWithDoublePriceAndVip");
    private final static QName _CopyTicketWithDoublePriceAndVipResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "copyTicketWithDoublePriceAndVipResponse");
    private final static QName _DeleteEvent_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "deleteEvent");
    private final static QName _DeleteEventResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "deleteEventResponse");
    private final static QName _GetAllEvents_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getAllEvents");
    private final static QName _GetAllEventsResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getAllEventsResponse");
    private final static QName _GetEvent_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getEvent");
    private final static QName _GetEventResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getEventResponse");
    private final static QName _GetPerson_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getPerson");
    private final static QName _GetPersonResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getPersonResponse");
    private final static QName _GetQwe_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getQwe");
    private final static QName _GetQweResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getQweResponse");
    private final static QName _GetTicket_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getTicket");
    private final static QName _GetTicketResponse_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "getTicketResponse");
    private final static QName _LocationWrite_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "locationWrite");
    private final static QName _Person_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "person");
    private final static QName _Ticket_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "ticket");
    private final static QName _InvalidParameter_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "InvalidParameter");
    private final static QName _CustomNotFound_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "CustomNotFound");
    private final static QName _TooLateToDelete_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "TooLateToDelete");
    private final static QName _IncorrectParameter_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "IncorrectParameter");
    private final static QName _TicketServiceNotAvailable_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "TicketServiceNotAvailable");
    private final static QName _MultipleNotFound_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "MultipleNotFound");
    private final static QName _AlreadyVIPException_QNAME = new QName("http://controller.bookingServicePayara.example.com/", "AlreadyVIPException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.bookingrest.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoordinatesWrite }
     * 
     */
    public CoordinatesWrite createCoordinatesWrite() {
        return new CoordinatesWrite();
    }

    /**
     * Create an instance of {@link EventRead }
     * 
     */
    public EventRead createEventRead() {
        return new EventRead();
    }

    /**
     * Create an instance of {@link EventReadList }
     * 
     */
    public EventReadList createEventReadList() {
        return new EventReadList();
    }

    /**
     * Create an instance of {@link EventWrite }
     * 
     */
    public EventWrite createEventWrite() {
        return new EventWrite();
    }

    /**
     * Create an instance of {@link AddEvent }
     * 
     */
    public AddEvent createAddEvent() {
        return new AddEvent();
    }

    /**
     * Create an instance of {@link AddEventResponse }
     * 
     */
    public AddEventResponse createAddEventResponse() {
        return new AddEventResponse();
    }

    /**
     * Create an instance of {@link CopyTicketWithDoublePriceAndVip }
     * 
     */
    public CopyTicketWithDoublePriceAndVip createCopyTicketWithDoublePriceAndVip() {
        return new CopyTicketWithDoublePriceAndVip();
    }

    /**
     * Create an instance of {@link CopyTicketWithDoublePriceAndVipResponse }
     * 
     */
    public CopyTicketWithDoublePriceAndVipResponse createCopyTicketWithDoublePriceAndVipResponse() {
        return new CopyTicketWithDoublePriceAndVipResponse();
    }

    /**
     * Create an instance of {@link DeleteEvent }
     * 
     */
    public DeleteEvent createDeleteEvent() {
        return new DeleteEvent();
    }

    /**
     * Create an instance of {@link DeleteEventResponse }
     * 
     */
    public DeleteEventResponse createDeleteEventResponse() {
        return new DeleteEventResponse();
    }

    /**
     * Create an instance of {@link GetAllEvents }
     * 
     */
    public GetAllEvents createGetAllEvents() {
        return new GetAllEvents();
    }

    /**
     * Create an instance of {@link GetAllEventsResponse }
     * 
     */
    public GetAllEventsResponse createGetAllEventsResponse() {
        return new GetAllEventsResponse();
    }

    /**
     * Create an instance of {@link GetEvent }
     * 
     */
    public GetEvent createGetEvent() {
        return new GetEvent();
    }

    /**
     * Create an instance of {@link GetEventResponse }
     * 
     */
    public GetEventResponse createGetEventResponse() {
        return new GetEventResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link GetQwe }
     * 
     */
    public GetQwe createGetQwe() {
        return new GetQwe();
    }

    /**
     * Create an instance of {@link GetQweResponse }
     * 
     */
    public GetQweResponse createGetQweResponse() {
        return new GetQweResponse();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link LocationWrite }
     * 
     */
    public LocationWrite createLocationWrite() {
        return new LocationWrite();
    }

    /**
     * Create an instance of {@link PersonWrite }
     * 
     */
    public PersonWrite createPersonWrite() {
        return new PersonWrite();
    }

    /**
     * Create an instance of {@link InvalidParameter }
     * 
     */
    public InvalidParameter createInvalidParameter() {
        return new InvalidParameter();
    }

    /**
     * Create an instance of {@link CustomNotFound }
     * 
     */
    public CustomNotFound createCustomNotFound() {
        return new CustomNotFound();
    }

    /**
     * Create an instance of {@link TooLateToDelete }
     * 
     */
    public TooLateToDelete createTooLateToDelete() {
        return new TooLateToDelete();
    }

    /**
     * Create an instance of {@link IncorrectParameter }
     * 
     */
    public IncorrectParameter createIncorrectParameter() {
        return new IncorrectParameter();
    }

    /**
     * Create an instance of {@link TicketServiceNotAvailable }
     * 
     */
    public TicketServiceNotAvailable createTicketServiceNotAvailable() {
        return new TicketServiceNotAvailable();
    }

    /**
     * Create an instance of {@link MultipleNotFound }
     * 
     */
    public MultipleNotFound createMultipleNotFound() {
        return new MultipleNotFound();
    }

    /**
     * Create an instance of {@link AlreadyVIPException }
     * 
     */
    public AlreadyVIPException createAlreadyVIPException() {
        return new AlreadyVIPException();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Coordinates }
     * 
     */
    public Coordinates createCoordinates() {
        return new Coordinates();
    }

    /**
     * Create an instance of {@link ZonedDateTime }
     * 
     */
    public ZonedDateTime createZonedDateTime() {
        return new ZonedDateTime();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link TicketWithEventWrite }
     * 
     */
    public TicketWithEventWrite createTicketWithEventWrite() {
        return new TicketWithEventWrite();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatesWrite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoordinatesWrite }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "CoordinatesWrite")
    public JAXBElement<CoordinatesWrite> createCoordinatesWrite(CoordinatesWrite value) {
        return new JAXBElement<CoordinatesWrite>(_CoordinatesWrite_QNAME, CoordinatesWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventRead }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventRead }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "EventRead")
    public JAXBElement<EventRead> createEventRead(EventRead value) {
        return new JAXBElement<EventRead>(_EventRead_QNAME, EventRead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventReadList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventReadList }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "EventReadList")
    public JAXBElement<EventReadList> createEventReadList(EventReadList value) {
        return new JAXBElement<EventReadList>(_EventReadList_QNAME, EventReadList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventWrite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventWrite }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "EventWrite")
    public JAXBElement<EventWrite> createEventWrite(EventWrite value) {
        return new JAXBElement<EventWrite>(_EventWrite_QNAME, EventWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "addEvent")
    public JAXBElement<AddEvent> createAddEvent(AddEvent value) {
        return new JAXBElement<AddEvent>(_AddEvent_QNAME, AddEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "addEventResponse")
    public JAXBElement<AddEventResponse> createAddEventResponse(AddEventResponse value) {
        return new JAXBElement<AddEventResponse>(_AddEventResponse_QNAME, AddEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTicketWithDoublePriceAndVip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyTicketWithDoublePriceAndVip }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "copyTicketWithDoublePriceAndVip")
    public JAXBElement<CopyTicketWithDoublePriceAndVip> createCopyTicketWithDoublePriceAndVip(CopyTicketWithDoublePriceAndVip value) {
        return new JAXBElement<CopyTicketWithDoublePriceAndVip>(_CopyTicketWithDoublePriceAndVip_QNAME, CopyTicketWithDoublePriceAndVip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTicketWithDoublePriceAndVipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyTicketWithDoublePriceAndVipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "copyTicketWithDoublePriceAndVipResponse")
    public JAXBElement<CopyTicketWithDoublePriceAndVipResponse> createCopyTicketWithDoublePriceAndVipResponse(CopyTicketWithDoublePriceAndVipResponse value) {
        return new JAXBElement<CopyTicketWithDoublePriceAndVipResponse>(_CopyTicketWithDoublePriceAndVipResponse_QNAME, CopyTicketWithDoublePriceAndVipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "deleteEvent")
    public JAXBElement<DeleteEvent> createDeleteEvent(DeleteEvent value) {
        return new JAXBElement<DeleteEvent>(_DeleteEvent_QNAME, DeleteEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "deleteEventResponse")
    public JAXBElement<DeleteEventResponse> createDeleteEventResponse(DeleteEventResponse value) {
        return new JAXBElement<DeleteEventResponse>(_DeleteEventResponse_QNAME, DeleteEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEvents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEvents }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getAllEvents")
    public JAXBElement<GetAllEvents> createGetAllEvents(GetAllEvents value) {
        return new JAXBElement<GetAllEvents>(_GetAllEvents_QNAME, GetAllEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEventsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEventsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getAllEventsResponse")
    public JAXBElement<GetAllEventsResponse> createGetAllEventsResponse(GetAllEventsResponse value) {
        return new JAXBElement<GetAllEventsResponse>(_GetAllEventsResponse_QNAME, GetAllEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getEvent")
    public JAXBElement<GetEvent> createGetEvent(GetEvent value) {
        return new JAXBElement<GetEvent>(_GetEvent_QNAME, GetEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getEventResponse")
    public JAXBElement<GetEventResponse> createGetEventResponse(GetEventResponse value) {
        return new JAXBElement<GetEventResponse>(_GetEventResponse_QNAME, GetEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQwe }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQwe }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getQwe")
    public JAXBElement<GetQwe> createGetQwe(GetQwe value) {
        return new JAXBElement<GetQwe>(_GetQwe_QNAME, GetQwe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQweResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQweResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getQweResponse")
    public JAXBElement<GetQweResponse> createGetQweResponse(GetQweResponse value) {
        return new JAXBElement<GetQweResponse>(_GetQweResponse_QNAME, GetQweResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationWrite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationWrite }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "locationWrite")
    public JAXBElement<LocationWrite> createLocationWrite(LocationWrite value) {
        return new JAXBElement<LocationWrite>(_LocationWrite_QNAME, LocationWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonWrite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonWrite }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "person")
    public JAXBElement<PersonWrite> createPerson(PersonWrite value) {
        return new JAXBElement<PersonWrite>(_Person_QNAME, PersonWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "ticket")
    public JAXBElement<Object> createTicket(Object value) {
        return new JAXBElement<Object>(_Ticket_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "InvalidParameter")
    public JAXBElement<InvalidParameter> createInvalidParameter(InvalidParameter value) {
        return new JAXBElement<InvalidParameter>(_InvalidParameter_QNAME, InvalidParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "CustomNotFound")
    public JAXBElement<CustomNotFound> createCustomNotFound(CustomNotFound value) {
        return new JAXBElement<CustomNotFound>(_CustomNotFound_QNAME, CustomNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TooLateToDelete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TooLateToDelete }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "TooLateToDelete")
    public JAXBElement<TooLateToDelete> createTooLateToDelete(TooLateToDelete value) {
        return new JAXBElement<TooLateToDelete>(_TooLateToDelete_QNAME, TooLateToDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncorrectParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "IncorrectParameter")
    public JAXBElement<IncorrectParameter> createIncorrectParameter(IncorrectParameter value) {
        return new JAXBElement<IncorrectParameter>(_IncorrectParameter_QNAME, IncorrectParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketServiceNotAvailable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TicketServiceNotAvailable }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "TicketServiceNotAvailable")
    public JAXBElement<TicketServiceNotAvailable> createTicketServiceNotAvailable(TicketServiceNotAvailable value) {
        return new JAXBElement<TicketServiceNotAvailable>(_TicketServiceNotAvailable_QNAME, TicketServiceNotAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultipleNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "MultipleNotFound")
    public JAXBElement<MultipleNotFound> createMultipleNotFound(MultipleNotFound value) {
        return new JAXBElement<MultipleNotFound>(_MultipleNotFound_QNAME, MultipleNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadyVIPException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlreadyVIPException }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.bookingServicePayara.example.com/", name = "AlreadyVIPException")
    public JAXBElement<AlreadyVIPException> createAlreadyVIPException(AlreadyVIPException value) {
        return new JAXBElement<AlreadyVIPException>(_AlreadyVIPException_QNAME, AlreadyVIPException.class, null, value);
    }

}
