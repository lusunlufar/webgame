package com.pwrd.war.gameserver.item.operation.impl;

import com.pwrd.war.gameserver.common.i18n.constants.CommonLangConstants_10000;
import com.pwrd.war.gameserver.human.Human;
import com.pwrd.war.gameserver.item.Item;
import com.pwrd.war.gameserver.item.ItemDef;
import com.pwrd.war.gameserver.item.ItemUseInfo;
import com.pwrd.war.gameserver.item.operation.AbstractUseItemOperation;
import com.pwrd.war.gameserver.item.template.ConsumeItemTemplate;
import com.pwrd.war.gameserver.role.Role;

public class AddHp extends AbstractUseItemOperation {

	@Override
	protected boolean canUseImpl(Human user, Item item, Role target) {
		// 检查一般条件
		if (!checkCommonConditions(user, item)) {
			return false;
		}

		return true;
	}

	@Override
	public ItemUseInfo collectItemUseInfo(Item item) {
		return collectItemAndTemplate(item);
	}

	@Override
	public boolean isSuitable(Human user, Item item, Role target) {
		return hasConsumableFunc(item, ItemDef.ConsumableFunc.ADD_HP); 
	}

	@Override
	protected boolean useImpl(Human user, ItemUseInfo itemInfo, Role target) {	
		if(target == null){
			user.sendErrorMessage(CommonLangConstants_10000.OBJECT_NOT_EXIST);
			return false;
		}
		int hp = Integer.valueOf(((ConsumeItemTemplate)itemInfo.getTemplate()).getParam1());
		target.addHP(hp);
		target.snapChangedProperty(true);
		this.consume(user, itemInfo.getItemToUse(), target);
		return true;
	}

	@Override
	public boolean consume(Human user, Item item, Role target) {
		return consumeOne(user, item);
	}
	
	@Override
	public Role getTarget(Human user, String targetUUID, Role target) {
		return target;
	}


}
