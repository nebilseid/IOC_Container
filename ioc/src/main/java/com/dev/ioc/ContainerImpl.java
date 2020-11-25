package com.dev.ioc;

import java.util.HashSet;
import java.util.Set;

public class ContainerImpl extends Container {

    private final Set<Object> instances = new HashSet<>();

    @Override
    public <T> T get(Class<T> type) throws Exception {
        for (Object instance: instances) {
            if(type.isInstance(instance)){
                return (T) instance;
            }
        }

        throw new Exception("Couldn't found the dependency");
    }

    @Override
    public <T> void registerSingleton(Object instance) {
        instances.add(instance);
    }


}