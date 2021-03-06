package com.tgame.advfluxtools;

import com.tgame.advfluxtools.entities.EntityLaserProjectile;
import com.tgame.advfluxtools.entities.RenderLaserProjectile;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * @author tgame14
 * @since 30/04/14
 */
public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		super.registerRenderers();
		RenderingRegistry.registerEntityRenderingHandler(EntityLaserProjectile.class, new RenderLaserProjectile());
	}

	@Override
	public void init()
	{
		super.init();
	}

	@Override
	public void registerTickHandlers()
	{
		super.registerTickHandlers();
		//TickRegistry.registerTickHandler(new MultiblockClientTickHandler(), Side.CLIENT);
	}
}
