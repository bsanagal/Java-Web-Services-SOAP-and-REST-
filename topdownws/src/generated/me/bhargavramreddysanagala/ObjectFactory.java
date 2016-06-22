
package me.bhargavramreddysanagala;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.bhargavramreddysanagala package. 
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

    private final static QName _GetOrderResponse_QNAME = new QName("http://bhargavramreddysanagala.me", "getOrderResponse");
    private final static QName _GetOrderRequest_QNAME = new QName("http://bhargavramreddysanagala.me", "getOrderRequest");
    private final static QName _CreateOrderRequest_QNAME = new QName("http://bhargavramreddysanagala.me", "createOrderRequest");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://bhargavramreddysanagala.me", "createOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.bhargavramreddysanagala
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrderRequest }
     * 
     */
    public GetOrderRequest createGetOrderRequest() {
        return new GetOrderRequest();
    }

    /**
     * Create an instance of {@link CreateOrderRequest }
     * 
     */
    public CreateOrderRequest createCreateOrderRequest() {
        return new CreateOrderRequest();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bhargavramreddysanagala.me", name = "getOrderResponse")
    public JAXBElement<GetOrderResponse> createGetOrderResponse(GetOrderResponse value) {
        return new JAXBElement<GetOrderResponse>(_GetOrderResponse_QNAME, GetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bhargavramreddysanagala.me", name = "getOrderRequest")
    public JAXBElement<GetOrderRequest> createGetOrderRequest(GetOrderRequest value) {
        return new JAXBElement<GetOrderRequest>(_GetOrderRequest_QNAME, GetOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bhargavramreddysanagala.me", name = "createOrderRequest")
    public JAXBElement<CreateOrderRequest> createCreateOrderRequest(CreateOrderRequest value) {
        return new JAXBElement<CreateOrderRequest>(_CreateOrderRequest_QNAME, CreateOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bhargavramreddysanagala.me", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

}
