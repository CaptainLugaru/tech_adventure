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

import net.mcreator.techadventure.entity.WizardEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WizardRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WizardEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwizard(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("tech_adventure:textures/wizard.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("tech_adventure:textures/wizard.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwizard extends EntityModel<Entity> {
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer head;
		private final ModelRenderer body;
		public Modelwizard() {
			textureWidth = 128;
			textureHeight = 128;
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
			right_leg.setTextureOffset(80, 0).addBox(2.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
			left_leg.setTextureOffset(49, 0).addBox(-4.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.0F, 7.5F, 0.0F);
			left_arm.setTextureOffset(0, 19).addBox(0.0F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 64).addBox(1.0F, 7.0F, -1.0F, 1.0F, 1.0F, -13.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
			right_arm.setTextureOffset(0, 0).addBox(-7.0F, -17.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, -1.0F);
			setRotationAngle(head, 0.0436F, 0.0F, 0.0F);
			head.setTextureOffset(106, 11).addBox(-3.0F, -4.0F, -1.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(93, 35).addBox(-4.5F, -5.0F, -3.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(102, 61).addBox(-3.5F, -6.0F, -2.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(110, 90).addBox(-2.5F, -7.0F, -1.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(118, 113).addBox(-1.5F, -8.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(122, 126).addBox(-1.0F, -9.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 23.0F, 0.0F);
			body.setTextureOffset(38, 19).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(33, 115).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(42, 68).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(14, 0).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
