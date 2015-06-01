package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HxObject implements haxe.lang.IHxObject
{
	public HxObject(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public HxObject()
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		haxe.lang.HxObject.__hx_ctor_haxe_lang_HxObject(this);
	}
	
	
	public static void __hx_ctor_haxe_lang_HxObject(haxe.lang.HxObject __temp_me24)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		return new haxe.lang.HxObject(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		return new haxe.lang.HxObject();
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		if (isCheck) 
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			if (throwErrors) 
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			else
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		if (throwErrors) 
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		else
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return this.__hx_lookupSetField(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		{
			//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
			{
				//line 30 "/usr/lib/haxe/std/java/internal/HxObject.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
	}
	
	
}


