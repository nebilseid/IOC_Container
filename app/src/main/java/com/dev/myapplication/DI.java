package com.dev.myapplication;

import com.dev.ioc.Container;

class DI {

    final Container container = Container.getContainer();

    public void  initializeDependencies(){
        final FakeRetrofit fakeRetrofit = new FakeRetrofit();
        final FakeRepo repo = new FakeRepoImpl(fakeRetrofit);
        container.registerSingleton(repo);
    }

}
