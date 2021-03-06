package com.tgame.advfluxtools.libs.inventory.item;

import net.minecraftforge.common.ForgeDirection;

/**
 * Implement this interface on TileEntities which should connect to item transportation blocks.
 * 
 * Note that {@link IInventoryHandler} is an extension of this.
 * 
 * @author King Lemming
 * 
 */
public interface IInventoryConnection {

	/**
	 * Returns TRUE if the TileEntity can connect on a given side.
	 */
	boolean canConnectInventory(ForgeDirection from);

}
