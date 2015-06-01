package haxe.rtti;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Meta extends haxe.lang.HxObject
{
	public Meta(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Meta()
	{
		//line 27 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		haxe.rtti.Meta.__hx_ctor_haxe_rtti_Meta(this);
	}
	
	
	public static void __hx_ctor_haxe_rtti_Meta(haxe.rtti.Meta __temp_me17)
	{
	}
	
	
	public static java.lang.Object getType(java.lang.Object t)
	{
		//line 33 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		java.lang.Object meta = haxe.rtti.Meta.getMeta(t);
		//line 34 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		if (( ( meta == null ) || ( haxe.lang.Runtime.getField(meta, "obj", true) == null ) )) 
		{
			//line 34 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		}
		else
		{
			//line 34 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			return haxe.lang.Runtime.getField(meta, "obj", true);
		}
		
	}
	
	
	public static java.lang.Object getMeta(java.lang.Object t)
	{
		//line 40 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		java.lang.Object ret = haxe.lang.Runtime.getField(t, "__meta__", false);
		//line 41 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		if (( ( ret == null ) && ( t instanceof java.lang.Class ) )) 
		{
			//line 44 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			java.lang.Class __temp_stmt1 = null;
			//line 44 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			{
				//line 44 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
				java.lang.Class cl = ((java.lang.Class) (t) );
				//line 44 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
				__temp_stmt1 = cl;
			}
			
			//line 44 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			boolean interf = __temp_stmt1.isInterface();
			//line 48 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			if (interf) 
			{
				//line 50 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
				java.lang.String name = haxe.root.Type.getClassName(((java.lang.Class) (t) ));
				//line 51 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
				java.lang.Class cls = haxe.root.Type.resolveClass(( name + "_HxMeta" ));
				//line 52 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
				if (( ((java.lang.Object) (cls) ) != ((java.lang.Object) (null) ) )) 
				{
					//line 53 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
					return haxe.lang.Runtime.getField(cls, "__meta__", false);
				}
				
			}
			
		}
		
		//line 56 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		return ret;
	}
	
	
	public static java.lang.Object getFields(java.lang.Object t)
	{
		//line 74 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		java.lang.Object meta = haxe.rtti.Meta.getMeta(t);
		//line 75 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		if (( ( meta == null ) || ( haxe.lang.Runtime.getField(meta, "fields", true) == null ) )) 
		{
			//line 75 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		}
		else
		{
			//line 75 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
			return haxe.lang.Runtime.getField(meta, "fields", true);
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 27 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		return new haxe.rtti.Meta(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 27 "/usr/lib/haxe/std/haxe/rtti/Meta.hx"
		return new haxe.rtti.Meta();
	}
	
	
}


