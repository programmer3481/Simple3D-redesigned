package com.github.programmer3481.simple3d;

import java.util.HashMap;


public class World {
    public HashMap<String, ObjectCollection> collections;
    public HashMap<String, Object3D> objects;
    public HashMap<String, Camera> cameras;

    public void renderWorld() {
        for (Object3D object : objects.values()) {
            object.render();
        }
        for (ObjectCollection collection : collections.values()) {
            collection.render();
        }
    }

    public void addObject(Object3D object, String name) {
        objects.put(name, object);
    }

    public Object3D getObject(String name) {
        return objects.get(name);
    }

    public void addCollection(ObjectCollection collection, String name) {
        collections.put(name, collection);
    }

    public ObjectCollection getCollection(String name) {
        return collections.get(name);
    }
}
