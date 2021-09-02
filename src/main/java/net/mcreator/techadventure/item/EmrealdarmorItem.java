
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.techadventure.itemgroup.EmaraldtabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class EmrealdarmorItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:emrealdarmor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("tech_adventure:emrealdarmor_chestplate")
	public static final Item body = null;
	@ObjectHolder("tech_adventure:emrealdarmor_leggings")
	public static final Item legs = null;
	@ObjectHolder("tech_adventure:emrealdarmor_boots")
	public static final Item boots = null;
	public EmrealdarmorItem(TechAdventureModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 7, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 12;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.EMERALD));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "emrealdarmor";
			}

			@Override
			public float getToughness() {
				return 1.8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(EmaraldtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tech_adventure:textures/models/armor/emrald_armor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emrealdarmor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(EmaraldtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tech_adventure:textures/models/armor/emrald_armor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emrealdarmor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(EmaraldtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tech_adventure:textures/models/armor/emrald_armor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emrealdarmor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(EmaraldtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tech_adventure:textures/models/armor/emrald_armor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("emrealdarmor_boots"));
	}
}
