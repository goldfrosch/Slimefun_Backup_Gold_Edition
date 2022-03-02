package io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.entities;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

/**
 * The {@link WitherAssembler} is an electrical machine that can automatically spawn
 * a {@link WitherSkeleton} if the required ingredients have been provided.
 * 
 * @author TheBusyBiscuit
 * 
 * @see IronGolemAssembler
 *
 */
public class WitherAssembler extends AbstractEntityAssembler<WitherSkeleton> {

    public WitherAssembler(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public int getCapacity() {
        return 4096;
    }

    @Override
    public int getEnergyConsumption() {
        return 4096;
    }

    @Override
    public ItemStack getHead() {
        return new ItemStack(Material.COAL, 3);
    }

    @Override
    public Material getHeadBorder() {
        return Material.BLACK_STAINED_GLASS_PANE;
    }

    @Override
    public ItemStack getBody() {
        return new ItemStack(Material.SKELETON_SKULL, 1);
    }

    @Override
    public Material getBodyBorder() {
        return Material.BROWN_STAINED_GLASS_PANE;
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {
        preset.addItem(1, new CustomItem(getHead(), "&7석탄 슬롯", "", "&f석탄을 넣는 공간입니다"), ChestMenuUtils.getEmptyClickHandler());
        preset.addItem(7, new CustomItem(getBody(), "&7해골 슬롯", "", "&f해골을 넣는 공간입니다"), ChestMenuUtils.getEmptyClickHandler());
        preset.addItem(13, new CustomItem(Material.CLOCK, "&7쿨타임: &b30초"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    public WitherSkeleton spawnEntity(Location l) {
        return l.getWorld().spawn(l, WitherSkeleton.class);
    }

}
