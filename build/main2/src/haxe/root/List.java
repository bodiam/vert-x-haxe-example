package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class List<T> extends haxe.lang.HxObject
{
	public List(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public List()
	{
		//line 40 "/usr/lib/haxe/std/List.hx"
		haxe.root.List.__hx_ctor__List(this);
	}
	
	
	public static <T_c> void __hx_ctor__List(haxe.root.List<T_c> __temp_me4)
	{
		//line 41 "/usr/lib/haxe/std/List.hx"
		__temp_me4.length = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		return new haxe.root.List<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		return new haxe.root.List<java.lang.Object>();
	}
	
	
	public haxe.root.Array h;
	
	public haxe.root.Array q;
	
	public int length;
	
	public void add(T item)
	{
		//line 50 "/usr/lib/haxe/std/List.hx"
		haxe.root.Array x = new haxe.root.Array(new java.lang.Object[]{item});
		//line 51 "/usr/lib/haxe/std/List.hx"
		if (( this.h == null )) 
		{
			//line 52 "/usr/lib/haxe/std/List.hx"
			this.h = x;
		}
		else
		{
			//line 54 "/usr/lib/haxe/std/List.hx"
			this.q.__set(1, x);
		}
		
		//line 55 "/usr/lib/haxe/std/List.hx"
		this.q = x;
		//line 56 "/usr/lib/haxe/std/List.hx"
		this.length++;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						this.length = ((int) (value) );
						//line 27 "/usr/lib/haxe/std/List.hx"
						return value;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 27 "/usr/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 27 "/usr/lib/haxe/std/List.hx"
						return value;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 104:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("h")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						this.h = ((haxe.root.Array) (value) );
						//line 27 "/usr/lib/haxe/std/List.hx"
						return value;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 113:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("q")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						this.q = ((haxe.root.Array) (value) );
						//line 27 "/usr/lib/haxe/std/List.hx"
						return value;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 27 "/usr/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 96417:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("add")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 104:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("h")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						return this.h;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						return this.length;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 113:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("q")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						return this.q;
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 27 "/usr/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("length")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						return ((double) (this.length) );
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 27 "/usr/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/usr/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 96417:
				{
					//line 27 "/usr/lib/haxe/std/List.hx"
					if (field.equals("add")) 
					{
						//line 27 "/usr/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 27 "/usr/lib/haxe/std/List.hx"
						this.add(((T) (dynargs.__get(0)) ));
					}
					
					//line 27 "/usr/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 27 "/usr/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/usr/lib/haxe/std/List.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 27 "/usr/lib/haxe/std/List.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "/usr/lib/haxe/std/List.hx"
		baseArr.push("length");
		//line 27 "/usr/lib/haxe/std/List.hx"
		baseArr.push("q");
		//line 27 "/usr/lib/haxe/std/List.hx"
		baseArr.push("h");
		//line 27 "/usr/lib/haxe/std/List.hx"
		{
			//line 27 "/usr/lib/haxe/std/List.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


