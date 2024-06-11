package dev.yila.magazyn.memory;

import dev.yila.functional.DirectResult;
import dev.yila.functional.Result;
import dev.yila.magazyn.BasicRepository;
import dev.yila.magazyn.RepositoryFailure;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository {

    public static <T> BasicRepository<T> basic(Class<T> clazz) {
        return new MemoryBasicRepository<>(clazz);
    }

    static class MemoryBasicRepository<T> implements BasicRepository<T> {

        private final Class<T> clazz;
        private List<T> list = new ArrayList<>();

        MemoryBasicRepository(Class<T> clazz) {
            this.clazz = clazz;
        }

        @Override
        public Result<T, RepositoryFailure> add(T data) {
            list.add(data);
            return DirectResult.ok(data);
        }

        @Override
        public Result<Long, RepositoryFailure> count() {
            return DirectResult.ok((long) list.size());
        }
    }
}
