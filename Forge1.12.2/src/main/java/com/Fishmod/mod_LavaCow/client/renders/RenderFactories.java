package com.Fishmod.mod_LavaCow.client.renders;

import com.Fishmod.mod_LavaCow.client.renders.entity.RenderAcidJet;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderAvaton;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderBanshee;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderBoneWorm;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderFoglet;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderGhostBomb;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderGhostRay;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderHolyGrenade;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderLavaCow;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderLilSludge;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderMimic;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderParasite;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderPingu;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderPiranhaLauncher;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderPtera;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderRaven;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderSalamander;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderScarecrow;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderSkeletonKing;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderSludgeJet;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderSludgeLord;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderSonicBomb;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderUnburied;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderUndeadSwine;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderUndertaker;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderVespa;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderVespaCocoon;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderWendigo;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderWeta;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderZombieFrozen;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderZombieMushroom;
import com.Fishmod.mod_LavaCow.client.renders.entity.RenderZombiePiranha;
import com.Fishmod.mod_LavaCow.client.renders.item.RenderVespaShield;
import com.Fishmod.mod_LavaCow.entities.EntityAvaton;
import com.Fishmod.mod_LavaCow.entities.EntityBanshee;
import com.Fishmod.mod_LavaCow.entities.EntityBoneWorm;
import com.Fishmod.mod_LavaCow.entities.EntityFoglet;
import com.Fishmod.mod_LavaCow.entities.EntityLavaCow;
import com.Fishmod.mod_LavaCow.entities.EntityParasite;
import com.Fishmod.mod_LavaCow.entities.EntityPingu;
import com.Fishmod.mod_LavaCow.entities.EntitySkeletonKing;
import com.Fishmod.mod_LavaCow.entities.EntitySludgeLord;
import com.Fishmod.mod_LavaCow.entities.EntityUndeadSwine;
import com.Fishmod.mod_LavaCow.entities.EntityUnderminer;
import com.Fishmod.mod_LavaCow.entities.EntityUndertaker;
import com.Fishmod.mod_LavaCow.entities.EntityVespaCocoon;
import com.Fishmod.mod_LavaCow.entities.EntityWendigo;
import com.Fishmod.mod_LavaCow.entities.EntityZombieFrozen;
import com.Fishmod.mod_LavaCow.entities.EntityZombieMushroom;
import com.Fishmod.mod_LavaCow.entities.aquatic.EntityPiranha;
import com.Fishmod.mod_LavaCow.entities.aquatic.EntityZombiePiranha;
import com.Fishmod.mod_LavaCow.entities.flying.EntityGhostRay;
import com.Fishmod.mod_LavaCow.entities.flying.EntityPtera;
import com.Fishmod.mod_LavaCow.entities.flying.EntityVespa;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntityAcidJet;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntityGhostBomb;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntityHolyGrenade;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntityPiranhaLauncher;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntitySludgeJet;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntitySonicBomb;
import com.Fishmod.mod_LavaCow.entities.projectiles.EntityWarSmallFireball;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityLilSludge;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityMimic;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityRaven;
import com.Fishmod.mod_LavaCow.entities.tameable.EntitySalamander;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityScarecrow;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityUnburied;
import com.Fishmod.mod_LavaCow.entities.tameable.EntityWeta;
import com.Fishmod.mod_LavaCow.init.FishItems;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderFactories {
	
	public static void registerEntityRenderers()
    {
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaCow.class, RenderFactoryEntityLavaCow.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieMushroom.class, RenderFactoryEntityZombieMushroom.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityParasite.class, RenderFactoryEntityParasite.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityFoglet.class, RenderFactoryEntityFoglet.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieFrozen.class, RenderFactoryEntityZombieFrozen.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityUndeadSwine.class, RenderFactoryEntityUndeadSwine.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntitySalamander.class, RenderFactoryEntitySalamander.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityWendigo.class, RenderFactoryEntityWendigo.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityMimic.class, RenderFactoryEntityMimic.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntitySludgeLord.class, RenderFactoryEntitySludgeLord.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntitySludgeJet.class, RenderFactoryEntitySludgeJet.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityLilSludge.class, RenderFactoryEntityLilSludge.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityWarSmallFireball.class, RenderFactoryEntityWarSmallFireball.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityRaven.class, RenderFactoryEntityRaven.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityPtera.class, RenderFactoryEntityPtera.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityVespa.class, RenderFactoryEntityVespa.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityScarecrow.class, RenderFactoryEntityScarecrow.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityVespaCocoon.class, RenderFactoryEntityVespaCocoon.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityPiranha.class, RenderFactoryEntityPiranha.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombiePiranha.class, RenderFactoryEntityZombiePiranha.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityPiranhaLauncher.class, RenderFactoryEntityPiranhaLauncher.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityBoneWorm.class, RenderFactoryEntityBoneWorm.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityAcidJet.class, RenderFactoryEntityAcidJet.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityHolyGrenade.class, RenderFactoryEntityHolyGrenade.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityPingu.class, RenderFactoryEntityPingu.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityUndertaker.class, RenderFactoryEntityUndertaker.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityUnburied.class, RenderFactoryEntityUnburied.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityGhostRay.class, RenderFactoryEntityGhostRay.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityBanshee.class, RenderFactoryEntityBanshee.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityWeta.class, RenderFactoryEntityWeta.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityAvaton.class, RenderFactoryEntityAvaton.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityGhostBomb.class, RenderFactoryEntityGhostBomb.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntitySonicBomb.class, RenderFactoryEntitySonicBomb.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntityUnderminer.class, RenderFactoryEntityUnderminer.INSTANCE);
        RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonKing.class, RenderFactoryEntitySkeletonKing.INSTANCE);
        
        FishItems.VESPA_SHIELD.setTileEntityItemStackRenderer(new RenderVespaShield());
    }

    public static class RenderFactoryEntityLavaCow implements IRenderFactory<EntityLavaCow>
    {
        public final static RenderFactoryEntityLavaCow INSTANCE = new RenderFactoryEntityLavaCow();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityLavaCow> createRenderFor(RenderManager manager)
        {
        	return new RenderLavaCow(manager);
        }
    }
    
    public static class RenderFactoryEntityZombieMushroom implements IRenderFactory<EntityZombieMushroom>
    {
        public final static RenderFactoryEntityZombieMushroom INSTANCE = new RenderFactoryEntityZombieMushroom();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityZombieMushroom> createRenderFor(RenderManager manager)
        {
        	return new RenderZombieMushroom(manager);
        }
    }
    
    public static class RenderFactoryEntityParasite implements IRenderFactory<EntityParasite>
    {
        public final static RenderFactoryEntityParasite INSTANCE = new RenderFactoryEntityParasite();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityParasite> createRenderFor(RenderManager manager)
        {
        	return new RenderParasite(manager);
        }
    }
    
    public static class RenderFactoryEntityFoglet implements IRenderFactory<EntityFoglet>
    {
        public final static RenderFactoryEntityFoglet INSTANCE = new RenderFactoryEntityFoglet();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityFoglet> createRenderFor(RenderManager manager)
        {
        	return new RenderFoglet(manager);
        }
    }
    
    public static class RenderFactoryEntityZombieFrozen implements IRenderFactory<EntityZombieFrozen>
    {
        public final static RenderFactoryEntityZombieFrozen INSTANCE = new RenderFactoryEntityZombieFrozen();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityZombieFrozen> createRenderFor(RenderManager manager)
        {
        	return new RenderZombieFrozen(manager);
        }
    }
    
    public static class RenderFactoryEntityUndeadSwine implements IRenderFactory<EntityUndeadSwine>
    {
        public final static RenderFactoryEntityUndeadSwine INSTANCE = new RenderFactoryEntityUndeadSwine();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityUndeadSwine> createRenderFor(RenderManager manager)
        {
        	return new RenderUndeadSwine(manager);
        }
    }
    
    public static class RenderFactoryEntitySalamander implements IRenderFactory<EntitySalamander>
    {
        public final static RenderFactoryEntitySalamander INSTANCE = new RenderFactoryEntitySalamander();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntitySalamander> createRenderFor(RenderManager manager)
        {
        	return new RenderSalamander(manager);
        }
    }

    public static class RenderFactoryEntityWendigo implements IRenderFactory<EntityWendigo>
    {
        public final static RenderFactoryEntityWendigo INSTANCE = new RenderFactoryEntityWendigo();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityWendigo> createRenderFor(RenderManager manager)
        {
        	return new RenderWendigo(manager);
        }
    }
    
    public static class RenderFactoryEntityMimic implements IRenderFactory<EntityMimic>
    {
        public final static RenderFactoryEntityMimic INSTANCE = new RenderFactoryEntityMimic();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityMimic> createRenderFor(RenderManager manager)
        {
        	return new RenderMimic(manager);
        }
    }
    
    public static class RenderFactoryEntitySludgeLord implements IRenderFactory<EntitySludgeLord>
    {
        public final static RenderFactoryEntitySludgeLord INSTANCE = new RenderFactoryEntitySludgeLord();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntitySludgeLord> createRenderFor(RenderManager manager)
        {
        	return new RenderSludgeLord(manager);
        }
    }
    
    public static class RenderFactoryEntitySludgeJet implements IRenderFactory<EntityFireball>
    {
        public final static RenderFactoryEntitySludgeJet INSTANCE = new RenderFactoryEntitySludgeJet();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityFireball> createRenderFor(RenderManager manager)
        {
        	return new RenderSludgeJet(manager);
        }
    }
    
    public static class RenderFactoryEntityLilSludge implements IRenderFactory<EntityLilSludge>
    {
        public final static RenderFactoryEntityLilSludge INSTANCE = new RenderFactoryEntityLilSludge();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityLilSludge> createRenderFor(RenderManager manager)
        {
        	return new RenderLilSludge(manager);
        }
    }
    
    public static class RenderFactoryEntityWarSmallFireball implements IRenderFactory<EntityWarSmallFireball>
    {
        public final static RenderFactoryEntityWarSmallFireball INSTANCE = new RenderFactoryEntityWarSmallFireball();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public RenderFireball createRenderFor(RenderManager manager)
        {
        	return new RenderFireball(manager, 0.5F);
        }
    }
    
    public static class RenderFactoryEntityRaven implements IRenderFactory<EntityRaven>
    {
        public final static RenderFactoryEntityRaven INSTANCE = new RenderFactoryEntityRaven();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityRaven> createRenderFor(RenderManager manager)
        {
        	return new RenderRaven(manager);
        }
    }
    
    public static class RenderFactoryEntityPtera implements IRenderFactory<EntityPtera>
    {
        public final static RenderFactoryEntityPtera INSTANCE = new RenderFactoryEntityPtera();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityPtera> createRenderFor(RenderManager manager)
        {
        	return new RenderPtera(manager);
        }
    }
    
    public static class RenderFactoryEntityVespa implements IRenderFactory<EntityVespa>
    {
        public final static RenderFactoryEntityVespa INSTANCE = new RenderFactoryEntityVespa();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityVespa> createRenderFor(RenderManager manager)
        {
        	return new RenderVespa(manager);
        }
    }
    
    public static class RenderFactoryEntityScarecrow implements IRenderFactory<EntityScarecrow>
    {
        public final static RenderFactoryEntityScarecrow INSTANCE = new RenderFactoryEntityScarecrow();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityScarecrow> createRenderFor(RenderManager manager)
        {
        	return new RenderScarecrow(manager);
        }
    }
    
    public static class RenderFactoryEntityVespaCocoon implements IRenderFactory<EntityVespaCocoon>
    {
        public final static RenderFactoryEntityVespaCocoon INSTANCE = new RenderFactoryEntityVespaCocoon();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityVespaCocoon> createRenderFor(RenderManager manager)
        {
        	return new RenderVespaCocoon(manager);
        }
    }
    
    public static class RenderFactoryEntityPiranha implements IRenderFactory<EntityPiranha>
    {
        public final static RenderFactoryEntityPiranha INSTANCE = new RenderFactoryEntityPiranha();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityZombiePiranha> createRenderFor(RenderManager manager)
        {
        	return new RenderZombiePiranha(manager);
        }
    }
    
    public static class RenderFactoryEntityZombiePiranha implements IRenderFactory<EntityZombiePiranha>
    {
        public final static RenderFactoryEntityZombiePiranha INSTANCE = new RenderFactoryEntityZombiePiranha();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityZombiePiranha> createRenderFor(RenderManager manager)
        {
        	return new RenderZombiePiranha(manager);
        }
    }
    
    public static class RenderFactoryEntityPiranhaLauncher implements IRenderFactory<EntityPiranhaLauncher>
    {
        public final static RenderFactoryEntityPiranhaLauncher INSTANCE = new RenderFactoryEntityPiranhaLauncher();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityPiranhaLauncher> createRenderFor(RenderManager manager)
        {
        	return new RenderPiranhaLauncher(manager);
        }
    }
    
    public static class RenderFactoryEntityBoneWorm implements IRenderFactory<EntityBoneWorm>
    {
        public final static RenderFactoryEntityBoneWorm INSTANCE = new RenderFactoryEntityBoneWorm();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityBoneWorm> createRenderFor(RenderManager manager)
        {
        	return new RenderBoneWorm(manager);
        }
    }
    
    public static class RenderFactoryEntityAcidJet implements IRenderFactory<EntityAcidJet>
    {
        public final static RenderFactoryEntityAcidJet INSTANCE = new RenderFactoryEntityAcidJet();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityAcidJet> createRenderFor(RenderManager manager)
        {
        	return new RenderAcidJet(manager, FishItems.POISONSPORE);
        }
    }
    
    public static class RenderFactoryEntityHolyGrenade implements IRenderFactory<EntityHolyGrenade>
    {
        public final static RenderFactoryEntityHolyGrenade INSTANCE = new RenderFactoryEntityHolyGrenade();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityHolyGrenade> createRenderFor(RenderManager manager)
        {
        	return new RenderHolyGrenade(manager, FishItems.HOLY_GRENADE);
        }
    }
    
    public static class RenderFactoryEntityPingu implements IRenderFactory<EntityPingu>
    {
        public final static RenderFactoryEntityPingu INSTANCE = new RenderFactoryEntityPingu();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityPingu> createRenderFor(RenderManager manager)
        {
        	return new RenderPingu(manager);
        }
    }
    
    public static class RenderFactoryEntityUndertaker implements IRenderFactory<EntityUndertaker>
    {
        public final static RenderFactoryEntityUndertaker INSTANCE = new RenderFactoryEntityUndertaker();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityUndertaker> createRenderFor(RenderManager manager)
        {
        	return new RenderUndertaker(manager);
        }
    }
    
    public static class RenderFactoryEntityUnburied implements IRenderFactory<EntityUnburied>
    {
        public final static RenderFactoryEntityUnburied INSTANCE = new RenderFactoryEntityUnburied();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityUnburied> createRenderFor(RenderManager manager)
        {
        	return new RenderUnburied(manager);
        }
    }
    
    public static class RenderFactoryEntityGhostRay implements IRenderFactory<EntityGhostRay>
    {
        public final static RenderFactoryEntityGhostRay INSTANCE = new RenderFactoryEntityGhostRay();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityGhostRay> createRenderFor(RenderManager manager)
        {
        	return new RenderGhostRay(manager);
        }
    }
    
    public static class RenderFactoryEntityBanshee implements IRenderFactory<EntityBanshee>
    {
        public final static RenderFactoryEntityBanshee INSTANCE = new RenderFactoryEntityBanshee();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityBanshee> createRenderFor(RenderManager manager)
        {
        	return new RenderBanshee(manager);
        }
    }
    
    public static class RenderFactoryEntityWeta implements IRenderFactory<EntityWeta>
    {
        public final static RenderFactoryEntityWeta INSTANCE = new RenderFactoryEntityWeta();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityWeta> createRenderFor(RenderManager manager)
        {
        	return new RenderWeta(manager);
        }
    }
    
    public static class RenderFactoryEntityAvaton implements IRenderFactory<EntityAvaton>
    {
        public final static RenderFactoryEntityAvaton INSTANCE = new RenderFactoryEntityAvaton();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntityAvaton> createRenderFor(RenderManager manager)
        {
        	return new RenderAvaton(manager);
        }
    }
    
    public static class RenderFactoryEntityGhostBomb implements IRenderFactory<EntityGhostBomb>
    {
        public final static RenderFactoryEntityGhostBomb INSTANCE = new RenderFactoryEntityGhostBomb();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public RenderGhostBomb createRenderFor(RenderManager manager)
        {
        	return new RenderGhostBomb(manager, FishItems.GHOSTBOMB);
        }
    }
    
    public static class RenderFactoryEntitySonicBomb implements IRenderFactory<EntitySonicBomb>
    {
        public final static RenderFactoryEntitySonicBomb INSTANCE = new RenderFactoryEntitySonicBomb();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public Render<EntitySonicBomb> createRenderFor(RenderManager manager)
        {
        	return new RenderSonicBomb(manager, FishItems.SONICBOMB);
        }
    }
    
    public static class RenderFactoryEntityUnderminer implements IRenderFactory<EntityUnderminer>
    {
        public final static RenderFactoryEntityUnderminer INSTANCE = new RenderFactoryEntityUnderminer();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public RenderSkeleton createRenderFor(RenderManager manager)
        {
        	return new RenderSkeleton(manager);
        }
    }
    
    
    public static class RenderFactoryEntitySkeletonKing implements IRenderFactory<EntitySkeletonKing>
    {
        public final static RenderFactoryEntitySkeletonKing INSTANCE = new RenderFactoryEntitySkeletonKing();
    
        /* (non-Javadoc)
         * @see net.minecraftforge.fml.client.registry.IRenderFactory#createRenderFor(net.minecraft.client.renderer.entity.RenderManager)
         */
        @Override
        public RenderSkeletonKing createRenderFor(RenderManager manager)
        {
        	return new RenderSkeletonKing(manager);
        }
    }
}
