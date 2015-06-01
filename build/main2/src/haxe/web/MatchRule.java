package haxe.web;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MatchRule extends haxe.lang.ParamEnum
{
	public MatchRule(int index, java.lang.Object[] params)
	{
		//line 100 "/usr/lib/haxe/std/java/internal/HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"MRInt", "MRBool", "MRFloat", "MRString", "MRDate", "MREnum", "MRDispatch", "MRSpod", "MROpt"};
	
	public static final haxe.web.MatchRule MRInt = new haxe.web.MatchRule(0, null);
	
	public static final haxe.web.MatchRule MRBool = new haxe.web.MatchRule(1, null);
	
	public static final haxe.web.MatchRule MRFloat = new haxe.web.MatchRule(2, null);
	
	public static final haxe.web.MatchRule MRString = new haxe.web.MatchRule(3, null);
	
	public static final haxe.web.MatchRule MRDate = new haxe.web.MatchRule(4, null);
	
	public static haxe.web.MatchRule MREnum(java.lang.String e)
	{
		//line 43 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.MatchRule(5, new java.lang.Object[]{e});
	}
	
	
	public static final haxe.web.MatchRule MRDispatch = new haxe.web.MatchRule(6, null);
	
	public static haxe.web.MatchRule MRSpod(java.lang.String c, boolean lock)
	{
		//line 45 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.MatchRule(7, new java.lang.Object[]{c, lock});
	}
	
	
	public static haxe.web.MatchRule MROpt(haxe.web.MatchRule r)
	{
		//line 46 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.MatchRule(8, new java.lang.Object[]{r});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 37 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return haxe.web.MatchRule.__hx_constructs[this.index];
	}
	
	
}


