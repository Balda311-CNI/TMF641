package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreateServiceFromServiceTemplateBody implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String serviceTemplateName;
    private String name;

    public CreateServiceFromServiceTemplateBody( String serviceTemplateName, String name ) {
        this.serviceTemplateName = serviceTemplateName;
        this.name = name;
    }

    public String getServiceTemplateName() {
        return this.serviceTemplateName;
    }

    public void setServiceTemplateName( String serviceTemplateName ) {
        this.serviceTemplateName = serviceTemplateName;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreateServiceFromServiceTemplateBody{" + "name='" + name + '\'' + ", serviceTemplateName='" + serviceTemplateName + '\'' + '}';
    }

}
