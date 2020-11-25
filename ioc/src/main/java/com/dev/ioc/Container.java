package com.dev.ioc;

public abstract class Container {
    private static Container container;

    public static Container getContainer(){
        if(container==null)
            container = new ContainerImpl();

        return container;
    }

    public abstract <T> T get(Class<T> type) throws Exception;

    public abstract <T> void registerSingleton(Object instance);

}
