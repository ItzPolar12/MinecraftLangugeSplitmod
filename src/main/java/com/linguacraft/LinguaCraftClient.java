package com.linguacraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Adds Russian translations to vanilla item tooltips without changing the game's language. */
public final class LinguaCraftClient implements ClientModInitializer {
    private static final Map<String, String> RU = new HashMap<>();

    static {
        // Blocks and building materials
        add("stone", "Камень"); add("granite", "Гранит"); add("diorite", "Диорит");
        add("andesite", "Андезит"); add("deepslate", "Глубинный сланец");
        add("cobblestone", "Булыжник"); add("mossy_cobblestone", "Замшелый булыжник");
        add("bedrock", "Коренная порода"); add("dirt", "Земля"); add("coarse_dirt", "Каменистая земля");
        add("grass_block", "Блок травы"); add("podzol", "Подзол"); add("sand", "Песок");
        add("red_sand", "Красный песок"); add("gravel", "Гравий"); add("clay", "Глина");
        add("mud", "Грязь"); add("glass", "Стекло"); add("tinted_glass", "Тонированное стекло");
        add("bricks", "Кирпичи"); add("stone_bricks", "Каменные кирпичи");
        add("mossy_stone_bricks", "Замшелые каменные кирпичи"); add("cracked_stone_bricks", "Потрескавшиеся каменные кирпичи");
        add("obsidian", "Обсидиан"); add("crying_obsidian", "Плачущий обсидиан");
        add("glowstone", "Светокамень"); add("sea_lantern", "Морской фонарь");
        add("torch", "Факел"); add("lantern", "Фонарь"); add("soul_lantern", "Фонарь душ");
        add("crafting_table", "Верстак"); add("furnace", "Печь"); add("blast_furnace", "Плавильная печь");
        add("smoker", "Коптильня"); add("chest", "Сундук"); add("barrel", "Бочка");
        add("ender_chest", "Эндер-сундук"); add("shulker_box", "Шалкеровый ящик");
        add("bookshelf", "Книжная полка"); add("lectern", "Кафедра"); add("anvil", "Наковальня");
        add("enchanting_table", "Стол зачаровывания"); add("brewing_stand", "Зельеварка");
        add("cauldron", "Котёл"); add("bell", "Колокол"); add("ladder", "Лестница");
        add("scaffolding", "Строительные леса"); add("iron_bars", "Железные прутья");
        add("chain", "Цепь"); add("iron_door", "Железная дверь"); add("oak_door", "Дубовая дверь");
        add("oak_planks", "Дубовые доски"); add("spruce_planks", "Еловые доски");
        add("birch_planks", "Берёзовые доски"); add("jungle_planks", "Доски из тропического дерева");
        add("acacia_planks", "Акациевые доски"); add("dark_oak_planks", "Доски из тёмного дуба");
        add("mangrove_planks", "Мангровые доски"); add("cherry_planks", "Вишнёвые доски");
        add("bamboo_planks", "Бамбуковые доски"); add("oak_log", "Дубовое бревно");
        add("spruce_log", "Еловое бревно"); add("birch_log", "Берёзовое бревно");
        add("oak_sapling", "Саженец дуба"); add("oak_leaves", "Дубовые листья");
        add("wheat", "Пшеница"); add("wheat_seeds", "Семена пшеницы"); add("hay_block", "Сноп сена");
        add("farmland", "Пашня"); add("composter", "Компостер");

        // Ores and resources
        add("coal_ore", "Угольная руда"); add("iron_ore", "Железная руда"); add("copper_ore", "Медная руда");
        add("gold_ore", "Золотая руда"); add("redstone_ore", "Редстоуновая руда");
        add("lapis_ore", "Лазуритовая руда"); add("diamond_ore", "Алмазная руда");
        add("emerald_ore", "Изумрудная руда"); add("ancient_debris", "Древние обломки");
        add("coal", "Уголь"); add("charcoal", "Древесный уголь"); add("raw_iron", "Необработанное железо");
        add("raw_copper", "Необработанная медь"); add("raw_gold", "Необработанное золото");
        add("iron_ingot", "Железный слиток"); add("copper_ingot", "Медный слиток");
        add("gold_ingot", "Золотой слиток"); add("netherite_ingot", "Незеритовый слиток");
        add("diamond", "Алмаз"); add("emerald", "Изумруд"); add("lapis_lazuli", "Лазурит");
        add("redstone", "Редстоун"); add("quartz", "Кварц Нижнего мира"); add("amethyst_shard", "Осколок аметиста");
        add("stick", "Палка"); add("string", "Нить"); add("feather", "Перо"); add("leather", "Кожа");
        add("paper", "Бумага"); add("book", "Книга"); add("writable_book", "Книга с пером");
        add("map", "Карта"); add("compass", "Компас"); add("clock", "Часы"); add("name_tag", "Бирка");
        add("lead", "Поводок"); add("bucket", "Ведро"); add("water_bucket", "Ведро воды");
        add("lava_bucket", "Ведро лавы"); add("milk_bucket", "Ведро молока");

        // Tools, armor, and utility items
        add("wooden_pickaxe", "Деревянная кирка"); add("stone_pickaxe", "Каменная кирка");
        add("iron_pickaxe", "Железная кирка"); add("golden_pickaxe", "Золотая кирка");
        add("diamond_pickaxe", "Алмазная кирка"); add("netherite_pickaxe", "Незеритовая кирка");
        add("wooden_axe", "Деревянный топор"); add("stone_axe", "Каменный топор");
        add("iron_axe", "Железный топор"); add("diamond_axe", "Алмазный топор");
        add("wooden_shovel", "Деревянная лопата"); add("stone_shovel", "Каменная лопата");
        add("iron_shovel", "Железная лопата"); add("diamond_shovel", "Алмазная лопата");
        add("wooden_hoe", "Деревянная мотыга"); add("iron_hoe", "Железная мотыга");
        add("diamond_hoe", "Алмазная мотыга"); add("fishing_rod", "Удочка");
        add("flint_and_steel", "Огниво"); add("shears", "Ножницы"); add("brush", "Кисть");
        add("shield", "Щит"); add("elytra", "Элитры"); add("trident", "Трезубец");
        add("bow", "Лук"); add("crossbow", "Арбалет"); add("arrow", "Стрела");
        add("spectral_arrow", "Спектральная стрела"); add("turtle_helmet", "Черепаший панцирь");
        add("leather_helmet", "Кожаный шлем"); add("iron_helmet", "Железный шлем");
        add("diamond_helmet", "Алмазный шлем"); add("netherite_helmet", "Незеритовый шлем");
        add("leather_chestplate", "Кожаная куртка"); add("iron_chestplate", "Железный нагрудник");
        add("diamond_chestplate", "Алмазный нагрудник"); add("netherite_chestplate", "Незеритовый нагрудник");
        add("iron_leggings", "Железные поножи"); add("diamond_leggings", "Алмазные поножи");
        add("iron_boots", "Железные ботинки"); add("diamond_boots", "Алмазные ботинки");
        add("elytra", "Элитры"); add("totem_of_undying", "Тотем бессмертия");
        add("spyglass", "Подзорная труба"); add("firework_rocket", "Фейерверк");

        // Food and farming
        add("apple", "Яблоко"); add("golden_apple", "Золотое яблоко"); add("enchanted_golden_apple", "Зачарованное золотое яблоко");
        add("bread", "Хлеб"); add("carrot", "Морковь"); add("golden_carrot", "Золотая морковь");
        add("potato", "Картофель"); add("baked_potato", "Печёный картофель"); add("beetroot", "Свёкла");
        add("beetroot_soup", "Свекольный суп"); add("pumpkin_pie", "Тыквенный пирог");
        add("cookie", "Печенье"); add("cake", "Торт"); add("melon_slice", "Ломтик арбуза");
        add("sweet_berries", "Сладкие ягоды"); add("glow_berries", "Светящиеся ягоды");
        add("cooked_beef", "Стейк"); add("beef", "Сырая говядина"); add("cooked_porkchop", "Жареная свинина");
        add("porkchop", "Сырая свинина"); add("cooked_chicken", "Жареная курица"); add("chicken", "Сырая курица");
        add("cooked_mutton", "Жареная баранина"); add("mutton", "Сырая баранина");
        add("cooked_cod", "Жареная треска"); add("cod", "Сырая треска"); add("cooked_salmon", "Жареный лосось");
        add("salmon", "Сырой лосось"); add("potion", "Зелье"); add("honey_bottle", "Бутылочка мёда");

        // Common mobs / spawn eggs
        add("pig_spawn_egg", "Яйцо призыва свиньи"); add("cow_spawn_egg", "Яйцо призыва коровы");
        add("sheep_spawn_egg", "Яйцо призыва овцы"); add("chicken_spawn_egg", "Яйцо призыва курицы");
        add("wolf_spawn_egg", "Яйцо призыва волка"); add("cat_spawn_egg", "Яйцо призыва кошки");
        add("zombie_spawn_egg", "Яйцо призыва зомби"); add("skeleton_spawn_egg", "Яйцо призыва скелета");
        add("creeper_spawn_egg", "Яйцо призыва крипера"); add("enderman_spawn_egg", "Яйцо призыва эндермена");
        add("villager_spawn_egg", "Яйцо призыва жителя"); add("iron_golem_spawn_egg", "Яйцо призыва железного голема");
    }

    private static void add(String id, String russian) {
        RU.put(id, russian);
    }

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, tooltipContext, tooltipType, lines) -> {
            if (stack == null || stack.isEmpty()) return;
            ResourceLocation id = net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(stack.getItem());
            if (id == null || !"minecraft".equals(id.getNamespace())) return;
            String russian = RU.get(id.getPath());
            if (russian == null) return;
            lines.add(Component.literal("Русский: " + russian).withStyle(ChatFormatting.AQUA));
        });
    }
}
