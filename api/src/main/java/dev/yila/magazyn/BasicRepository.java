package dev.yila.magazyn;

import dev.yila.functional.Result;

public interface BasicRepository<T> extends DataRepository<T> {
    Result<T, RepositoryFailure> add(T data);
    Result<Long, RepositoryFailure> count();
}
