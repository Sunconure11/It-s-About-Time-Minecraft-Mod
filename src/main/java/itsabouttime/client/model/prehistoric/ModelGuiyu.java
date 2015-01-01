// Date: 9/27/2014 8:55:15 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package itsabouttime.client.model.prehistoric;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGuiyu extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer BackSpike;
    ModelRenderer Tail;
    ModelRenderer LeftFin;
    ModelRenderer RightFin;
    ModelRenderer UpperTailFin;
    ModelRenderer UpperRudderFin;
    ModelRenderer LowerRudderFin;
    ModelRenderer LowerTailFin;
    ModelRenderer LeftSmallFin;
    ModelRenderer RightSmallFin;
  
  public ModelGuiyu()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 38, 8);
      Body.addBox(-2F, -1F, -4F, 4, 4, 9);
      Body.setRotationPoint(0F, 20F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 44, 1);
      Head.addBox(-1.5F, -1.3F, -3.5F, 3, 3, 4);
      Head.setRotationPoint(0F, 21F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      BackSpike = new ModelRenderer(this, 2, 13);
      BackSpike.addBox(-0.5F, 0F, 0F, 1, 1, 2);
      BackSpike.setRotationPoint(0F, 19F, 0F);
      BackSpike.setTextureSize(64, 32);
      BackSpike.mirror = true;
      setRotation(BackSpike, 0.5576792F, 0F, 0F);
      Tail = new ModelRenderer(this, 41, 21);
      Tail.addBox(-1F, -1F, 0F, 2, 3, 8);
      Tail.setRotationPoint(0F, 20F, 5F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      LeftFin = new ModelRenderer(this, 0, 23);
      LeftFin.addBox(0F, 0F, 0F, 3, 1, 2);
      LeftFin.setRotationPoint(2F, 22F, -2F);
      LeftFin.setTextureSize(64, 32);
      LeftFin.mirror = true;
      setRotation(LeftFin, 0.2974289F, -0.7063936F, 0.4089647F);
      RightFin = new ModelRenderer(this, 0, 20);
      RightFin.addBox(-3F, 0F, 0F, 3, 1, 2);
      RightFin.setRotationPoint(-2F, 22F, -2F);
      RightFin.setTextureSize(64, 32);
      RightFin.mirror = true;
      setRotation(RightFin, 0.2974289F, 0.7063936F, -0.4089647F);
      UpperTailFin = new ModelRenderer(this, 0, 7);
      UpperTailFin.addBox(-0.5F, -1F, 0F, 1, 2, 3);
      UpperTailFin.setRotationPoint(0F, 20F, 7F);
      UpperTailFin.setTextureSize(64, 32);
      UpperTailFin.mirror = true;
      setRotation(UpperTailFin, 0.5205006F, 0F, 0F);
      UpperRudderFin = new ModelRenderer(this, 17, 0);
      UpperRudderFin.addBox(-0.5F, -3F, -1F, 1, 3, 2);
      UpperRudderFin.setRotationPoint(0F, 20F, 12F);
      UpperRudderFin.setTextureSize(64, 32);
      UpperRudderFin.mirror = true;
      setRotation(UpperRudderFin, -0.7807508F, 0F, 0F);
      LowerRudderFin = new ModelRenderer(this, 17, 5);
      LowerRudderFin.addBox(-0.5F, 0F, -1F, 1, 3, 2);
      LowerRudderFin.setRotationPoint(0F, 20F, 12F);
      LowerRudderFin.setTextureSize(64, 32);
      LowerRudderFin.mirror = true;
      setRotation(LowerRudderFin, 0.4461433F, 0F, 0F);
      LowerTailFin = new ModelRenderer(this, 8, 8);
      LowerTailFin.addBox(-0.5F, 0F, 0F, 1, 2, 2);
      LowerTailFin.setRotationPoint(0F, 22F, 7F);
      LowerTailFin.setTextureSize(64, 32);
      LowerTailFin.mirror = true;
      setRotation(LowerTailFin, 0.8922867F, 0F, 0F);
      LeftSmallFin = new ModelRenderer(this, 0, 16);
      LeftSmallFin.addBox(0F, -1F, -1F, 1, 3, 1);
      LeftSmallFin.setRotationPoint(0F, 22F, 6F);
      LeftSmallFin.setTextureSize(64, 32);
      LeftSmallFin.mirror = true;
      setRotation(LeftSmallFin, 0.7063936F, 0F, -0.3717861F);
      RightSmallFin = new ModelRenderer(this, 6, 16);
      RightSmallFin.addBox(-1F, -1F, -1F, 1, 3, 1);
      RightSmallFin.setRotationPoint(0F, 22F, 6F);
      RightSmallFin.setTextureSize(64, 32);
      RightSmallFin.mirror = true;
      setRotation(RightSmallFin, 0.7063936F, 0F, 0.3717861F);
      
      convertToChild(Tail, UpperRudderFin);
      convertToChild(Tail, LowerRudderFin);
      convertToChild(Tail, UpperTailFin);
      convertToChild(Tail, LowerTailFin);
      convertToChild(Tail, RightSmallFin);
      convertToChild(Tail, LeftSmallFin);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GL11.glTranslatef(0F, 0F, -0.3F);
    Body.render(f5);
    Head.render(f5);
    BackSpike.render(f5);
    Tail.render(f5);
    LeftFin.render(f5);
    RightFin.render(f5);
    
  }
  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
     // move child rotation point to be relative to parent
     parChild.rotationPointX -= parParent.rotationPointX;
     parChild.rotationPointY -= parParent.rotationPointY;
     parChild.rotationPointZ -= parParent.rotationPointZ;
     // make rotations relative to parent
     parChild.rotateAngleX -= parParent.rotateAngleX;
     parChild.rotateAngleY -= parParent.rotateAngleY;
     parChild.rotateAngleZ -= parParent.rotateAngleZ;
     // create relationship
     parParent.addChild(parChild);
  } 
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  this.Tail.rotateAngleY = 0.2F * MathHelper.sin(f2 * (float)0.15F + f1);

  }

}