package clashsoft.playerinventoryapi.lib;

import clashsoft.cslib.minecraft.update.CSUpdate;

public class PIConstants
{
	public static final String	MOD_ID					= "PlayerInventoryAPI";
	public static final String	MOD_NAME				= "Player Inventory API";
	public static final int		REVISION				= 0;
	public static final String	VERSION					= CSUpdate.CURRENT_VERSION + "-" + REVISION;
	public static final String	COMMON_PROXY_LOCATION	= "com.chaosdev.playerinventoryapi.common.CommonProxy";
	public static final String	CLIENT_PROXY_LOCATION	= "com.chaosdev.playerinventoryapi.client.ClientProxy";
	public static final String	CHANNEL_NAME			= "PIAPI";
}