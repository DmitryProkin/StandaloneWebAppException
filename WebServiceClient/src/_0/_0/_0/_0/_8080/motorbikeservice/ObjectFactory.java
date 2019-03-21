
package _0._0._0._0._8080.motorbikeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _0._0._0._0._8080.motorbikeservice package. 
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

    private final static QName _GetFind_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "getFind");
    private final static QName _GetFindResponse_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "getFindResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "deleteResponse");
    private final static QName _Create_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "createResponse");
    private final static QName _Update_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "update");
    private final static QName _GetBike_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "getBike");
    private final static QName _IllegalNameException_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "IllegalNameException");
    private final static QName _Delete_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "delete");
    private final static QName _GetBikeResponse_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "getBikeResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://0.0.0.0:8080/MotorbikeService", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _0._0._0._0._8080.motorbikeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFind }
     * 
     */
    public GetFind createGetFind() {
        return new GetFind();
    }

    /**
     * Create an instance of {@link GetFindResponse }
     * 
     */
    public GetFindResponse createGetFindResponse() {
        return new GetFindResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetBike }
     * 
     */
    public GetBike createGetBike() {
        return new GetBike();
    }

    /**
     * Create an instance of {@link GetBikeResponse }
     * 
     */
    public GetBikeResponse createGetBikeResponse() {
        return new GetBikeResponse();
    }

    /**
     * Create an instance of {@link PersonServiceFault }
     * 
     */
    public PersonServiceFault createPersonServiceFault() {
        return new PersonServiceFault();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Motorbike }
     * 
     */
    public Motorbike createMotorbike() {
        return new Motorbike();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "getFind")
    public JAXBElement<GetFind> createGetFind(GetFind value) {
        return new JAXBElement<GetFind>(_GetFind_QNAME, GetFind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "getFindResponse")
    public JAXBElement<GetFindResponse> createGetFindResponse(GetFindResponse value) {
        return new JAXBElement<GetFindResponse>(_GetFindResponse_QNAME, GetFindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "getBike")
    public JAXBElement<GetBike> createGetBike(GetBike value) {
        return new JAXBElement<GetBike>(_GetBike_QNAME, GetBike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "IllegalNameException")
    public JAXBElement<PersonServiceFault> createIllegalNameException(PersonServiceFault value) {
        return new JAXBElement<PersonServiceFault>(_IllegalNameException_QNAME, PersonServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "getBikeResponse")
    public JAXBElement<GetBikeResponse> createGetBikeResponse(GetBikeResponse value) {
        return new JAXBElement<GetBikeResponse>(_GetBikeResponse_QNAME, GetBikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://0.0.0.0:8080/MotorbikeService", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
