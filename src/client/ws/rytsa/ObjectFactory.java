
package client.ws.rytsa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.ws.rytsa package. 
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

    private final static QName _ResetBBDD_QNAME = new QName("http://valuaciones.itau.rytsa/", "resetBBDD");
    private final static QName _ParseException_QNAME = new QName("http://valuaciones.itau.rytsa/", "ParseException");
    private final static QName _CalcularMTMNdfResponse_QNAME = new QName("http://valuaciones.itau.rytsa/", "calcularMTMNdfResponse");
    private final static QName _TestSuma1DiaResponse_QNAME = new QName("http://valuaciones.itau.rytsa/", "testSuma1DiaResponse");
    private final static QName _CalcularMTMSwap_QNAME = new QName("http://valuaciones.itau.rytsa/", "calcularMTMSwap");
    private final static QName _TestSuma1Dia_QNAME = new QName("http://valuaciones.itau.rytsa/", "testSuma1Dia");
    private final static QName _Exception_QNAME = new QName("http://valuaciones.itau.rytsa/", "Exception");
    private final static QName _CalcularMTMSwapResponse_QNAME = new QName("http://valuaciones.itau.rytsa/", "calcularMTMSwapResponse");
    private final static QName _CalcularMTMNdf_QNAME = new QName("http://valuaciones.itau.rytsa/", "calcularMTMNdf");
    private final static QName _ResetBBDDResponse_QNAME = new QName("http://valuaciones.itau.rytsa/", "resetBBDDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.ws.rytsa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularMTMNdfResponse }
     * 
     */
    public CalcularMTMNdfResponse createCalcularMTMNdfResponse() {
        return new CalcularMTMNdfResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link InformarNovedadesValuacionesXmlRequest }
     * 
     */
    public InformarNovedadesValuacionesXmlRequest createInformarNovedadesValuacionesXmlRequest() {
        return new InformarNovedadesValuacionesXmlRequest();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link CalcularMTMNdf }
     * 
     */
    public CalcularMTMNdf createCalcularMTMNdf() {
        return new CalcularMTMNdf();
    }

    /**
     * Create an instance of {@link TestSuma1Dia }
     * 
     */
    public TestSuma1Dia createTestSuma1Dia() {
        return new TestSuma1Dia();
    }

    /**
     * Create an instance of {@link TestSuma1DiaResponse }
     * 
     */
    public TestSuma1DiaResponse createTestSuma1DiaResponse() {
        return new TestSuma1DiaResponse();
    }

    /**
     * Create an instance of {@link CalcularMTMSwapResponse }
     * 
     */
    public CalcularMTMSwapResponse createCalcularMTMSwapResponse() {
        return new CalcularMTMSwapResponse();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link ResetBBDD }
     * 
     */
    public ResetBBDD createResetBBDD() {
        return new ResetBBDD();
    }

    /**
     * Create an instance of {@link ResetBBDDResponse }
     * 
     */
    public ResetBBDDResponse createResetBBDDResponse() {
        return new ResetBBDDResponse();
    }

    /**
     * Create an instance of {@link CalcularMTMSwap }
     * 
     */
    public CalcularMTMSwap createCalcularMTMSwap() {
        return new CalcularMTMSwap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBBDD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "resetBBDD")
    public JAXBElement<ResetBBDD> createResetBBDD(ResetBBDD value) {
        return new JAXBElement<ResetBBDD>(_ResetBBDD_QNAME, ResetBBDD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMTMNdfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "calcularMTMNdfResponse")
    public JAXBElement<CalcularMTMNdfResponse> createCalcularMTMNdfResponse(CalcularMTMNdfResponse value) {
        return new JAXBElement<CalcularMTMNdfResponse>(_CalcularMTMNdfResponse_QNAME, CalcularMTMNdfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSuma1DiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "testSuma1DiaResponse")
    public JAXBElement<TestSuma1DiaResponse> createTestSuma1DiaResponse(TestSuma1DiaResponse value) {
        return new JAXBElement<TestSuma1DiaResponse>(_TestSuma1DiaResponse_QNAME, TestSuma1DiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMTMSwap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "calcularMTMSwap")
    public JAXBElement<CalcularMTMSwap> createCalcularMTMSwap(CalcularMTMSwap value) {
        return new JAXBElement<CalcularMTMSwap>(_CalcularMTMSwap_QNAME, CalcularMTMSwap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSuma1Dia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "testSuma1Dia")
    public JAXBElement<TestSuma1Dia> createTestSuma1Dia(TestSuma1Dia value) {
        return new JAXBElement<TestSuma1Dia>(_TestSuma1Dia_QNAME, TestSuma1Dia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMTMSwapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "calcularMTMSwapResponse")
    public JAXBElement<CalcularMTMSwapResponse> createCalcularMTMSwapResponse(CalcularMTMSwapResponse value) {
        return new JAXBElement<CalcularMTMSwapResponse>(_CalcularMTMSwapResponse_QNAME, CalcularMTMSwapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularMTMNdf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "calcularMTMNdf")
    public JAXBElement<CalcularMTMNdf> createCalcularMTMNdf(CalcularMTMNdf value) {
        return new JAXBElement<CalcularMTMNdf>(_CalcularMTMNdf_QNAME, CalcularMTMNdf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetBBDDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valuaciones.itau.rytsa/", name = "resetBBDDResponse")
    public JAXBElement<ResetBBDDResponse> createResetBBDDResponse(ResetBBDDResponse value) {
        return new JAXBElement<ResetBBDDResponse>(_ResetBBDDResponse_QNAME, ResetBBDDResponse.class, null, value);
    }

}
