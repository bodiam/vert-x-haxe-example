package haxe.web;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DispatchError extends haxe.lang.ParamEnum
{
	public DispatchError(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"DENotFound", "DEInvalidValue", "DEMissing", "DEMissingParam", "DETooManyValues"};
	
	public static haxe.web.DispatchError DENotFound(java.lang.String part)
	{
		//line 57 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchError(0, new java.lang.Object[]{part});
	}
	
	
	public static final haxe.web.DispatchError DEInvalidValue = new haxe.web.DispatchError(1, null);
	
	public static final haxe.web.DispatchError DEMissing = new haxe.web.DispatchError(2, null);
	
	public static haxe.web.DispatchError DEMissingParam(java.lang.String p)
	{
		//line 60 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchError(3, new java.lang.Object[]{p});
	}
	
	
	public static final haxe.web.DispatchError DETooManyValues = new haxe.web.DispatchError(4, null);
	
	@Override public java.lang.String getTag()
	{
		//line 56 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return haxe.web.DispatchError.__hx_constructs[this.index];
	}
	
	
}


