package net.emilsg.ffaf.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen(){

        ModOreGen.generateOres();
        ModFlowerGen.generateFlowers();
        ModTreeGen.generateTrees();
    }
}
