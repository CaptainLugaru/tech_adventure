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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}