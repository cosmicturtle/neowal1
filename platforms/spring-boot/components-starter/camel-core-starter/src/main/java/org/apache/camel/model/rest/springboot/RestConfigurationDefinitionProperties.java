/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.rest.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestHostNameResolver;
import org.apache.camel.model.rest.RestPropertyDefinition;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To configure rest
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.rest")
public class RestConfigurationDefinitionProperties {

    /**
     * The Camel Rest component to use for the REST transport (consumer) such as
     * restlet spark-rest. If no component has been explicit configured then
     * Camel will lookup if there is a Camel component that integrates with the
     * Rest DSL or if a org.apache.camel.spi.RestConsumerFactory is registered
     * in the registry. If either one is found then that is being used.
     */
    private String component;
    /**
     * The name of the Camel component to use as the REST API (such as swagger)
     */
    private String apiComponent = "swagger";
    /**
     * Sets the name of the Camel component to use as the REST producer
     */
    private String producerComponent;
    /**
     * The scheme to use for exposing the REST service. Usually http or https is
     * supported. The default value is http
     */
    private String scheme;
    /**
     * The hostname to use for exposing the REST service.
     */
    private String host;
    /**
     * The port number to use for exposing the REST service. Notice if you use
     * servlet component then the port number configured here does not apply as
     * the port number in use is the actual port number the servlet component is
     * using. eg if using Apache Tomcat its the tomcat http port if using Apache
     * Karaf its the HTTP service in Karaf that uses port 8181 by default etc.
     * Though in those situations setting the port number here allows tooling
     * and JMX to know the port number so its recommended to set the port number
     * to the number that the servlet engine uses.
     */
    private String port;
    /**
     * Sets the location of the api document (swagger api) the REST producer
     * will use to validate the REST uri and query parameters are valid
     * accordingly to the api document. This requires adding camel-swagger-java
     * to the classpath and any miss configuration will let Camel fail on
     * startup and report the error(s). The location of the api document is
     * loaded from classpath by default but you can use file: or http: to refer
     * to resources to load from file or http url.
     */
    private String producerApiDoc;
    /**
     * Sets a leading context-path the REST services will be using. This can be
     * used when using components such as camel-servlet where the deployed web
     * application is deployed using a context-path. Or for components such as
     * camel-jetty or camel-netty4-http that includes a HTTP server.
     */
    private String contextPath;
    /**
     * Sets a leading API context-path the REST API services will be using. This
     * can be used when using components such as camel-servlet where the
     * deployed web application is deployed using a context-path.
     */
    private String apiContextPath;
    /**
     * Sets the route id to use for the route that services the REST API. The
     * route will by default use an auto assigned route id.
     */
    private String apiContextRouteId;
    /**
     * Sets an CamelContext id pattern to only allow Rest APIs from rest
     * services within CamelContext's which name matches the pattern. The
     * pattern name refers to the CamelContext name to match on the current
     * CamelContext only. For any other value the pattern uses the rules from
     * link org.apache.camel.util.EndpointHelpermatchPattern(String String)
     */
    private String apiContextIdPattern;
    /**
     * Sets whether listing of all available CamelContext's with REST services
     * in the JVM is enabled. If enabled it allows to discover these contexts if
     * false then only the current CamelContext is in use.
     */
    private Boolean apiContextListing = false;
    /**
     * If no hostname has been explicit configured then this resolver is used to
     * compute the hostname the REST service will be using.
     */
    private RestHostNameResolver hostNameResolver;
    /**
     * Sets the binding mode to use. The default value is off
     */
    private RestBindingMode bindingMode;
    /**
     * Whether to skip binding on output if there is a custom HTTP error code
     * header. This allows to build custom error messages that do not bind to
     * json / xml etc as success messages otherwise will do.
     */
    private Boolean skipBindingOnErrorCode = false;
    /**
     * Whether to enable CORS headers in the HTTP response. The default value is
     * false.
     */
    private Boolean enableCors = false;
    /**
     * Name of specific json data format to use. By default json-jackson will be
     * used. Important: This option is only for setting a custom name of the
     * data format not to refer to an existing data format instance.
     */
    private String jsonDataFormat;
    /**
     * Name of specific XML data format to use. By default jaxb will be used.
     * Important: This option is only for setting a custom name of the data
     * format not to refer to an existing data format instance.
     */
    private String xmlDataFormat;
    /**
     * Allows to configure as many additional properties for the rest component
     * in use.
     */
    private List<RestPropertyDefinition> componentProperty;
    /**
     * Allows to configure as many additional properties for the rest endpoint
     * in use.
     */
    private List<RestPropertyDefinition> endpointProperty;
    /**
     * Allows to configure as many additional properties for the rest consumer
     * in use.
     */
    private List<RestPropertyDefinition> consumerProperty;
    /**
     * Allows to configure as many additional properties for the data formats in
     * use. For example set property prettyPrint to true to have json outputted
     * in pretty mode. The properties can be prefixed to denote the option is
     * only for either JSON or XML and for either the IN or the OUT. The
     * prefixes are: json.in. json.out. xml.in. xml.out. For example a key with
     * value xml.out.mustBeJAXBElement is only for the XML data format for the
     * outgoing. A key without a prefix is a common key for all situations.
     */
    private List<RestPropertyDefinition> dataFormatProperty;
    /**
     * Allows to configure as many additional properties for the api
     * documentation (swagger). For example set property api.title to my cool
     * stuff
     */
    private List<RestPropertyDefinition> apiProperty;
    /**
     * Allows to configure custom CORS headers.
     */
    private List<RestPropertyDefinition> corsHeaders;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getApiComponent() {
        return apiComponent;
    }

    public void setApiComponent(String apiComponent) {
        this.apiComponent = apiComponent;
    }

    public String getProducerComponent() {
        return producerComponent;
    }

    public void setProducerComponent(String producerComponent) {
        this.producerComponent = producerComponent;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProducerApiDoc() {
        return producerApiDoc;
    }

    public void setProducerApiDoc(String producerApiDoc) {
        this.producerApiDoc = producerApiDoc;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getApiContextPath() {
        return apiContextPath;
    }

    public void setApiContextPath(String apiContextPath) {
        this.apiContextPath = apiContextPath;
    }

    public String getApiContextRouteId() {
        return apiContextRouteId;
    }

    public void setApiContextRouteId(String apiContextRouteId) {
        this.apiContextRouteId = apiContextRouteId;
    }

    public String getApiContextIdPattern() {
        return apiContextIdPattern;
    }

    public void setApiContextIdPattern(String apiContextIdPattern) {
        this.apiContextIdPattern = apiContextIdPattern;
    }

    public Boolean getApiContextListing() {
        return apiContextListing;
    }

    public void setApiContextListing(Boolean apiContextListing) {
        this.apiContextListing = apiContextListing;
    }

    public RestHostNameResolver getHostNameResolver() {
        return hostNameResolver;
    }

    public void setHostNameResolver(RestHostNameResolver hostNameResolver) {
        this.hostNameResolver = hostNameResolver;
    }

    public RestBindingMode getBindingMode() {
        return bindingMode;
    }

    public void setBindingMode(RestBindingMode bindingMode) {
        this.bindingMode = bindingMode;
    }

    public Boolean getSkipBindingOnErrorCode() {
        return skipBindingOnErrorCode;
    }

    public void setSkipBindingOnErrorCode(Boolean skipBindingOnErrorCode) {
        this.skipBindingOnErrorCode = skipBindingOnErrorCode;
    }

    public Boolean getEnableCors() {
        return enableCors;
    }

    public void setEnableCors(Boolean enableCors) {
        this.enableCors = enableCors;
    }

    public String getJsonDataFormat() {
        return jsonDataFormat;
    }

    public void setJsonDataFormat(String jsonDataFormat) {
        this.jsonDataFormat = jsonDataFormat;
    }

    public String getXmlDataFormat() {
        return xmlDataFormat;
    }

    public void setXmlDataFormat(String xmlDataFormat) {
        this.xmlDataFormat = xmlDataFormat;
    }

    public List<RestPropertyDefinition> getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(
            List<RestPropertyDefinition> componentProperty) {
        this.componentProperty = componentProperty;
    }

    public List<RestPropertyDefinition> getEndpointProperty() {
        return endpointProperty;
    }

    public void setEndpointProperty(
            List<RestPropertyDefinition> endpointProperty) {
        this.endpointProperty = endpointProperty;
    }

    public List<RestPropertyDefinition> getConsumerProperty() {
        return consumerProperty;
    }

    public void setConsumerProperty(
            List<RestPropertyDefinition> consumerProperty) {
        this.consumerProperty = consumerProperty;
    }

    public List<RestPropertyDefinition> getDataFormatProperty() {
        return dataFormatProperty;
    }

    public void setDataFormatProperty(
            List<RestPropertyDefinition> dataFormatProperty) {
        this.dataFormatProperty = dataFormatProperty;
    }

    public List<RestPropertyDefinition> getApiProperty() {
        return apiProperty;
    }

    public void setApiProperty(List<RestPropertyDefinition> apiProperty) {
        this.apiProperty = apiProperty;
    }

    public List<RestPropertyDefinition> getCorsHeaders() {
        return corsHeaders;
    }

    public void setCorsHeaders(List<RestPropertyDefinition> corsHeaders) {
        this.corsHeaders = corsHeaders;
    }
}