package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InsertMaterialTemplateNodeBody implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String materialTemplateName;
    private String name;
    private String statusDiscriminator;

    public InsertMaterialTemplateNodeBody( String materialTemplateName, String name, String statusDiscriminator ) {
        this.materialTemplateName = materialTemplateName;
        this.name = name;
        this.statusDiscriminator = statusDiscriminator;
    }

    public String getMaterialTemplateName() {
        return this.materialTemplateName;
    }

    public void setMaterialTemplateName( String materialTemplateName ) {
        this.materialTemplateName = materialTemplateName;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getStatusDiscriminator() {
        return this.statusDiscriminator;
    }

    public void setStatusDiscriminator( String statusDiscriminator ) {
        this.statusDiscriminator = statusDiscriminator;
    }

    @Override
    public String toString() {
        return "InsertMaterialTemplateNodeBody{" + "materialTemplateName='" + materialTemplateName + '\'' + ", name='" + name + '\'' +
               ", statusDiscriminator='" + statusDiscriminator + '\'' + '}';
    }

}
