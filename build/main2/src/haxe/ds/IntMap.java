package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IntMap<T> extends haxe.lang.HxObject implements haxe.IMap<java.lang.Object, T>
{
	public IntMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public IntMap()
	{
		//line 50 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		haxe.ds.IntMap.__hx_ctor_haxe_ds_IntMap(this);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_ds_IntMap(haxe.ds.IntMap<T_c> __temp_me12)
	{
		//line 52 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		__temp_me12.cachedIndex = -1;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		return new haxe.ds.IntMap<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		return new haxe.ds.IntMap<java.lang.Object>();
	}
	
	
	public int[] flags;
	
	public int[] _keys;
	
	public T[] vals;
	
	public int nBuckets;
	
	public int size;
	
	public int nOccupied;
	
	public int upperBound;
	
	public int cachedKey;
	
	public int cachedIndex;
	
	public void set(int key, T value)
	{
		//line 57 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		int x = 0;
		//line 58 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		if (( this.nOccupied >= this.upperBound )) 
		{
			//line 60 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( this.nBuckets > ( this.size << 1 ) )) 
			{
				//line 61 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				this.resize(( this.nBuckets - 1 ));
			}
			else
			{
				//line 63 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				this.resize(( this.nBuckets + 1 ));
			}
			
		}
		
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		int[] flags = this.flags;
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		int[] _keys = this._keys;
		//line 67 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 68 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int mask = ( this.nBuckets - 1 );
			//line 69 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int site = x = this.nBuckets;
			//line 70 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int k = key;
			//line 71 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int i = ( k & mask );
			//line 73 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int delKey = -1;
			//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( (( ( flags[( i >> 4 )] >>> (( (( i & 15 )) << 1 )) ) & 2 )) != 0 )) 
			{
				//line 76 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x = i;
			}
			else
			{
				//line 78 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				int inc = ( (( ( ( k >> 3 ) ^ ( k << 3 ) ) | 1 )) & mask );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				int last = i;
				//line 80 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				while ( ! ((( ( (( ( flags[( i >> 4 )] >>> (( (( i & 15 )) << 1 )) ) & 2 )) != 0 ) || ( _keys[i] == key ) ))) )
				{
					//line 82 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (( ( (( ( flags[( i >> 4 )] >>> (( (( i & 15 )) << 1 )) ) & 1 )) != 0 ) && ( delKey == -1 ) )) 
					{
						//line 83 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						delKey = i;
					}
					
					//line 84 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					i = ( ( i + inc ) & mask );
				}
				
				//line 93 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				if (( ( (( ( flags[( i >> 4 )] >>> (( (( i & 15 )) << 1 )) ) & 2 )) != 0 ) && ( delKey != -1 ) )) 
				{
					//line 94 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					x = delKey;
				}
				else
				{
					//line 96 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					x = i;
				}
				
			}
			
		}
		
		//line 100 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		if (( (( ( flags[( x >> 4 )] >>> (( (( x & 15 )) << 1 )) ) & 2 )) != 0 )) 
		{
			//line 102 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			_keys[x] = key;
			//line 103 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.vals[x] = value;
			//line 104 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			flags[( x >> 4 )] &=  ~ ((( 3 << (( (( x & 15 )) << 1 )) ))) ;
			//line 105 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.size++;
			//line 106 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.nOccupied++;
		}
		else
		{
			//line 107 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( (( ( flags[( x >> 4 )] >>> (( (( x & 15 )) << 1 )) ) & 1 )) != 0 )) 
			{
				//line 108 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				_keys[x] = key;
				//line 109 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				this.vals[x] = value;
				//line 110 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				flags[( x >> 4 )] &=  ~ ((( 3 << (( (( x & 15 )) << 1 )) ))) ;
				//line 111 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				this.size++;
			}
			else
			{
				//line 114 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				this.vals[x] = value;
			}
			
		}
		
	}
	
	
	public void resize(int newNBuckets)
	{
		//line 231 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		int[] newFlags = null;
		//line 232 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		int j = 1;
		//line 233 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			{
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				int x = newNBuckets;
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				 -- x;
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x |= ( x >>> 1 );
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x |= ( x >>> 2 );
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x |= ( x >>> 4 );
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x |= ( x >>> 8 );
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				x |= ( x >>> 16 );
				//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				newNBuckets =  ++ x;
			}
			
			//line 235 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( newNBuckets < 4 )) 
			{
				//line 235 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				newNBuckets = 4;
			}
			
			//line 236 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( this.size >= ( ( newNBuckets * 0.7 ) + 0.5 ) )) 
			{
				//line 238 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				j = 0;
			}
			else
			{
				//line 240 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				int nfSize = 0;
				//line 240 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				if (( newNBuckets < 16 )) 
				{
					//line 240 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					nfSize = 1;
				}
				else
				{
					//line 240 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					nfSize = ( newNBuckets >> 4 );
				}
				
				//line 241 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				newFlags = new int[nfSize];
				//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				{
					//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					int _g = 0;
					//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					while (( _g < nfSize ))
					{
						//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						int i = _g++;
						//line 243 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						newFlags[i] = -1431655766;
					}
					
				}
				
				//line 244 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				if (( this.nBuckets < newNBuckets )) 
				{
					//line 246 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					int[] k = new int[newNBuckets];
					//line 247 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (( this._keys != null )) 
					{
						//line 248 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this._keys) ), ((int) (0) ), ((java.lang.Object) (k) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 249 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					this._keys = k;
					//line 251 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					T[] v = ((T[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 252 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (( this.vals != null )) 
					{
						//line 253 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this.vals) ), ((int) (0) ), ((java.lang.Object) (v) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 254 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					this.vals = v;
				}
				
			}
			
		}
		
		//line 259 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		if (( j != 0 )) 
		{
			//line 262 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.cachedKey = 0;
			//line 263 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.cachedIndex = -1;
			//line 265 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			j = -1;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int nBuckets = this.nBuckets;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int[] _keys = this._keys;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			T[] vals = this.vals;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int[] flags = this.flags;
			//line 268 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			int newMask = ( newNBuckets - 1 );
			//line 269 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			while ((  ++ j < nBuckets ))
			{
				//line 271 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				if ( ! ((( (( ( flags[( j >> 4 )] >>> (( (( j & 15 )) << 1 )) ) & 3 )) != 0 ))) ) 
				{
					//line 273 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					int key = _keys[j];
					//line 274 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					T val = vals[j];
					//line 276 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					flags[( j >> 4 )] |= ( 1 << (( (( j & 15 )) << 1 )) );
					//line 277 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					while (true)
					{
						//line 279 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						int k1 = key;
						//line 280 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						int inc = ( (( ( ( k1 >> 3 ) ^ ( k1 << 3 ) ) | 1 )) & newMask );
						//line 281 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						int i1 = ( k1 & newMask );
						//line 282 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						while ( ! ((( (( ( newFlags[( i1 >> 4 )] >>> (( (( i1 & 15 )) << 1 )) ) & 2 )) != 0 ))) )
						{
							//line 283 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							i1 = ( ( i1 + inc ) & newMask );
						}
						
						//line 284 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						newFlags[( i1 >> 4 )] &=  ~ ((( 2 << (( (( i1 & 15 )) << 1 )) ))) ;
						//line 286 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						if (( ( i1 < nBuckets ) &&  ! ((( (( ( flags[( i1 >> 4 )] >>> (( (( i1 & 15 )) << 1 )) ) & 3 )) != 0 )))  )) 
						{
							//line 288 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							{
								//line 289 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								int tmp = _keys[i1];
								//line 290 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								_keys[i1] = key;
								//line 291 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								key = tmp;
							}
							
							//line 293 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							{
								//line 294 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								T tmp1 = vals[i1];
								//line 295 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								vals[i1] = val;
								//line 296 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
								val = tmp1;
							}
							
							//line 299 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							flags[( i1 >> 4 )] |= ( 1 << (( (( i1 & 15 )) << 1 )) );
						}
						else
						{
							//line 301 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							_keys[i1] = key;
							//line 302 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							vals[i1] = val;
							//line 303 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
							break;
						}
						
					}
					
				}
				
			}
			
			//line 309 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (( nBuckets > newNBuckets )) 
			{
				//line 311 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				{
					//line 312 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					int[] k2 = new int[newNBuckets];
					//line 313 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (_keys) ), ((int) (0) ), ((java.lang.Object) (k2) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 314 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					this._keys = k2;
				}
				
				//line 316 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				{
					//line 317 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					T[] v1 = ((T[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 318 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (vals) ), ((int) (0) ), ((java.lang.Object) (v1) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 319 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					this.vals = v1;
				}
				
			}
			
			//line 323 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.flags = newFlags;
			//line 324 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.nBuckets = newNBuckets;
			//line 325 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.nOccupied = this.size;
			//line 326 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			this.upperBound = ((int) (( ( newNBuckets * 0.7 ) + .5 )) );
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.cachedIndex = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.nBuckets = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.cachedKey = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("size")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.size = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.upperBound = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.nOccupied = ((int) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
			}
			
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.cachedIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 97513095:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("flags")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.flags = ((int[]) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.cachedKey = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("_keys")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this._keys = ((int[]) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.upperBound = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("vals")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.vals = ((T[]) (value) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.nOccupied = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.nBuckets = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("size")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.size = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return value;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
			}
			
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			switch (field.hashCode())
			{
				case -934437708:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("resize")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 97513095:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("flags")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.flags;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("set")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("_keys")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this._keys;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 1005083856:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.cachedIndex;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("vals")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.vals;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.cachedKey;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.nBuckets;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.upperBound;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("size")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.size;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return this.nOccupied;
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
			}
			
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.cachedIndex) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.nBuckets) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.cachedKey) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("size")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.size) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.upperBound) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						return ((double) (this.nOccupied) );
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
			}
			
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			boolean __temp_executeDef1 = true;
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			switch (field.hashCode())
			{
				case -934437708:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("resize")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.resize(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					if (field.equals("set")) 
					{
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						__temp_executeDef1 = false;
						//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
						this.set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
					break;
				}
				
				
			}
			
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			if (__temp_executeDef1) 
			{
				//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("cachedIndex");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("cachedKey");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("upperBound");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("nOccupied");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("size");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("nBuckets");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("vals");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("_keys");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		baseArr.push("flags");
		//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
		{
			//line 34 "/usr/lib/haxe/std/java/_std/haxe/ds/IntMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


