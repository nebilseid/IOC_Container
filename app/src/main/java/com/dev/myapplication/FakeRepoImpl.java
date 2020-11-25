package com.dev.myapplication;

class FakeRepoImpl implements FakeRepo{
    final FakeRetrofit fakeRetrofit;

    public FakeRepoImpl(FakeRetrofit fakeRetrofit) {
        this.fakeRetrofit = fakeRetrofit;
    }

    @Override
    public String getData() {
        return "Yay! its working...";
    }
}
