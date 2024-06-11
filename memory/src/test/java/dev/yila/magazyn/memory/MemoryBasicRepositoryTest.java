package dev.yila.magazyn.memory;

import dev.yila.magazyn.BasicRepository;
import dev.yila.magazyn.BasicRepositoryTest;

public class MemoryBasicRepositoryTest extends BasicRepositoryTest {
    @Override
    public BasicRepository<Fish> fishRepository() {
        return MemoryRepository.basic(Fish.class);
    }
}
