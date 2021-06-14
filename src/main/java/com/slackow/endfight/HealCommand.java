package com.slackow.endfight;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class HealCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "heal";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "/heal";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) sender;
            player.setHealth(20f);
            player.setFire(-1);
            player.getFoodStats().setFoodLevel(20);
            player.getFoodStats().setFoodSaturationLevel(4);
        }
    }
}
