# LinguaCraft — English + Russian

A client-side Fabric mod for Minecraft Java Edition 26.3. When you hover over supported vanilla items in an inventory, it adds a Russian translation line to the tooltip. Minecraft's normal English item name stays unchanged.

Example:
- **Oak Log** (the normal Minecraft name)
- `Русский: Дубовое бревно`

## Current features
- Russian tooltip translations for a starter vocabulary of common blocks, materials, tools, food, and spawn eggs.
- Client-side only; no server-side installation needed.
- Unknown items and items from other mods are left alone.

## Build requirements
- Minecraft Java Edition 26.3
- JDK 25
- Fabric Loader 0.19.5 or newer
- Fabric API for Minecraft 26.3
- Gradle (the project uses Fabric Loom)

## Build the mod
Open a terminal in this folder and run:

Windows:
```powershell
gradle build
```

macOS/Linux:
```bash
gradle build
```

The resulting JAR should be in `build/libs/`. Copy the non-sources JAR into your Minecraft instance's `mods` folder, alongside Fabric API.

## Install
1. Install Fabric Loader for Minecraft 26.3.
2. Put a compatible Fabric API JAR in the same instance's `mods` folder.
3. Put the built LinguaCraft JAR in `mods`.
4. Launch the Fabric 26.3 profile and hover over supported items.

## Notes
This is a starter vocabulary mod, not a complete dictionary of every Minecraft item. Translations are supplied in `LinguaCraftClient.java`; add more entries with `add("minecraft_item_id", "Русский перевод");`.

Unofficial Minecraft mod; not approved by or associated with Mojang or Microsoft.
