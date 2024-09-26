package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomAttributeValBody implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String type;
    private String externalId;
    private String systemId;

    public CustomAttributeValBody( String type, String externalId, String systemId ) {
        this.type = type;
        this.externalId = externalId;
        this.systemId = systemId;
    }

    public String getType() {
        return this.type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId( String externalId ) {
        this.externalId = externalId;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public void setSystemId( String systemId ) {
        this.systemId = systemId;
    }

    @Override
    public String toString() {
        return "CustomAttributeValBody{" + "externalId='" + externalId + '\'' + ", type='" + type + '\'' + ", systemId='" + systemId + '\'' + '}';
    }

}
