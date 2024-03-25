package org.designpattern.structural.composite.resource;

import java.util.ArrayList;
import java.util.List;

public class Drive implements Resource{
    private String name;
    private String size;
    private List<Resource> resources;

    public Drive(String name, String size) {
        this.name = name;
        this.size = size;
        this.resources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
    }

    public void removeResource(Resource resource) {
        this.resources.remove(resource);
    }

    @Override
    public void execute() {
        System.out.println("Drive: " + this.name + " Size: " + this.size);
        for (Resource resource : resources) {
            resource.execute();
        }
    }
}
