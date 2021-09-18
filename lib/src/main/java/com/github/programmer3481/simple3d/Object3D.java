package com.github.programmer3481.simple3d;

import org.joml.Vector3f;

public class Object3D {
    private Vector3f position;
    private Vector3f rotation;
    private Vector3f scale;

    public void render() {
        
    }

    public Vector3f getPos() {
        return position;
    }

    public void setPos(Vector3f position) {
        this.position = position;
    }

    public Vector3f getRot() {
        return rotation;
    }

    public void setRot(Vector3f rotation) {
        this.rotation = rotation;
    }

    public Vector3f getScale() {
        return scale;
    }

    public void setScale(Vector3f scale) {
        this.scale = scale;
    }
    
}
