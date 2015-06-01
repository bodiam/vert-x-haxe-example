package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Unserializer extends haxe.lang.HxObject
{
	static
	{
		//line 60 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.Unserializer.DEFAULT_RESOLVER = ((java.lang.Object) (haxe.root.Type.class) );
		//line 62 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.Unserializer.BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789%:";
		//line 65 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.Unserializer.CODES = null;
	}
	
	public Unserializer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Unserializer(java.lang.String buf)
	{
		//line 99 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.Unserializer.__hx_ctor_haxe_Unserializer(this, buf);
	}
	
	
	public static void __hx_ctor_haxe_Unserializer(haxe.Unserializer __temp_me11, java.lang.String buf)
	{
		//line 100 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.buf = buf;
		//line 101 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.length = buf.length();
		//line 102 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.pos = 0;
		//line 106 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.scache = new haxe.root.Array<java.lang.String>();
		//line 107 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.cache = new haxe.root.Array();
		//line 108 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		java.lang.Object r = haxe.Unserializer.DEFAULT_RESOLVER;
		//line 109 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		if (( r == null )) 
		{
			//line 110 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			r = haxe.root.Type.class;
			//line 111 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			haxe.Unserializer.DEFAULT_RESOLVER = r;
		}
		
		//line 113 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		__temp_me11.setResolver(r);
	}
	
	
	public static java.lang.Object DEFAULT_RESOLVER;
	
	public static java.lang.String BASE64;
	
	public static haxe.root.Array<java.lang.Object> CODES;
	
	public static haxe.root.Array<java.lang.Object> initCodes()
	{
		//line 72 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.root.Array<java.lang.Object> codes = new haxe.root.Array<java.lang.Object>();
		//line 74 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 74 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int _g1 = 0;
			//line 74 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int _g = haxe.Unserializer.BASE64.length();
			//line 74 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			while (( _g1 < _g ))
			{
				//line 74 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int i = _g1++;
				//line 75 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int __temp_stmt1 = 0;
				//line 75 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				{
					//line 75 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s = haxe.Unserializer.BASE64;
					//line 75 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					__temp_stmt1 = ( (( i < s.length() )) ? (((int) (s.charAt(i)) )) : (-1) );
				}
				
				//line 75 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				codes.__set(__temp_stmt1, i);
			}
			
		}
		
		//line 76 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return codes;
	}
	
	
	public static java.lang.Object run(java.lang.String v)
	{
		//line 460 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return new haxe.Unserializer(haxe.lang.Runtime.toString(v)).unserialize();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return new haxe.Unserializer(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return new haxe.Unserializer(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String buf;
	
	public int pos;
	
	public int length;
	
	public haxe.root.Array cache;
	
	public haxe.root.Array<java.lang.String> scache;
	
	public java.lang.Object resolver;
	
	public void setResolver(java.lang.Object r)
	{
		//line 125 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		if (( r == null )) 
		{
			//line 126 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 127 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				haxe.lang.Function __temp_odecl1 = ( (( haxe.Unserializer_setResolver_127__Fun.__hx_current != null )) ? (haxe.Unserializer_setResolver_127__Fun.__hx_current) : (haxe.Unserializer_setResolver_127__Fun.__hx_current = ((haxe.Unserializer_setResolver_127__Fun) (new haxe.Unserializer_setResolver_127__Fun()) )) );
				//line 128 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				haxe.lang.Function __temp_odecl2 = ( (( haxe.Unserializer_setResolver_128__Fun.__hx_current != null )) ? (haxe.Unserializer_setResolver_128__Fun.__hx_current) : (haxe.Unserializer_setResolver_128__Fun.__hx_current = ((haxe.Unserializer_setResolver_128__Fun) (new haxe.Unserializer_setResolver_128__Fun()) )) );
				//line 126 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				this.resolver = new haxe.lang.DynamicObject(new java.lang.String[]{"resolveClass", "resolveEnum"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
		}
		else
		{
			//line 131 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			this.resolver = r;
		}
		
	}
	
	
	public int readDigits()
	{
		//line 148 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		int k = 0;
		//line 149 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		boolean s = false;
		//line 150 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		int fpos = this.pos;
		//line 151 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		while (true)
		{
			//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int c = 0;
			//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int p = this.pos;
				//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				{
					//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s1 = this.buf;
					//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( p < s1.length() )) 
					{
						//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						c = ((int) (s1.charAt(p)) );
					}
					else
					{
						//line 152 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						c = -1;
					}
					
				}
				
			}
			
			//line 153 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( c == -1 )) 
			{
				//line 154 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				break;
			}
			
			//line 155 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( c == 45 )) 
			{
				//line 156 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				if (( this.pos != fpos )) 
				{
					//line 157 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				//line 158 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				s = true;
				//line 159 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				this.pos++;
				//line 160 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				continue;
			}
			
			//line 162 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( ( c < 48 ) || ( c > 57 ) )) 
			{
				//line 163 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				break;
			}
			
			//line 164 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			k = ( ( k * 10 ) + (( c - 48 )) );
			//line 165 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			this.pos++;
		}
		
		//line 167 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		if (s) 
		{
			//line 168 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			k *= -1;
		}
		
		//line 169 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return k;
	}
	
	
	public double readFloat()
	{
		//line 173 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		int p1 = this.pos;
		//line 174 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		while (true)
		{
			//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int c = 0;
			//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int p = this.pos;
				//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				{
					//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s = this.buf;
					//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( p < s.length() )) 
					{
						//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						c = ((int) (s.charAt(p)) );
					}
					else
					{
						//line 175 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						c = -1;
					}
					
				}
				
			}
			
			//line 177 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( ( ( ( c >= 43 ) && ( c < 58 ) ) || ( c == 101 ) ) || ( c == 69 ) )) 
			{
				//line 178 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				this.pos++;
			}
			else
			{
				//line 180 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				break;
			}
			
		}
		
		//line 182 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return haxe.root.Std.parseFloat(haxe.lang.StringExt.substr(this.buf, p1, ( this.pos - p1 )));
	}
	
	
	public void unserializeObject(java.lang.Object o)
	{
		//line 186 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		while (true)
		{
			//line 187 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( this.pos >= this.length )) 
			{
				//line 188 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw haxe.lang.HaxeException.wrap("Invalid object");
			}
			
			//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int __temp_stmt1 = 0;
			//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int p = this.pos;
				//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				{
					//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s = this.buf;
					//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					__temp_stmt1 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
				}
				
			}
			
			//line 189 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (( __temp_stmt1 == 103 )) 
			{
				//line 190 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				break;
			}
			
			//line 191 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			java.lang.String k = haxe.lang.Runtime.toString(this.unserialize());
			//line 192 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if ( ! (( k instanceof java.lang.String )) ) 
			{
				//line 193 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw haxe.lang.HaxeException.wrap("Invalid object key");
			}
			
			//line 194 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			java.lang.Object v = this.unserialize();
			//line 195 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			haxe.root.Reflect.setField(o, k, v);
		}
		
		//line 197 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		this.pos++;
	}
	
	
	public java.lang.Object unserializeEnum(java.lang.Class edecl, java.lang.String tag)
	{
		//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		int __temp_stmt1 = 0;
		//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int p = this.pos++;
			//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				java.lang.String s = this.buf;
				//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				__temp_stmt1 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
			}
			
		}
		
		//line 201 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		if (( __temp_stmt1 != 58 )) 
		{
			//line 202 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			throw haxe.lang.HaxeException.wrap("Invalid enum format");
		}
		
		//line 203 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		int nargs = this.readDigits();
		//line 204 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		if (( nargs == 0 )) 
		{
			//line 205 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			return ((java.lang.Object) (haxe.root.Type.createEnum(edecl, tag, null)) );
		}
		
		//line 206 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		haxe.root.Array args = new haxe.root.Array();
		//line 207 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		while (( nargs-- > 0 ))
		{
			//line 208 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			args.push(this.unserialize());
		}
		
		//line 209 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return ((java.lang.Object) (haxe.root.Type.createEnum(edecl, tag, args)) );
	}
	
	
	public java.lang.Object unserialize()
	{
		//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			int _g = 0;
			//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			{
				//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				int p = this.pos++;
				//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				{
					//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s = this.buf;
					//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( p < s.length() )) 
					{
						//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						_g = ((int) (s.charAt(p)) );
					}
					else
					{
						//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						_g = -1;
					}
					
				}
				
			}
			
			//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (_g)
			{
				case 110:
				{
					//line 235 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return null;
				}
				
				
				case 116:
				{
					//line 237 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return true;
				}
				
				
				case 102:
				{
					//line 239 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return false;
				}
				
				
				case 122:
				{
					//line 241 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return 0;
				}
				
				
				case 105:
				{
					//line 243 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return this.readDigits();
				}
				
				
				case 100:
				{
					//line 245 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return this.readFloat();
				}
				
				
				case 121:
				{
					//line 247 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int len = this.readDigits();
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int __temp_stmt3 = 0;
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					{
						//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int p1 = this.pos++;
						//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s1 = this.buf;
							//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt3 = ( (( p1 < s1.length() )) ? (((int) (s1.charAt(p1)) )) : (-1) );
						}
						
					}
					
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_stmt2 = ( __temp_stmt3 != 58 );
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv4 = false;
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if ( ! (__temp_stmt2) ) 
					{
						//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_boolv4 = ( ( this.length - this.pos ) < len );
					}
					
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_stmt1 = ( __temp_stmt2 || __temp_boolv4 );
					//line 248 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (__temp_stmt1) 
					{
						//line 249 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid string length");
					}
					
					//line 250 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String s2 = haxe.lang.StringExt.substr(this.buf, this.pos, len);
					//line 251 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos += len;
					//line 252 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					s2 = haxe.root.StringTools.urlDecode(s2);
					//line 253 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.scache.push(s2);
					//line 254 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return s2;
				}
				
				
				case 107:
				{
					//line 256 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return java.lang.Double.NaN;
				}
				
				
				case 109:
				{
					//line 258 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return java.lang.Double.NEGATIVE_INFINITY;
				}
				
				
				case 112:
				{
					//line 260 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return java.lang.Double.POSITIVE_INFINITY;
				}
				
				
				case 97:
				{
					//line 262 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf = this.buf;
					//line 263 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.root.Array a = new haxe.root.Array();
					//line 264 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(a);
					//line 265 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					while (true)
					{
						//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c = 0;
						//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p2 = this.pos;
							//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s3 = this.buf;
								//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								if (( p2 < s3.length() )) 
								{
									//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									c = ((int) (s3.charAt(p2)) );
								}
								else
								{
									//line 266 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									c = -1;
								}
								
							}
							
						}
						
						//line 267 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( c == 104 )) 
						{
							//line 268 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							this.pos++;
							//line 269 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							break;
						}
						
						//line 271 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( c == 117 )) 
						{
							//line 272 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							this.pos++;
							//line 273 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int n = this.readDigits();
							//line 274 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							a.__set(( ( a.length + n ) - 1 ), null);
						}
						else
						{
							//line 276 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							a.push(this.unserialize());
						}
						
					}
					
					//line 278 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return a;
				}
				
				
				case 111:
				{
					//line 280 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Object o = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
					//line 281 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(o);
					//line 282 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.unserializeObject(o);
					//line 283 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return o;
				}
				
				
				case 114:
				{
					//line 285 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int n1 = this.readDigits();
					//line 286 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ( n1 < 0 ) || ( n1 >= this.cache.length ) )) 
					{
						//line 287 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid reference");
					}
					
					//line 288 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return this.cache.__get(n1);
				}
				
				
				case 82:
				{
					//line 290 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int n2 = this.readDigits();
					//line 291 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ( n2 < 0 ) || ( n2 >= this.scache.length ) )) 
					{
						//line 292 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid string reference");
					}
					
					//line 293 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return this.scache.__get(n2);
				}
				
				
				case 120:
				{
					//line 295 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					throw haxe.lang.HaxeException.wrap(this.unserialize());
				}
				
				
				case 99:
				{
					//line 297 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name = haxe.lang.Runtime.toString(this.unserialize());
					//line 298 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class cl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveClass", new haxe.root.Array(new java.lang.Object[]{name}))) );
					//line 299 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (cl) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 300 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Class not found " + name ));
					}
					
					//line 301 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Object o1 = ((java.lang.Object) (haxe.root.Type.createEmptyInstance(cl)) );
					//line 302 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(o1);
					//line 303 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.unserializeObject(o1);
					//line 304 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return o1;
				}
				
				
				case 119:
				{
					//line 306 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name1 = haxe.lang.Runtime.toString(this.unserialize());
					//line 307 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class edecl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveEnum", new haxe.root.Array(new java.lang.Object[]{name1}))) );
					//line 308 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (edecl) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 309 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Enum not found " + name1 ));
					}
					
					//line 310 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Object e = this.unserializeEnum(edecl, haxe.lang.Runtime.toString(this.unserialize()));
					//line 311 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(e);
					//line 312 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return e;
				}
				
				
				case 106:
				{
					//line 314 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name2 = haxe.lang.Runtime.toString(this.unserialize());
					//line 315 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class edecl1 = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveEnum", new haxe.root.Array(new java.lang.Object[]{name2}))) );
					//line 316 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (edecl1) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 317 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Enum not found " + name2 ));
					}
					
					//line 318 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos++;
					//line 319 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int index = this.readDigits();
					//line 320 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String tag = haxe.root.Type.getEnumConstructs(edecl1).__get(index);
					//line 321 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( tag == null )) 
					{
						//line 322 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( ( ( "Unknown enum index " + name2 ) + "@" ) + index ));
					}
					
					//line 323 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Object e1 = this.unserializeEnum(edecl1, tag);
					//line 324 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(e1);
					//line 325 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return e1;
				}
				
				
				case 108:
				{
					//line 327 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.root.List l = new haxe.root.List();
					//line 328 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(l);
					//line 329 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf1 = this.buf;
					//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					do 
					{
						//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt5 = 0;
						//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p3 = this.pos;
							//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s4 = this.buf;
								//line 330 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_stmt5 = ( (( p3 < s4.length() )) ? (((int) (s4.charAt(p3)) )) : (-1) );
							}
							
						}
						
						//line 331 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( __temp_stmt5 != 104 )) 
						{
							//line 331 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							l.add(this.unserialize());
						}
						else
						{
							//line 331 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							break;
						}
						
					}
					while (true);
					//line 332 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos++;
					//line 333 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return l;
				}
				
				
				case 98:
				{
					//line 335 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.ds.StringMap h = new haxe.ds.StringMap();
					//line 336 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(h);
					//line 337 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf2 = this.buf;
					//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					do 
					{
						//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt6 = 0;
						//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p4 = this.pos;
							//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s5 = this.buf;
								//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_stmt6 = ( (( p4 < s5.length() )) ? (((int) (s5.charAt(p4)) )) : (-1) );
							}
							
						}
						
						//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( __temp_stmt6 != 104 )) 
						{
							//line 339 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s6 = haxe.lang.Runtime.toString(this.unserialize());
							//line 340 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							h.set(s6, this.unserialize());
						}
						else
						{
							//line 338 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							break;
						}
						
					}
					while (true);
					//line 342 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos++;
					//line 343 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return h;
				}
				
				
				case 113:
				{
					//line 345 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.ds.IntMap h1 = new haxe.ds.IntMap();
					//line 346 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(h1);
					//line 347 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf3 = this.buf;
					//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int c1 = 0;
					//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					{
						//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int p5 = this.pos++;
						//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s7 = this.buf;
							//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							if (( p5 < s7.length() )) 
							{
								//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								c1 = ((int) (s7.charAt(p5)) );
							}
							else
							{
								//line 348 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								c1 = -1;
							}
							
						}
						
					}
					
					//line 349 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					while (( c1 == 58 ))
					{
						//line 350 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int i = this.readDigits();
						//line 351 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						h1.set(i, this.unserialize());
						//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p6 = this.pos++;
							//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s8 = this.buf;
								//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								if (( p6 < s8.length() )) 
								{
									//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									c1 = ((int) (s8.charAt(p6)) );
								}
								else
								{
									//line 352 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									c1 = -1;
								}
								
							}
							
						}
						
					}
					
					//line 354 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( c1 != 104 )) 
					{
						//line 355 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid IntMap format");
					}
					
					//line 356 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return h1;
				}
				
				
				case 77:
				{
					//line 358 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.ds.ObjectMap h2 = new haxe.ds.ObjectMap();
					//line 359 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(h2);
					//line 360 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf4 = this.buf;
					//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					do 
					{
						//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt7 = 0;
						//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p7 = this.pos;
							//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s9 = this.buf;
								//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_stmt7 = ( (( p7 < s9.length() )) ? (((int) (s9.charAt(p7)) )) : (-1) );
							}
							
						}
						
						//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( __temp_stmt7 != 104 )) 
						{
							//line 362 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.Object s10 = this.unserialize();
							//line 363 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							h2.set(s10, this.unserialize());
						}
						else
						{
							//line 361 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							break;
						}
						
					}
					while (true);
					//line 365 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos++;
					//line 366 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return h2;
				}
				
				
				case 118:
				{
					//line 368 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.root.Date d = null;
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int __temp_stmt18 = 0;
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					{
						//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int p8 = this.pos;
						//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s11 = this.buf;
							//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt18 = ( (( p8 < s11.length() )) ? (((int) (s11.charAt(p8)) )) : (-1) );
						}
						
					}
					
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv17 = ( __temp_stmt18 >= 48 );
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv16 = false;
					//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv15 = false;
					//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv14 = false;
					//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv13 = false;
					//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv12 = false;
					//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv11 = false;
					//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv10 = false;
					//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv9 = false;
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (__temp_boolv17) 
					{
						//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt19 = 0;
						//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int p9 = this.pos;
							//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								java.lang.String s12 = this.buf;
								//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_stmt19 = ( (( p9 < s12.length() )) ? (((int) (s12.charAt(p9)) )) : (-1) );
							}
							
						}
						
						//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_boolv16 = ( __temp_stmt19 <= 57 );
						//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (__temp_boolv16) 
						{
							//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int __temp_stmt20 = 0;
							//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								int p10 = ( this.pos + 1 );
								//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								{
									//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									java.lang.String s13 = this.buf;
									//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									__temp_stmt20 = ( (( p10 < s13.length() )) ? (((int) (s13.charAt(p10)) )) : (-1) );
								}
								
							}
							
							//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_boolv15 = ( __temp_stmt20 >= 48 );
							//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							if (__temp_boolv15) 
							{
								//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								int __temp_stmt21 = 0;
								//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								{
									//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									int p11 = ( this.pos + 1 );
									//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									{
										//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										java.lang.String s14 = this.buf;
										//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										__temp_stmt21 = ( (( p11 < s14.length() )) ? (((int) (s14.charAt(p11)) )) : (-1) );
									}
									
								}
								
								//line 370 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_boolv14 = ( __temp_stmt21 <= 57 );
								//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								if (__temp_boolv14) 
								{
									//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									int __temp_stmt22 = 0;
									//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									{
										//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										int p12 = ( this.pos + 2 );
										//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										{
											//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											java.lang.String s15 = this.buf;
											//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											__temp_stmt22 = ( (( p12 < s15.length() )) ? (((int) (s15.charAt(p12)) )) : (-1) );
										}
										
									}
									
									//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									__temp_boolv13 = ( __temp_stmt22 >= 48 );
									//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
									if (__temp_boolv13) 
									{
										//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										int __temp_stmt23 = 0;
										//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										{
											//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											int p13 = ( this.pos + 2 );
											//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											{
												//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												java.lang.String s16 = this.buf;
												//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												__temp_stmt23 = ( (( p13 < s16.length() )) ? (((int) (s16.charAt(p13)) )) : (-1) );
											}
											
										}
										
										//line 371 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										__temp_boolv12 = ( __temp_stmt23 <= 57 );
										//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
										if (__temp_boolv12) 
										{
											//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											int __temp_stmt24 = 0;
											//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											{
												//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												int p14 = ( this.pos + 3 );
												//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												{
													//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													java.lang.String s17 = this.buf;
													//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													__temp_stmt24 = ( (( p14 < s17.length() )) ? (((int) (s17.charAt(p14)) )) : (-1) );
												}
												
											}
											
											//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											__temp_boolv11 = ( __temp_stmt24 >= 48 );
											//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
											if (__temp_boolv11) 
											{
												//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												int __temp_stmt25 = 0;
												//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												{
													//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													int p15 = ( this.pos + 3 );
													//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													{
														//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
														java.lang.String s18 = this.buf;
														//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
														__temp_stmt25 = ( (( p15 < s18.length() )) ? (((int) (s18.charAt(p15)) )) : (-1) );
													}
													
												}
												
												//line 372 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												__temp_boolv10 = ( __temp_stmt25 <= 57 );
												//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
												if (__temp_boolv10) 
												{
													//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													int __temp_stmt26 = 0;
													//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													{
														//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
														int p16 = ( this.pos + 4 );
														//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
														{
															//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
															java.lang.String s19 = this.buf;
															//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
															__temp_stmt26 = ( (( p16 < s19.length() )) ? (((int) (s19.charAt(p16)) )) : (-1) );
														}
														
													}
													
													//line 373 "/usr/lib/haxe/std/haxe/Unserializer.hx"
													__temp_boolv9 = ( __temp_stmt26 == 45 );
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_stmt8 = ( ( ( ( ( ( ( ( __temp_boolv17 && __temp_boolv16 ) && __temp_boolv15 ) && __temp_boolv14 ) && __temp_boolv13 ) && __temp_boolv12 ) && __temp_boolv11 ) && __temp_boolv10 ) && __temp_boolv9 );
					//line 369 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (__temp_stmt8) 
					{
						//line 376 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						d = haxe.root.Date.fromString(haxe.lang.StringExt.substr(this.buf, this.pos, 19));
						//line 377 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.pos += 19;
					}
					else
					{
						//line 379 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						d = haxe.root.Date.fromTime(this.readFloat());
					}
					
					//line 380 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(d);
					//line 381 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return d;
				}
				
				
				case 115:
				{
					//line 383 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int len1 = this.readDigits();
					//line 384 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String buf5 = this.buf;
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int __temp_stmt29 = 0;
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					{
						//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int p17 = this.pos++;
						//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s20 = this.buf;
							//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt29 = ( (( p17 < s20.length() )) ? (((int) (s20.charAt(p17)) )) : (-1) );
						}
						
					}
					
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_stmt28 = ( __temp_stmt29 != 58 );
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_boolv30 = false;
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if ( ! (__temp_stmt28) ) 
					{
						//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_boolv30 = ( ( this.length - this.pos ) < len1 );
					}
					
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					boolean __temp_stmt27 = ( __temp_stmt28 || __temp_boolv30 );
					//line 385 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (__temp_stmt27) 
					{
						//line 386 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid bytes length");
					}
					
					//line 390 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.root.Array<java.lang.Object> codes = haxe.Unserializer.CODES;
					//line 391 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( codes == null )) 
					{
						//line 392 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						codes = haxe.Unserializer.initCodes();
						//line 393 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						haxe.Unserializer.CODES = codes;
					}
					
					//line 395 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int i1 = this.pos;
					//line 396 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int rest = ( len1 & 3 );
					//line 397 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int size = 0;
					//line 397 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					size = ( ( (( len1 >> 2 )) * 3 ) + (( (( rest >= 2 )) ? (( rest - 1 )) : (0) )) );
					//line 398 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int max = ( i1 + (( len1 - rest )) );
					//line 399 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.io.Bytes bytes = haxe.io.Bytes.alloc(size);
					//line 400 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int bpos = 0;
					//line 401 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					while (( i1 < max ))
					{
						//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt32 = 0;
						//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index1 = i1++;
							//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt32 = ( (( index1 < buf5.length() )) ? (((int) (buf5.charAt(index1)) )) : (-1) );
						}
						
						//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt31 = codes.__get(__temp_stmt32);
						//line 402 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c11 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt31)) );
						//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt34 = 0;
						//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index2 = i1++;
							//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt34 = ( (( index2 < buf5.length() )) ? (((int) (buf5.charAt(index2)) )) : (-1) );
						}
						
						//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt33 = codes.__get(__temp_stmt34);
						//line 403 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c2 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt33)) );
						//line 404 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 404 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int pos = bpos++;
							//line 404 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							bytes.b[pos] = ((byte) (( ( c11 << 2 ) | ( c2 >> 4 ) )) );
						}
						
						//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt36 = 0;
						//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index3 = i1++;
							//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt36 = ( (( index3 < buf5.length() )) ? (((int) (buf5.charAt(index3)) )) : (-1) );
						}
						
						//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt35 = codes.__get(__temp_stmt36);
						//line 405 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c3 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt35)) );
						//line 406 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 406 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int pos1 = bpos++;
							//line 406 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							bytes.b[pos1] = ((byte) (( ( c2 << 4 ) | ( c3 >> 2 ) )) );
						}
						
						//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt38 = 0;
						//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index4 = i1++;
							//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt38 = ( (( index4 < buf5.length() )) ? (((int) (buf5.charAt(index4)) )) : (-1) );
						}
						
						//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt37 = codes.__get(__temp_stmt38);
						//line 407 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c4 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt37)) );
						//line 408 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 408 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int pos2 = bpos++;
							//line 408 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							bytes.b[pos2] = ((byte) (( ( c3 << 6 ) | c4 )) );
						}
						
					}
					
					//line 410 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( rest >= 2 )) 
					{
						//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt40 = 0;
						//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index5 = i1++;
							//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt40 = ( (( index5 < buf5.length() )) ? (((int) (buf5.charAt(index5)) )) : (-1) );
						}
						
						//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt39 = codes.__get(__temp_stmt40);
						//line 411 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c12 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt39)) );
						//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int __temp_stmt42 = 0;
						//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int index6 = i1++;
							//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt42 = ( (( index6 < buf5.length() )) ? (((int) (buf5.charAt(index6)) )) : (-1) );
						}
						
						//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						java.lang.Object __temp_stmt41 = codes.__get(__temp_stmt42);
						//line 412 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int c21 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt41)) );
						//line 413 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 413 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int pos3 = bpos++;
							//line 413 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							bytes.b[pos3] = ((byte) (( ( c12 << 2 ) | ( c21 >> 4 ) )) );
						}
						
						//line 414 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						if (( rest == 3 )) 
						{
							//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int __temp_stmt44 = 0;
							//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								int index7 = i1++;
								//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								__temp_stmt44 = ( (( index7 < buf5.length() )) ? (((int) (buf5.charAt(index7)) )) : (-1) );
							}
							
							//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.Object __temp_stmt43 = codes.__get(__temp_stmt44);
							//line 415 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							int c31 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt43)) );
							//line 416 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							{
								//line 416 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								int pos4 = bpos++;
								//line 416 "/usr/lib/haxe/std/haxe/Unserializer.hx"
								bytes.b[pos4] = ((byte) (( ( c21 << 4 ) | ( c31 >> 2 ) )) );
							}
							
						}
						
					}
					
					//line 420 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.pos += len1;
					//line 421 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(bytes);
					//line 422 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return bytes;
				}
				
				
				case 67:
				{
					//line 424 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name3 = haxe.lang.Runtime.toString(this.unserialize());
					//line 425 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class cl1 = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveClass", new haxe.root.Array(new java.lang.Object[]{name3}))) );
					//line 426 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (cl1) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 427 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Class not found " + name3 ));
					}
					
					//line 428 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Object o2 = ((java.lang.Object) (haxe.root.Type.createEmptyInstance(cl1)) );
					//line 429 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					this.cache.push(o2);
					//line 430 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					haxe.lang.Runtime.callField(o2, "hxUnserialize", new haxe.root.Array(new java.lang.Object[]{this}));
					//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					int __temp_stmt45 = 0;
					//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					{
						//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						int p18 = this.pos++;
						//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						{
							//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							java.lang.String s21 = this.buf;
							//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
							__temp_stmt45 = ( (( p18 < s21.length() )) ? (((int) (s21.charAt(p18)) )) : (-1) );
						}
						
					}
					
					//line 431 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( __temp_stmt45 != 103 )) 
					{
						//line 432 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap("Invalid custom data");
					}
					
					//line 433 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return o2;
				}
				
				
				case 65:
				{
					//line 435 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name4 = haxe.lang.Runtime.toString(this.unserialize());
					//line 436 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class cl2 = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveClass", new haxe.root.Array(new java.lang.Object[]{name4}))) );
					//line 437 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (cl2) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 438 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Class not found " + name4 ));
					}
					
					//line 439 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return cl2;
				}
				
				
				case 66:
				{
					//line 441 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.String name5 = haxe.lang.Runtime.toString(this.unserialize());
					//line 442 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					java.lang.Class e2 = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveEnum", new haxe.root.Array(new java.lang.Object[]{name5}))) );
					//line 443 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (( ((java.lang.Object) (e2) ) == ((java.lang.Object) (null) ) )) 
					{
						//line 444 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						throw haxe.lang.HaxeException.wrap(( "Enum not found " + name5 ));
					}
					
					//line 445 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					return e2;
				}
				
				
				default:
				{
					//line 233 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
			}
			
		}
		
		//line 448 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		this.pos--;
		//line 449 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		throw haxe.lang.HaxeException.wrap(( ( ( "Invalid char " + haxe.lang.StringExt.charAt(this.buf, this.pos) ) + " at position " ) + this.pos ));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (field.hashCode())
			{
				case -341328890:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("resolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.resolver = ((java.lang.Object) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("pos")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.pos = ((int) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("length")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.length = ((int) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (field.hashCode())
			{
				case -341328890:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("resolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.resolver = ((java.lang.Object) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 97907:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("buf")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.buf = haxe.lang.Runtime.toString(value);
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -908198161:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("scache")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.scache = ((haxe.root.Array<java.lang.String>) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("pos")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 94416770:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("cache")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.cache = ((haxe.root.Array) (value) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("length")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return value;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (field.hashCode())
			{
				case -505039769:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserialize")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unserialize")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 97907:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("buf")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.buf;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 1438134792:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserializeEnum")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unserializeEnum")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("pos")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.pos;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -657057146:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserializeObject")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unserializeObject")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("length")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.length;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1136761242:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("readFloat")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readFloat")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 94416770:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("cache")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.cache;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -940119524:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("readDigits")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readDigits")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -908198161:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("scache")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.scache;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 1647991432:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("setResolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setResolver")) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -341328890:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("resolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.resolver;
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (field.hashCode())
			{
				case -341328890:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("resolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.resolver)) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("pos")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((double) (this.pos) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("length")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return ((double) (this.length) );
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			switch (field.hashCode())
			{
				case -505039769:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserialize")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.unserialize();
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 1647991432:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("setResolver")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.setResolver(dynargs.__get(0));
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case 1438134792:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserializeEnum")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.unserializeEnum(((java.lang.Class) (dynargs.__get(0)) ), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -940119524:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("readDigits")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.readDigits();
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -657057146:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("unserializeObject")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						this.unserializeObject(dynargs.__get(0));
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
				case -1136761242:
				{
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					if (field.equals("readFloat")) 
					{
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						__temp_executeDef1 = false;
						//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
						return this.readFloat();
					}
					
					//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("resolver");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("scache");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("cache");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("length");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("pos");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		baseArr.push("buf");
		//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
		{
			//line 42 "/usr/lib/haxe/std/haxe/Unserializer.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


