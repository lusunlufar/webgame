package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.fight.msg.CGBattleBeginMessage;
import com.pwrd.war.gameserver.fight.msg.GCBattleActionMessage;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class FightMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_Battle_Begin_Message, CGBattleBeginMessage.class);
		map.put(MessageType.GC_Battle_Action_Message, GCBattleActionMessage.class);
		return map;
	}

}
