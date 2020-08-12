package kr.skylightqp.carrotmafia

import kr.skylightqp.carrotmafia.commands.teleports.TeleportPlayerCommand
import kr.skylightqp.carrotmafia.commands.teleports.TeleportPositionCommand
import org.bukkit.plugin.java.JavaPlugin

class CarrotMafia : JavaPlugin() {
    companion object {
        val PREFIX = "§c[CarrotMafia] §r"
    }

    override fun onEnable() {
        logger.info("CarrotMafia 시작")

        getCommand("ta").executor = TeleportPositionCommand()
        getCommand("tp").executor = TeleportPlayerCommand()
    }

    override fun onDisable() {
        logger.info("CarrotMafia 종료")
    }
}