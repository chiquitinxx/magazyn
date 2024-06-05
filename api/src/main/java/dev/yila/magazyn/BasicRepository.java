package dev.yila.magazyn;

import dev.yila.functional.Result;

public interface BasicRepository<T, K> extends DataRepository<T, K> {
    Result<T> create(T data);
    Result<Long> count();
}
