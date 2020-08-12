package kr.skylightqp.carrotmafia.commands

import kr.skylightqp.carrotmafia.CarrotMafia
import org.bukkit.Location
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TeleportPositionCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        val p = sender as Player

        if(args.size < 3) {
            p.sendMessage(CarrotMafia.PREFIX + "사용법: /ta <x> <y> <z>")
            return false
        }

        val movingLocation = Location(p.world, args[0].toDouble(), args[1].toDouble(), args[2].toDouble())
        p.teleport(movingLocation)

        p.sendMessage(CarrotMafia.PREFIX + "텔레포트 성공!")

        return false
    }

}