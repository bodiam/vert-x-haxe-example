package haxe.web;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DispatchRule extends haxe.lang.ParamEnum
{
	public DispatchRule(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"DRMatch", "DRMult", "DRArgs", "DRMeta"};
	
	public static haxe.web.DispatchRule DRMatch(haxe.web.MatchRule r)
	{
		//line 50 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchRule(0, new java.lang.Object[]{r});
	}
	
	
	public static haxe.web.DispatchRule DRMult(haxe.root.Array<haxe.web.MatchRule> r)
	{
		//line 51 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchRule(1, new java.lang.Object[]{r});
	}
	
	
	public static haxe.web.DispatchRule DRArgs(haxe.web.DispatchRule r, haxe.root.Array<java.lang.Object> args, boolean opt)
	{
		//line 52 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchRule(2, new java.lang.Object[]{r, args, opt});
	}
	
	
	public static haxe.web.DispatchRule DRMeta(haxe.web.DispatchRule r)
	{
		//line 53 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.DispatchRule(3, new java.lang.Object[]{r});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 49 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return haxe.web.DispatchRule.__hx_constructs[this.index];
	}
	
	
}


