package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.dayTask.msg.CGDayTaskInfo;
import com.pwrd.war.gameserver.dayTask.msg.GCDayTaskInfo;
import com.pwrd.war.gameserver.dayTask.msg.CGGetNewTask;
import com.pwrd.war.gameserver.dayTask.msg.GCGetNewTask;
import com.pwrd.war.gameserver.dayTask.msg.CGDayTaskDrop;
import com.pwrd.war.gameserver.dayTask.msg.GCDayTaskDrop;
import com.pwrd.war.gameserver.dayTask.msg.GCDayTaskComplete;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class DaytaskMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_DAY_TASK_INFO, CGDayTaskInfo.class);
		map.put(MessageType.GC_DAY_TASK_INFO, GCDayTaskInfo.class);
		map.put(MessageType.CG_GET_NEW_TASK, CGGetNewTask.class);
		map.put(MessageType.GC_GET_NEW_TASK, GCGetNewTask.class);
		map.put(MessageType.CG_DAY_TASK_DROP, CGDayTaskDrop.class);
		map.put(MessageType.GC_DAY_TASK_DROP, GCDayTaskDrop.class);
		map.put(MessageType.GC_DAY_TASK_COMPLETE, GCDayTaskComplete.class);
		return map;
	}

}
