package io.github.mat3e;

class Service {
    final static String DEFAULT_GREETING = "Hello world!!!";

    String ustalPowitanie(String name) {
        if (name == null)
            return DEFAULT_GREETING;

        return "Hello " + name;
    }
}
