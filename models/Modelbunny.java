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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}