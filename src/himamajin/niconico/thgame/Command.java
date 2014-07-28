package himamajin.niconico.thgame;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class Command extends Main implements CommandExecutor {
	
	//
	//tosoコマンドが実行された時
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		Player player = sender.getServer().getPlayerExact(sender.getName());//コマンドを実行したプレイヤー
		//引数がないとき
		if(args.length==0){
			//コマンドの一覧を説明を表示（仮）
			player.sendMessage(ChatColor.GREEN+"/lb setlobby"+"\n"+"/lb setarena"+"\n"+"/lb emode on/off"+"\n"+"/lb oni Player"+"\n"+"/lb player Player"+"\n"+"/lb start");
			return true;
		}else{
			
			//コマンドの引数を調べる【elseを使うとごちゃごちゃするので使用していない】
			//各自の型の照合やargsの数等はチェックしていないので追加予定 2014/07/28
			
			//hunterのとき
			if(args[0].equals("hunter")){
		        Player target = getPlayer(args[1]);
		        if (target == null) {
		            sender.sendMessage(args[0] + " というプレイヤーは見つかりません。");
		            return true;
		        }
		        
		        //targetがすでに登録されていないか確認
		        int check = hunter.indexOf(target);
		        if(check == -1){
		        	hunter.add(target);
					Team team = teamYellow;
					team.addPlayer(target);
					String name = target.getPlayerListName();
					player.sendMessage(ChatColor.GREEN+name+"をハンターに追加しました。");
		        }else{
		        	//すでに登録されている場合
		        	player.sendMessage(ChatColor.RED+"このプレイヤーはすでに登録されています。");
		        }
		        
		        
			}
			//playerの時
			if(args[0].equals("player")){
				
			}
			//randomの時
			if(args[0].equals("random")){
				
			}
			//bookの時
			if(args[0].equals("book")){
				
			}
			//missionの時
			if(args[0].equals("mission")){
				
			}
			//setjailの時
			if(args[0].equals("setjail")){
				
			}
			//setrvの時
			if(args[0].equals("setrv")){
				
			}
			//startの時
			if(args[0].equals("start")){
				
			}
			//stopの時
			if(args[0].equals("stop")){
				
			}
			//restartの時
			if(args[0].equals("restart")){
				
			}
			//setarenaの時
			if(args[0].equals("setarena")){
				
			}
			//setboxの時
			if(args[0].equals("setbox")){
				
			}
			//boxの時
			if(args[0].equals("box")){
				
			}
			//rvの時
			if(args[0].equals("rv")){
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		return false;
	}

	
	    //オンラインのプレイヤーを取得するメソッド
		private Player getPlayer(String name) {
		    for ( Player player : Bukkit.getOnlinePlayers() ) {
		        if ( player.getName().equals(name) ) {
		            return player;
		        }
		    }
		    return null;
		}
}