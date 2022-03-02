package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {

    BASIC("&e기본"),
    AVERAGE("&6하급"),
    MEDIUM("&a중급"),
    GOOD("&2상급"),
    ADVANCED("&6최상급"),
    END_GAME("&4종결급");

    private final String prefix;

    MachineTier(@Nonnull String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }

}
