package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Router extends haxe.lang.HxObject
{
	static
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			java.lang.Object __temp_odecl1 = new haxe.lang.DynamicObject(new java.lang.String[]{"dispatchConfig"}, new java.lang.Object[]{new haxe.root.Array(new java.lang.Object[]{"oy5:hellojy21:haxe.web.DispatchRule:0:1jy18:haxe.web.MatchRule:3:0g"})}, new java.lang.String[]{}, new double[]{});
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			haxe.root.Router.__meta__ = new haxe.lang.DynamicObject(new java.lang.String[]{"obj"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{}, new double[]{});
		}
		
	}
	
	public Router(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Router()
	{
		//line 14 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		haxe.root.Router.__hx_ctor__Router(this);
	}
	
	
	public static void __hx_ctor__Router(haxe.root.Router __temp_me5)
	{
		//line 12 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		__temp_me5.output = "";
	}
	
	
	public static java.lang.Object __meta__;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		return new haxe.root.Router(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		return new haxe.root.Router();
	}
	
	
	public java.lang.String output;
	
	public void doHello(java.lang.String name)
	{
		//line 17 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		this.output = ( "hello " + name );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			switch (field.hashCode())
			{
				case -1005512447:
				{
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					if (field.equals("output")) 
					{
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						__temp_executeDef1 = false;
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						this.output = haxe.lang.Runtime.toString(value);
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						return value;
					}
					
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					break;
				}
				
				
			}
			
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			switch (field.hashCode())
			{
				case 1803500295:
				{
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					if (field.equals("doHello")) 
					{
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						__temp_executeDef1 = false;
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "doHello")) );
					}
					
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					break;
				}
				
				
				case -1005512447:
				{
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					if (field.equals("output")) 
					{
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						__temp_executeDef1 = false;
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						return this.output;
					}
					
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					break;
				}
				
				
			}
			
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			switch (field.hashCode())
			{
				case 1803500295:
				{
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					if (field.equals("doHello")) 
					{
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						__temp_executeDef1 = false;
						//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
						this.doHello(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
					break;
				}
				
				
			}
			
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		baseArr.push("output");
		//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 10 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


