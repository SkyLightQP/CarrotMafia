package kr.skylightqp.carrotmafia

import org.bukkit.plugin.java.JavaPlugin

class CarrotMafia : JavaPlugin() {
    companion object {
        val PREFIX = "§c[CarrotMafia] §r"
    }

    override fun onEnable() {
        logger.info("CarrotMafia 시작")
    }

    override fun onDisable() {
        logger.info("CarrotMafia 종료")
    }
}