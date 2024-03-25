package org.designpattern.structural.composite.resource;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Resource{
    private String name;
    private List<Resource> resources;

    public Folder(String name) {
        this.name = name;
        this.resources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
    }

    public void removeResource(Resource resource) {
        this.resources.remove(resource);
    }

    @Override
    public void execute() {
        System.out.println("Folder: " + this.name);
        for (Resource resource : resources) {
            resource.execute();
        }
    }
}
