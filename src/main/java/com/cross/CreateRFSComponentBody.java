package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreateRFSComponentBody implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.util.List<CreateRFSComponentResourceBody> resources;

    public CreateRFSComponentBody( java.util.List<CreateRFSComponentResourceBody> resources ) {
        this.resources = resources;
    }

    public java.util.List<CreateRFSComponentResourceBody> getResources() {
        return this.resources;
    }

    public void setResources( java.util.List<CreateRFSComponentResourceBody> resources ) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "CreateRFSComponentBody{" + "resources=" + resources + '}';
    }

}
