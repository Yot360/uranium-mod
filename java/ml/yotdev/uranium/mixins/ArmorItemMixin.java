package ml.yotdev.uranium.mixins;


import ml.yotdev.uranium.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(PlayerEntity.class)
public abstract class ArmorItemMixin extends LivingEntity{

    @Shadow @Final private PlayerInventory inventory;

    protected ArmorItemMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void tick(CallbackInfo info) {
        ItemStack itemStackHead = this.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack itemStackChest = this.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack itemStackLegs = this.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack itemStackFeet = this.getEquippedStack(EquipmentSlot.FEET);

        int lvlCounter = 0;
        if (itemStackHead.getItem() == ModItems.URANIUM_HELMET) {
            lvlCounter++;
        }
        if (itemStackChest.getItem() == ModItems.URANIUM_CHESTPLATE){
            lvlCounter++;
        }
        if (itemStackLegs.getItem() == ModItems.URANIUM_LEGGINGS){
            lvlCounter++;
        }
        if (itemStackFeet.getItem() == ModItems.URANIUM_BOOTS){
            lvlCounter++;
        }

        //check slowness level...

        if (lvlCounter==1){
            addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 0));
        }
        if (lvlCounter==2){
            addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 0));
            addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10, 0));
        }
        if (lvlCounter==3){
            addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 1));
            addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 10, 0));
            addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10, 0));
        }
        if (lvlCounter==4){
            addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 2));
            addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 10, 1));
            addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10, 1));
            addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10, 1));
            addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 10, 0));
        }
    }
}