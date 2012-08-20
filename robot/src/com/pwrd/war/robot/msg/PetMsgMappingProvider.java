package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.pet.msg.GCPetList;
import com.pwrd.war.gameserver.pet.msg.GCPetAdd;
import com.pwrd.war.gameserver.pet.msg.GCPetDel;
import com.pwrd.war.gameserver.pet.msg.GCPetInfo;
import com.pwrd.war.gameserver.pet.msg.CGPetHireList;
import com.pwrd.war.gameserver.pet.msg.GCPetHireList;
import com.pwrd.war.gameserver.pet.msg.CGPetHire;
import com.pwrd.war.gameserver.pet.msg.CGPetFire;
import com.pwrd.war.gameserver.pet.msg.CGPetJingjiu;
import com.pwrd.war.gameserver.pet.msg.GCPetJingjiu;
import com.pwrd.war.gameserver.pet.msg.GCPetJingjiuList;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class PetMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.GC_PET_LIST, GCPetList.class);
		map.put(MessageType.GC_PET_ADD, GCPetAdd.class);
		map.put(MessageType.GC_PET_DEL, GCPetDel.class);
		map.put(MessageType.GC_PET_INFO, GCPetInfo.class);
		map.put(MessageType.CG_PET_HIRE_LIST, CGPetHireList.class);
		map.put(MessageType.GC_PET_HIRE_LIST, GCPetHireList.class);
		map.put(MessageType.CG_PET_HIRE, CGPetHire.class);
		map.put(MessageType.CG_PET_FIRE, CGPetFire.class);
		map.put(MessageType.CG_PET_JINGJIU, CGPetJingjiu.class);
		map.put(MessageType.GC_PET_JINGJIU, GCPetJingjiu.class);
		map.put(MessageType.GC_PET_JINGJIU_LIST, GCPetJingjiuList.class);
		return map;
	}

}
