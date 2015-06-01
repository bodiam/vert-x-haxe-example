package haxe.web;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Dispatch extends haxe.lang.HxObject
{
	public Dispatch(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Dispatch(java.lang.String url, haxe.ds.StringMap<java.lang.String> params)
	{
		//line 77 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		haxe.web.Dispatch.__hx_ctor_haxe_web_Dispatch(this, url, params);
	}
	
	
	public static void __hx_ctor_haxe_web_Dispatch(haxe.web.Dispatch __temp_me19, java.lang.String url, haxe.ds.StringMap<java.lang.String> params)
	{
		//line 103 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		__temp_me19.onMeta = ( (( haxe.web.Dispatch___hx_ctor_haxe_web_Dispatch_103__Fun.__hx_current != null )) ? (haxe.web.Dispatch___hx_ctor_haxe_web_Dispatch_103__Fun.__hx_current) : (haxe.web.Dispatch___hx_ctor_haxe_web_Dispatch_103__Fun.__hx_current = ((haxe.web.Dispatch___hx_ctor_haxe_web_Dispatch_103__Fun) (new haxe.web.Dispatch___hx_ctor_haxe_web_Dispatch_103__Fun()) )) );
		//line 78 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		__temp_me19.parts = haxe.lang.StringExt.split(url, "/");
		//line 79 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		if (haxe.lang.Runtime.valEq(__temp_me19.parts.__get(0), "")) 
		{
			//line 79 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			__temp_me19.parts.shift();
		}
		
		//line 80 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		__temp_me19.params = params;
	}
	
	
	public static java.lang.Object extractConfig(java.lang.Object obj)
	{
		//line 470 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		java.lang.Class c = ((java.lang.Class) (haxe.root.Type.getClass(obj)) );
		//line 471 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		java.lang.Object dc = haxe.rtti.Meta.getType(c);
		//line 472 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		java.lang.Object m = ((haxe.root.Array) (haxe.lang.Runtime.getField(dc, "dispatchConfig", true)) ).__get(0);
		//line 473 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		if (( m instanceof java.lang.String )) 
		{
			//line 474 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			m = haxe.Unserializer.run(haxe.lang.Runtime.toString(m));
			//line 475 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			((haxe.root.Array) (haxe.lang.Runtime.getField(dc, "dispatchConfig", true)) ).__set(0, m);
		}
		
		//line 477 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.lang.DynamicObject(new java.lang.String[]{"obj", "rules"}, new java.lang.Object[]{obj, m}, new java.lang.String[]{}, new double[]{});
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.Dispatch(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return new haxe.web.Dispatch(haxe.lang.Runtime.toString(arr.__get(0)), ((haxe.ds.StringMap<java.lang.String>) (arr.__get(1)) ));
	}
	
	
	public haxe.root.Array<java.lang.String> parts;
	
	public haxe.ds.StringMap<java.lang.String> params;
	
	public java.lang.String name;
	
	public java.lang.Object cfg;
	
	public boolean subDispatch;
	
	public haxe.lang.Function onMeta;
	
	public java.lang.String resolveName(java.lang.String name)
	{
		//line 107 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return name;
	}
	
	
	public void runtimeDispatch(java.lang.Object cfg)
	{
		//line 111 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.name = haxe.lang.Runtime.toString(this.parts.shift());
		//line 112 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		if (( this.name == null )) 
		{
			//line 113 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			this.name = "default";
		}
		
		//line 114 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.name = this.resolveName(this.name);
		//line 115 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.cfg = cfg;
		//line 116 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		haxe.web.DispatchRule r = ((haxe.web.DispatchRule) (haxe.root.Reflect.field(haxe.lang.Runtime.getField(cfg, "rules", true), this.name)) );
		//line 117 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		if (( r == null )) 
		{
			//line 118 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			r = ((haxe.web.DispatchRule) (haxe.lang.Runtime.getField(haxe.lang.Runtime.getField(cfg, "rules", true), "default", false)) );
			//line 119 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (( r == null )) 
			{
				//line 120 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DENotFound(this.name));
			}
			
			//line 121 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			this.parts.unshift(this.name);
			//line 122 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			this.name = "default";
		}
		
		//line 124 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.name = ( ( "do" + haxe.lang.StringExt.charAt(this.name, 0).toUpperCase() ) + haxe.lang.StringExt.substr(this.name, 1, null) );
		//line 125 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		haxe.root.Array args = new haxe.root.Array(new java.lang.Object[]{});
		//line 126 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.subDispatch = false;
		//line 127 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		this.loop(args, r);
		//line 128 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		if (( ( this.parts.length > 0 ) &&  ! (this.subDispatch)  )) 
		{
			//line 129 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (( ( this.parts.length == 1 ) && haxe.lang.Runtime.valEq(this.parts.__get(( this.parts.length - 1 )), "") )) 
			{
				//line 129 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				this.parts.pop();
			}
			else
			{
				//line 129 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DETooManyValues);
			}
			
		}
		
		//line 132 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		try 
		{
			//line 132 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			haxe.root.Reflect.callMethod(haxe.lang.Runtime.getField(cfg, "obj", true), haxe.root.Reflect.field(haxe.lang.Runtime.getField(cfg, "obj", true), this.name), args);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 132 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (( __temp_catchall2 instanceof haxe.web.Redirect )) 
			{
				//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.web.Redirect e = ((haxe.web.Redirect) (__temp_catchall2) );
				//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					this.runtimeDispatch(cfg);
				}
				
			}
			else
			{
				//line 134 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
	}
	
	
	public java.lang.Object match(java.lang.String v, haxe.web.MatchRule r, boolean opt)
	{
		//line 153 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		switch (r.index)
		{
			case 0:
			{
				//line 155 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v == null )) 
				{
					//line 155 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
				}
				
				//line 156 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( opt && haxe.lang.Runtime.valEq(v, "") )) 
				{
					//line 156 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return null;
				}
				
				//line 157 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				java.lang.Object v1 = haxe.root.Std.parseInt(v);
				//line 158 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (haxe.lang.Runtime.eq(v1, null)) 
				{
					//line 158 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEInvalidValue);
				}
				
				//line 159 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return v1;
			}
			
			
			case 2:
			{
				//line 161 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v == null )) 
				{
					//line 161 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
				}
				
				//line 162 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( opt && haxe.lang.Runtime.valEq(v, "") )) 
				{
					//line 162 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return null;
				}
				
				//line 163 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				double v2 = haxe.root.Std.parseFloat(v);
				//line 164 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (java.lang.Double.isNaN(v2)) 
				{
					//line 164 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEInvalidValue);
				}
				
				//line 165 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return v2;
			}
			
			
			case 3:
			{
				//line 167 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v == null )) 
				{
					//line 167 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
				}
				
				//line 168 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return v;
			}
			
			
			case 1:
			{
				//line 170 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return ( ( ( ( v != null ) &&  ! (haxe.lang.Runtime.valEq(v, "0"))  ) &&  ! (haxe.lang.Runtime.valEq(v, "false"))  ) &&  ! (haxe.lang.Runtime.valEq(v, "null"))  );
			}
			
			
			case 4:
			{
				//line 172 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v == null )) 
				{
					//line 172 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
				}
				
				//line 174 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				try 
				{
					//line 174 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return haxe.root.Date.fromString(v);
				}
				catch (java.lang.Throwable __temp_catchallException1)
				{
					//line 174 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					haxe.lang.Exceptions.setException(__temp_catchallException1);
					//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object __temp_catchall2 = __temp_catchallException1;
					//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
					{
						//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					{
						//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						java.lang.Object e = __temp_catchall2;
						//line 176 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEInvalidValue);
					}
					
				}
				
				
			}
			
			
			case 5:
			{
				//line 153 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				java.lang.String e1 = haxe.lang.Runtime.toString(r.params[0]);
				//line 178 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 179 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( v == null )) 
					{
						//line 179 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
					}
					
					//line 180 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( opt && haxe.lang.Runtime.valEq(v, "") )) 
					{
						//line 180 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return null;
					}
					
					//line 181 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (haxe.lang.Runtime.valEq(v, "")) 
					{
						//line 181 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
					}
					
					//line 182 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object en = haxe.root.Type.resolveEnum(e1);
					//line 183 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( en == null )) 
					{
						//line 183 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap("assert");
					}
					
					//line 184 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object ev = null;
					//line 185 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( ( haxe.lang.Runtime.compare(haxe.lang.StringExt.charCodeAt(v, 0), 48) >= 0 ) && ( haxe.lang.Runtime.compare(haxe.lang.StringExt.charCodeAt(v, 0), 57) <= 0 ) )) 
					{
						//line 186 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						ev = ((java.lang.Object) (haxe.root.Type.createEnumIndex(((java.lang.Class) (en) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(v))) ), null)) );
					}
					else
					{
						//line 188 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						ev = ((java.lang.Object) (haxe.root.Type.createEnum(((java.lang.Class) (en) ), v, null)) );
					}
					
					//line 190 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return ev;
				}
				
			}
			
			
			case 6:
			{
				//line 192 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v != null )) 
				{
					//line 193 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					this.parts.unshift(v);
				}
				
				//line 194 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				this.subDispatch = true;
				//line 195 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return this;
			}
			
			
			case 7:
			{
				//line 153 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				boolean lock = haxe.lang.Runtime.toBool(r.params[1]);
				//line 153 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				java.lang.String c = haxe.lang.Runtime.toString(r.params[0]);
				//line 196 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 197 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( v == null )) 
					{
						//line 197 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissing);
					}
					
					//line 198 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object v3 = haxe.root.Std.parseInt(v);
					//line 199 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (haxe.lang.Runtime.eq(v3, null)) 
					{
						//line 199 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEInvalidValue);
					}
					
					//line 200 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object cl = haxe.root.Type.resolveClass(c);
					//line 201 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( cl == null )) 
					{
						//line 201 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap("assert");
					}
					
					//line 202 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object o = null;
					//line 204 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					o = ((java.lang.Object) (haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(cl, "manager", true), "unsafeGet", new haxe.root.Array(new java.lang.Object[]{v3, lock}))) );
					//line 208 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( o == null )) 
					{
						//line 208 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEInvalidValue);
					}
					
					//line 209 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return o;
				}
				
			}
			
			
			case 8:
			{
				//line 153 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.web.MatchRule r1 = ((haxe.web.MatchRule) (r.params[0]) );
				//line 210 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 211 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (( v == null )) 
					{
						//line 212 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return null;
					}
					
					//line 213 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					return this.match(v, r1, true);
				}
				
			}
			
			
		}
		
		//line 152 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return null;
	}
	
	
	public java.lang.Object checkParams(haxe.root.Array<java.lang.Object> params, boolean opt)
	{
		//line 218 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		java.lang.Object po = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		//line 219 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 219 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			int _g = 0;
			//line 219 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			while (( _g < params.length ))
			{
				//line 219 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				java.lang.Object p = params.__get(_g);
				//line 219 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				 ++ _g;
				//line 220 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				java.lang.String v = haxe.lang.Runtime.toString(this.params.get(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "name", true))));
				//line 221 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				if (( v == null )) 
				{
					//line 222 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(p, "opt", true))) 
					{
						//line 222 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						continue;
					}
					
					//line 223 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (opt) 
					{
						//line 223 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return null;
					}
					
					//line 224 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					throw haxe.lang.HaxeException.wrap(haxe.web.DispatchError.DEMissingParam(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "name", true))));
				}
				
				//line 226 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.root.Reflect.setField(po, haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(p, "name", true)), this.match(v, ((haxe.web.MatchRule) (haxe.lang.Runtime.getField(p, "rule", true)) ), haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(p, "opt", true))));
			}
			
		}
		
		//line 228 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return po;
	}
	
	
	public void loop(haxe.root.Array args, haxe.web.DispatchRule r)
	{
		//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		switch (r.index)
		{
			case 2:
			{
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				boolean opt = haxe.lang.Runtime.toBool(r.params[2]);
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.root.Array<java.lang.Object> params = ((haxe.root.Array<java.lang.Object>) (r.params[1]) );
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.web.DispatchRule r1 = ((haxe.web.DispatchRule) (r.params[0]) );
				//line 233 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 234 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					this.loop(args, r1);
					//line 235 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					args.push(this.checkParams(params, opt));
				}
				
				//line 233 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				break;
			}
			
			
			case 0:
			{
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.web.MatchRule r2 = ((haxe.web.MatchRule) (r.params[0]) );
				//line 237 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				args.push(this.match(haxe.lang.Runtime.toString(this.parts.shift()), r2, false));
				//line 236 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				break;
			}
			
			
			case 1:
			{
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.root.Array<haxe.web.MatchRule> rl = ((haxe.root.Array<haxe.web.MatchRule>) (r.params[0]) );
				//line 239 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 239 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					int _g = 0;
					//line 239 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					while (( _g < rl.length ))
					{
						//line 239 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						haxe.web.MatchRule r3 = rl.__get(_g);
						//line 239 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						 ++ _g;
						//line 240 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						args.push(this.match(haxe.lang.Runtime.toString(this.parts.shift()), r3, false));
					}
					
				}
				
				//line 238 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				break;
			}
			
			
			case 3:
			{
				//line 232 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				haxe.web.DispatchRule r4 = ((haxe.web.DispatchRule) (r.params[0]) );
				//line 241 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				{
					//line 242 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					this.loop(args, r4);
					//line 243 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Class c = ((java.lang.Class) (haxe.root.Type.getClass(haxe.lang.Runtime.getField(this.cfg, "obj", true))) );
					//line 244 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					java.lang.Object m = null;
					//line 245 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					do 
					{
						//line 246 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (null) ) )) 
						{
							//line 246 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
							throw haxe.lang.HaxeException.wrap("assert");
						}
						
						//line 247 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						m = haxe.root.Reflect.field(haxe.rtti.Meta.getFields(c), this.name);
						//line 248 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						c = haxe.root.Type.getSuperClass(c);
					}
					while (( m == null ));
					//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					{
						//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						int _g1 = 0;
						//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						haxe.root.Array<java.lang.String> _g11 = haxe.root.Reflect.fields(m);
						//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						while (( _g1 < _g11.length ))
						{
							//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
							java.lang.String mv = _g11.__get(_g1);
							//line 250 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
							 ++ _g1;
							//line 251 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
							this.onMeta.__hx_invoke2_o(0.0, mv, 0.0, haxe.root.Reflect.field(m, mv));
						}
						
					}
					
				}
				
				//line 241 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				break;
			}
			
			
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			boolean __temp_executeDef1 = true;
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			switch (field.hashCode())
			{
				case 98404:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("cfg")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.cfg = ((java.lang.Object) (value) );
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
			}
			
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (__temp_executeDef1) 
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			boolean __temp_executeDef1 = true;
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			switch (field.hashCode())
			{
				case -1013149564:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("onMeta")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.onMeta = ((haxe.lang.Function) (value) );
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 106437344:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("parts")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.parts = ((haxe.root.Array<java.lang.String>) (value) );
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 1599284954:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("subDispatch")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.subDispatch = haxe.lang.Runtime.toBool(value);
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case -995427962:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("params")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.params = ((haxe.ds.StringMap<java.lang.String>) (value) );
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 98404:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("cfg")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.cfg = ((java.lang.Object) (value) );
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 3373707:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("name")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.name = haxe.lang.Runtime.toString(value);
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return value;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
			}
			
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (__temp_executeDef1) 
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			boolean __temp_executeDef1 = true;
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			switch (field.hashCode())
			{
				case 3327652:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("loop")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "loop")) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 106437344:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("parts")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.parts;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 665183406:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("checkParams")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "checkParams")) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case -995427962:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("params")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.params;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 103668165:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("match")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "match")) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 3373707:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("name")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.name;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case -540794766:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("runtimeDispatch")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "runtimeDispatch")) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 98404:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("cfg")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.cfg;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 1952619159:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("resolveName")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resolveName")) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 1599284954:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("subDispatch")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.subDispatch;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case -1013149564:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("onMeta")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.onMeta;
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
			}
			
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (__temp_executeDef1) 
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			boolean __temp_executeDef1 = true;
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			switch (field.hashCode())
			{
				case 98404:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("cfg")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.cfg)) );
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
			}
			
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (__temp_executeDef1) 
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			boolean __temp_executeDef1 = true;
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			switch (field.hashCode())
			{
				case 3327652:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("loop")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.loop(((haxe.root.Array) (dynargs.__get(0)) ), ((haxe.web.DispatchRule) (dynargs.__get(1)) ));
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 1952619159:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("resolveName")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.resolveName(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 665183406:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("checkParams")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.checkParams(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ), haxe.lang.Runtime.toBool(dynargs.__get(1)));
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case -540794766:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("runtimeDispatch")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						this.runtimeDispatch(dynargs.__get(0));
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
				case 103668165:
				{
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					if (field.equals("match")) 
					{
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						__temp_executeDef1 = false;
						//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
						return this.match(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.web.MatchRule) (dynargs.__get(1)) ), haxe.lang.Runtime.toBool(dynargs.__get(2)));
					}
					
					//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
					break;
				}
				
				
			}
			
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			if (__temp_executeDef1) 
			{
				//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("onMeta");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("subDispatch");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("cfg");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("name");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("params");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		baseArr.push("parts");
		//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
		{
			//line 69 "/usr/lib/haxe/std/haxe/web/Dispatch.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


