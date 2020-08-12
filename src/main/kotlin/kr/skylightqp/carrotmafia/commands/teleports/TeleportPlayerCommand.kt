package kr.skylightqp.carrotmafia.commands.teleports

import kr.skylightqp.carrotmafia.CarrotMafia
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TeleportPlayerCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        val p = sender as Player

        if (args.isEmpty()) {
            p.sendMessage(CarrotMafia.PREFIX + "사용법: /tp <player>")
            return false
        }

        val target = Bukkit.getPlayer(args[0])
        if(target == null) {
            p.sendMessage(CarrotMafia.PREFIX + "플레이어가 존재하지 않습니다.")
            return false
        }

        p.teleport(target)

        p.sendMessage(CarrotMafia.PREFIX + "텔레포트 성공!")

        return false
    }

}