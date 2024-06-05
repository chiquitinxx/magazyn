package dev.yila.magazyn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public abstract class BasicRepositoryTest {

    @Test
    public void addFirst() {
        var repository = fishRepository();
        var fish = new Fish(0L, "fishy");

        var savedFish = repository.create(fish);

        assertNotEquals(0L, savedFish.getOrThrow().id());
        assertEquals(1, repository.count().getOrThrow());
    }

    abstract BasicRepository<Fish, Long> fishRepository();

    @Repository
    public interface FishRepository extends BasicRepository<Fish, Long> {

    }

    public record Fish(Long id, String name) {};
}
