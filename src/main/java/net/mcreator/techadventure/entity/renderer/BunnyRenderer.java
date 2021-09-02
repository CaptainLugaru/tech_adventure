package net.mcreator.techadventure.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.techadventure.entity.BunnyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BunnyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BunnyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbunny(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("tech_adventure:textures/bunny.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("tech_adventure:textures/bunny.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbunny extends EntityModel<Entity> {
		private final ModelRenderer back_left_leg;
		private final ModelRenderer back_right_leg;
		private final ModelRenderer front_left_leg;
		private final ModelRenderer front_right_leg;
		private final ModelRenderer tail;
		private final ModelRenderer head;
		private final ModelRenderer left_ear_r1;
		private final ModelRenderer body;
		private final ModelRenderer neck_r1;
		public Modelbunny() {
			textureWidth = 64;
			textureHeight = 64;
			back_left_leg = new ModelRenderer(this);
			back_left_leg.setRotationPoint(0.0F, 18.0F, 5.0F);
			back_left_leg.setTextureOffset(31, 36).addBox(1.0F, 5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			back_right_leg = new ModelRenderer(this);
			back_right_leg.setRotationPoint(0.0F, 18.0F, 5.0F);
			back_right_leg.setTextureOffset(30, 23).addBox(-2.0F, 5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_left_leg = new ModelRenderer(this);
			front_left_leg.setRotationPoint(0.0F, 18.0F, 5.0F);
			front_left_leg.setTextureOffset(31, 61).addBox(1.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_right_leg = new ModelRenderer(this);
			front_right_leg.setRotationPoint(0.0F, 18.0F, 5.0F);
			front_right_leg.setTextureOffset(30, 50).addBox(-2.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 18.0F, 5.0F);
			tail.setTextureOffset(23, 1).addBox(-0.5F, 3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.setTextureOffset(54, 0).addBox(-1.5F, -4.0F, -4.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(60, 18).addBox(-0.5F, -3.5F, -5.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_ear_r1 = new ModelRenderer(this);
			left_ear_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(left_ear_r1);
			setRotationAngle(left_ear_r1, -0.0873F, 0.0F, 0.0F);
			left_ear_r1.setTextureOffset(12, 13).addBox(0.5F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_ear_r1.setTextureOffset(60, 35).addBox(-1.5F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 57).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			neck_r1 = new ModelRenderer(this);
			neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(neck_r1);
			setRotationAngle(neck_r1, -0.1309F, 0.0F, 0.0F);
			neck_r1.setTextureOffset(0, 0).addBox(-0.5F, -3.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
