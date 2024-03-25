package org.designpattern.structural.composite.resource;

public class File implements Resource {
    private String name;
    private String type;
    private String size;

    public File(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public void execute() {
        System.out.println("File: " + this.toString());
    }
}
