package com.bhasker.dgstack.lamdaex;

@FunctionalInterface
public interface GenericFunctional<T> {

    T reserve(T value);
}
