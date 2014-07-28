package himamajin.niconico.thgame;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	//プラグインが読み込まれた時
	public void onEnable() {
		
		//'toso'というコマンドが打たれた時Commandを呼び出す
        getCommand("test").setExecutor(new Command());

		//Listenerを実装しているクラスを登録する
		getServer().getPluginManager().registerEvents(new EventListener(), this);
		
		//ArrayListを作成する
		ArrayList <Player> hunter = new ArrayList <Player> ();

	}
	//プラグインが再起動、終了するとき
	public void onDisable(){
		
	}
}
