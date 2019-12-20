package jar.app;

import io.micronaut.cache.annotation.Cacheable;

import javax.inject.Singleton;

@Singleton
public class CalculatorService {

    @Cacheable("my-cache")
    public int addOne(int num) {
        System.out.println("called");
        return num + 1;
    }
}
