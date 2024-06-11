package dev.yila.magazyn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BasicRepositoryTest {

    @Test
    public void addRecord() {
        var repository = fishRepository();
        var fish = new Fish("fishy");

        var savedFish = repository.add(fish);

        assertEquals("fishy", savedFish.getOrThrow().name());
        assertEquals(1, repository.count().getOrThrow());
    }

    public abstract BasicRepository<Fish> fishRepository();

    public record Fish(String name) {}
}
