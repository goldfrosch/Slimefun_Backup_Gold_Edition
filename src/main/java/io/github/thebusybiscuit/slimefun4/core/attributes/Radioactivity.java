package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * This enum holds all available levels of {@link Radioactivity}.
 * The higher the level the more severe the effect of radiation will be.
 * 
 * @author TheBusyBiscuit
 * 
 * @see Radioactive
 *
 */
public enum Radioactivity {

    /**
     * This represents a low level of radiation.
     * It will still cause damage but will take a while before it becomes deadly.
     */
    LOW(ChatColor.YELLOW,"매우 낮음"),

    /**
     * This represents a medium level of radiation.
     * This can be considered the default.
     */
    MODERATE(ChatColor.YELLOW,"평균"),

    /**
     * This is a high level of radiation.
     * It will cause death if the {@link Player} does not act quickly.
     */
    HIGH(ChatColor.DARK_GREEN,"높음"),

    /**
     * A very high level of radiation will be deadly.
     * The {@link Player} should not take this too lightly...
     */
    VERY_HIGH(ChatColor.RED,"매우 높음"),

    /**
     * This is the deadlies level of radiation.
     * The {@link Player} has basically no chance to protect themselves in time.
     * It will cause certain death.
     */
    VERY_DEADLY(ChatColor.DARK_RED,"계산 불가");

    private final ChatColor color;
    private final String rankPrefix;
    
    Radioactivity(@Nonnull ChatColor color,@Nonnull String rank) {
        this.color = color;
        this.rankPrefix = rank;
    }

    @Nonnull
    public String getLore() {
        return ChatColor.GREEN + "\u2622" + ChatColor.GRAY + " 방사능 레벨: " + color + rankPrefix;
    }

    /**
     * This method returns the level for the radiation effect to use in conjunction
     * with this level of {@link Radioactive}.
     * 
     * It is basically the index of this enum constant.
     * 
     * @return The level of radiation associated with this constant.
     */
    public int getRadiationLevel() {
        return ordinal() + 1;
    }

}
