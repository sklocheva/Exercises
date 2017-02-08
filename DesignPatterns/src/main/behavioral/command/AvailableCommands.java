package main.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import main.behavioral.command.commands.CreateOrderCommand;
import main.behavioral.command.commands.ShipOrderCommand;
import main.behavioral.command.commands.UpdateOrderCommand;

public final class AvailableCommands {

	public static final String response = "Executing command %s with arguments: %s.";
//	static List<Command> list;
	
	@SuppressWarnings("serial")
	public static final List<Command> getAvailableCommands(){
		return new ArrayList<Command>(){{
			add(new CreateOrderCommand());
			add(new ShipOrderCommand());
			add(new UpdateOrderCommand());
		}};
//		return list;
	}
	
//	static{
//		list = new ArrayList<Command>();
//		list.add(new CreateOrderCommand());
//		list.add(new ShipOrderCommand());
//		list.add(new UpdateOrderCommand());
//	}
}
