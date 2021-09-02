// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Front_left;
	private final ModelRenderer Head;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer shell;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer Front_right;
	private final ModelRenderer Back_right;
	private final ModelRenderer Back_left;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Front_left = new ModelRenderer(this);
		Front_left.setRotationPoint(-2.5F, 21.5F, -2.5F);
		Front_left.setTextureOffset(56, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.5F, 19.5F, -6.0F);
		Head.setTextureOffset(52, 58).addBox(-1.5F, -2.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.5F, 19.5F, 5.5F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(-0.5F, 3.5F, -5.5F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, -0.1745F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.5F, 19.375F, -0.75F);
		shell.setTextureOffset(0, 51).addBox(-3.5F, -4.375F, -3.25F, 7.0F, 4.0F, 9.0F, 0.0F, false);
		shell.setTextureOffset(24, 0).addBox(-4.5F, -0.375F, -4.25F, 9.0F, 1.0F, 11.0F, 0.0F, false);
		shell.setTextureOffset(0, 0).addBox(-3.5F, 0.625F, -3.25F, 7.0F, 1.0F, 9.0F, 0.0F, false);
		shell.setTextureOffset(0, 0).addBox(-1.0F, 0.625F, -4.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.5F, 19.5F, -5.5F);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.1745F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		Front_right = new ModelRenderer(this);
		Front_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		Front_right.setTextureOffset(1, 20).addBox(2.5F, -3.5F, -3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Back_right = new ModelRenderer(this);
		Back_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		Back_right.setTextureOffset(56, 34).addBox(2.5F, -3.5F, 2.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Back_left = new ModelRenderer(this);
		Back_left.setRotationPoint(0.0F, 24.0F, 0.0F);
		Back_left.setTextureOffset(0, 38).addBox(-3.5F, -3.5F, 2.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Front_left.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		shell.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Front_right.render(matrixStack, buffer, packedLight, packedOverlay);
		Back_right.render(matrixStack, buffer, packedLight, packedOverlay);
		Back_left.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Front_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Back_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}