# Emerald Tools
![Version](https://img.shields.io/badge/version-1.19.4--1.1.0.1-blue?style=flat-square)
![GitHub](https://img.shields.io/github/license/ShadowGry/emerald-tools?style=flat-square)

A Minecraft mod that adds in emerald tools and armor using Forge.

![Steve wearing emerald armor](https://drive.google.com/uc?id=1i9KSMsVUJc53n0_7eUF9pRkWPdK7xdip)

In Minecraft, emeralds are exclusively used for trading. This mod gives them more uses by being able to craft them into tools and armor.

## What's New
This mod adds in the following into Minecraft:

* Emerald Shovel
* Emerald Pickaxe
* Emerald Axe
* Emerald Hoe
* Emerald Sword
* Emerald Helmet
* Emerald Chestplate
* Emerald Leggings
* Emerald Boots
* Emerald Horse Armor

![Emerald tools tab](https://drive.google.com/uc?id=1RR4OOYMA9LqYA4PE2ufSuT93Qw3D_Hy4)

Emerald tools and armor can be crafted just like other items in-game, but instead with emeralds.

![Emerald pickaxe crafting recipe](https://drive.google.com/uc?id=1NBNxBQupBf9MIV-R7mvwnXQJUGDwCfNU)

The emerald tier (both tool and armor) sits between the iron and diamond tiers. Emerald tools have the same harvest level as diamond (level 3) and have a total durability of 779 uses. Emerald horse armor provides 9 defense points.

The emerald tier sits below the diamond tier because the villager career trading level, Expert (emerald badge), is below Master (diamond badge). Another reason is because they are easier to aquire through trading.

## Download and Installation
If you just want the `JAR` file, go to Releases and download for the version you want, and skip to Step 6. Otherwise, these instructions will show how to build it from source.

### Prerequisites
It is assumed you have Java 17 JDK and 64-bit JVM already installed. For help, see the [Forge Documentation](https://docs.minecraftforge.net) regarding the prerequisites, and also for additional information regarding the following steps.

### Steps
1. Clone this repository (or `Code > Download ZIP` and extract).
```bat
git clone https://github.com/ShadowGry/emerald-tools
```
2. Import the project to your chosen IDE with `build.gradle` (if using Eclipse or Intellij IDEA) and use it to setup the workspace.
3. Generate launch configurations depending on your IDE:

Eclipse:
```bat
./gradlew genEclipseRuns
```
Intellij:
```bat
./gradlew genIntellijRuns
```
Visual Studio Code:
```bat
./gradlew genVSCodeRuns
```
If on Windows, use without `./`.

4. The mod can be launched with:
```bat
./gradlew runClient
```
which will launch Minecraft, however this meant for development only.

5. To build the mod (in other words, create the `JAR` file), run:
```bat
./gradlew build
```
which will output the mod in a `JAR` file in `build/libs`.

6. Download and run the latest version of the [Forge Installer](https://files.minecraftforge.net).
7. Place the `JAR` inside the `.minecraft/mods` folder. If `mods` doesn't exist, create it.
8. From the Minecraft launcher, switch to the newly create Forge profile, and play Minecraft. You can check that everything has been done correctly by clicking "Mods" from the main menu and seeing that "Emerald Tools" is listed on the left.

## Acknolwedgements
Early development of this mod began by following TechnoVision's 1.15/1.16 modding tutorials on [YouTube](https://www.youtube.com/playlist?list=PLDhiRTZ_vnoWsCqtoG1X1MbGY5xATTadb).

## License
Copyright (C) 2022 ShadowGry. See [LICENSE](LICENSE) for more details.
