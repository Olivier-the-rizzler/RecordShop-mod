# Record Shop Mod — NeoForge 1.21.1

Adds a **Record Crate** block to Minecraft — a dark oak crate that holds 9 music discs,
perfect for building your dream record shop.

## Features
- **Record Crate block** — stores exactly 9 music discs (one per slot)
- **Only accepts music discs** — won't let you accidentally put in other items
- **Faces the player** when placed, like a real shop display
- **Drops all discs** when broken, nothing is lost
- **Dark oak aesthetic** with visible record spines on the front face

## Crafting Recipe
```
[Dark Oak Plank] [Dark Oak Plank] [Dark Oak Plank]
[Dark Oak Plank] [             ] [Dark Oak Plank]
[Dark Oak Slab ] [Dark Oak Slab ] [Dark Oak Slab ]
```

## How to Build

### Requirements
- Java 21 (JDK)
- Internet connection (Gradle will download NeoForge)

### Steps
```bash
# On Windows:
gradlew.bat build

# On Mac/Linux:
./gradlew build
```

The compiled `.jar` will be at:
`build/libs/recordshop-1.0.0.jar`

Copy that file into your Minecraft `mods/` folder.

### First-time setup (generates Gradle wrapper)
```bash
gradle wrapper --gradle-version 8.8
```
Then run the build command above.

## Installation
1. Install [NeoForge 1.21.1](https://neoforged.net/)
2. Drop `recordshop-1.0.0.jar` into your `mods/` folder
3. Launch Minecraft — the Record Crate will be in your inventory

## Tips for Your Record Shop
- Place crates in rows facing the aisle so customers can flip through
- Use dark oak slabs and stairs for shelving above the crates
- A jukebox in the corner plays the atmosphere 🎵
