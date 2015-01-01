// Date: 11/15/2014 2:37:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package itsabouttime.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTimeTravelerArmor extends ModelBiped
{
  //fields

    ModelRenderer Pants;
  
  public ModelTimeTravelerArmor(float f)
  {
	  super(f,0,64,64);

	    textureWidth = 64;;
    textureHeight = 64;
    
     
      Pants = new ModelRenderer(this, 16, 33);
      Pants.addBox(-5F, 0F, -2.3F, 10, 10, 5);
      Pants.setRotationPoint(0F, 12F, 0F);
      Pants.setTextureSize(64, 64);
      Pants.mirror = true;
      setRotation(Pants, 0F, 0F, 0F);
      
      this.bipedBody.addChild(Pants);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	  super.render(entity, f, f1, f2, f3, f4, f5); setRotationAngles(f, f1, f2, f3, f4, f5, entity);

	  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
  {
	  super.setLivingAnimations(p_78086_1_, p_78086_2_, p_78086_3_, p_78086_4_);
	  
	  float f15 = ((float)Math.PI / 2F);
	  f15 = -1.3089F + p_78086_3_ * 3F;

      if (f15 < -0.5F)
      {
          f15 = 0.0F;
      }

	    this.Pants.rotateAngleX = f15;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  

}
    
  

}
