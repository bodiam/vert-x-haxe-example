package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringMap<T> extends haxe.lang.HxObject implements haxe.IMap<java.lang.String, T>
{
	public StringMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringMap()
	{
		//line 59 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		haxe.ds.StringMap.__hx_ctor_haxe_ds_StringMap(this);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_ds_StringMap(haxe.ds.StringMap<T_c> __temp_me14)
	{
		//line 61 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		__temp_me14.cachedIndex = -1;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return new haxe.ds.StringMap<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return new haxe.ds.StringMap<java.lang.Object>();
	}
	
	
	public int[] hashes;
	
	public java.lang.String[] _keys;
	
	public T[] vals;
	
	public int nBuckets;
	
	public int size;
	
	public int nOccupied;
	
	public int upperBound;
	
	public java.lang.String cachedKey;
	
	public int cachedIndex;
	
	public void set(java.lang.String key, T value)
	{
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int x = 0;
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int k = 0;
		//line 67 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( this.nOccupied >= this.upperBound )) 
		{
			//line 69 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( this.nBuckets > ( this.size << 1 ) )) 
			{
				//line 70 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				this.resize(( this.nBuckets - 1 ));
			}
			else
			{
				//line 72 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				this.resize(( this.nBuckets + 2 ));
			}
			
		}
		
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int[] hashes = this.hashes;
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		java.lang.String[] keys = this._keys;
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int[] hashes1 = hashes;
		//line 76 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int mask = 0;
			//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( this.nBuckets == 0 )) 
			{
				//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				mask = 0;
			}
			else
			{
				//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				mask = ( this.nBuckets - 1 );
			}
			
			//line 78 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int site = x = this.nBuckets;
			//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			{
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int k1 = key.hashCode();
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 + 2127912214 ) + (( k1 << 12 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 ^ -949894596 ) ^ ( k1 >> 19 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 + 374761393 ) + (( k1 << 5 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 + -744332180 ) ^ ( k1 << 9 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 + -42973499 ) + (( k1 << 3 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k1 = ( ( k1 ^ -1252372727 ) ^ ( k1 >> 16 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int ret = k1;
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( (( ret & -2 )) == 0 )) 
				{
					//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (( ret == 0 )) 
					{
						//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						ret = 2;
					}
					else
					{
						//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						ret = -1;
					}
					
				}
				
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ret;
			}
			
			//line 80 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int i = ( k & mask );
			//line 80 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int nProbes = 0;
			//line 82 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int delKey = -1;
			//line 84 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( hashes1[i] == 0 )) 
			{
				//line 85 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x = i;
			}
			else
			{
				//line 88 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int last = i;
				//line 88 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int flag = 0;
				//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				do 
				{
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					boolean __temp_stmt2 = false;
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					{
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						int v = flag = hashes1[i];
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_stmt2 = ( v == 0 );
					}
					
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					boolean __temp_boolv3 = false;
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if ( ! (__temp_stmt2) ) 
					{
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_boolv3 = ( ( flag == k ) && haxe.lang.Runtime.valEq(this._keys[i], key) );
					}
					
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					boolean __temp_stmt1 = ( __temp_stmt2 || __temp_boolv3 );
					//line 90 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if ( ! ((__temp_stmt1)) ) 
					{
						//line 91 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (( ( flag == 1 ) && ( delKey == -1 ) )) 
						{
							//line 92 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							delKey = i;
						}
						
						//line 93 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						i = ( ( i +  ++ nProbes ) & mask );
					}
					else
					{
						//line 90 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
				}
				while (true);
				//line 101 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( ( flag == 0 ) && ( delKey != -1 ) )) 
				{
					//line 102 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					x = delKey;
				}
				else
				{
					//line 104 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					x = i;
				}
				
			}
			
		}
		
		//line 114 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int flag1 = hashes1[x];
		//line 115 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( flag1 == 0 )) 
		{
			//line 117 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			keys[x] = key;
			//line 118 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.vals[x] = value;
			//line 119 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			hashes1[x] = k;
			//line 120 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.size++;
			//line 121 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.nOccupied++;
		}
		else
		{
			//line 122 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( flag1 == 1 )) 
			{
				//line 123 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				keys[x] = key;
				//line 124 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				this.vals[x] = value;
				//line 125 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				hashes1[x] = k;
				//line 126 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				this.size++;
			}
			else
			{
				//line 129 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				this.vals[x] = value;
			}
			
		}
		
		//line 132 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		this.cachedIndex = x;
		//line 133 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		this.cachedKey = key;
	}
	
	
	public int lookup(java.lang.String key)
	{
		//line 138 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( this.nBuckets != 0 )) 
		{
			//line 140 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int[] hashes = this.hashes;
			//line 140 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			java.lang.String[] keys = this._keys;
			//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int mask = ( this.nBuckets - 1 );
			//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int hash = 0;
			//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			{
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int k = key.hashCode();
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k + 2127912214 ) + (( k << 12 )) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k ^ -949894596 ) ^ ( k >> 19 ) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k + 374761393 ) + (( k << 5 )) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k + -744332180 ) ^ ( k << 9 ) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k + -42973499 ) + (( k << 3 )) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				k = ( ( k ^ -1252372727 ) ^ ( k >> 16 ) );
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int ret = k;
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( (( ret & -2 )) == 0 )) 
				{
					//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (( ret == 0 )) 
					{
						//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						ret = 2;
					}
					else
					{
						//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						ret = -1;
					}
					
				}
				
				//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				hash = ret;
			}
			
			//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int k1 = hash;
			//line 142 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int nProbes = 0;
			//line 143 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int i = ( k1 & mask );
			//line 144 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int last = i;
			//line 144 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int flag = 0;
			//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			do 
			{
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				boolean __temp_stmt4 = false;
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				{
					//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					int v = flag = hashes[i];
					//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					__temp_stmt4 = ( v == 0 );
				}
				
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				boolean __temp_boolv3 =  ! (__temp_stmt4) ;
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				boolean __temp_boolv2 = false;
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (__temp_boolv3) 
				{
					//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					__temp_boolv2 = (( ( ( flag == 1 ) || ( flag != k1 ) ) ||  ! (haxe.lang.Runtime.valEq(keys[i], key))  ));
				}
				
				//line 146 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				boolean __temp_stmt1 = ( __temp_boolv3 && __temp_boolv2 );
				//line 148 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (__temp_stmt1) 
				{
					//line 148 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					i = ( ( i +  ++ nProbes ) & mask );
				}
				else
				{
					//line 148 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
			}
			while (true);
			//line 161 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( (( flag & -2 )) == 0 )) 
			{
				//line 161 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return -1;
			}
			else
			{
				//line 161 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return i;
			}
			
		}
		
		//line 164 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return -1;
	}
	
	
	public void resize(int newNBuckets)
	{
		//line 170 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int[] newHash = null;
		//line 171 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int j = 1;
		//line 172 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			{
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int x = newNBuckets;
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				 -- x;
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x |= ( x >>> 1 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x |= ( x >>> 2 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x |= ( x >>> 4 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x |= ( x >>> 8 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				x |= ( x >>> 16 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				newNBuckets =  ++ x;
			}
			
			//line 174 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( newNBuckets < 4 )) 
			{
				//line 174 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				newNBuckets = 4;
			}
			
			//line 175 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( this.size >= ( ( newNBuckets * 0.77 ) + 0.5 ) )) 
			{
				//line 177 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				j = 0;
			}
			else
			{
				//line 179 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int nfSize = newNBuckets;
				//line 180 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				newHash = new int[nfSize];
				//line 181 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( this.nBuckets < newNBuckets )) 
				{
					//line 183 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					java.lang.String[] k = new java.lang.String[newNBuckets];
					//line 184 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (( this._keys != null )) 
					{
						//line 185 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this._keys) ), ((int) (0) ), ((java.lang.Object) (k) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 186 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					this._keys = k;
					//line 188 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					T[] v = ((T[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 189 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (( this.vals != null )) 
					{
						//line 190 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this.vals) ), ((int) (0) ), ((java.lang.Object) (v) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 191 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					this.vals = v;
				}
				
			}
			
		}
		
		//line 196 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( j != 0 )) 
		{
			//line 199 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedKey = null;
			//line 200 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedIndex = -1;
			//line 202 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			j = -1;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int nBuckets = this.nBuckets;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			java.lang.String[] _keys = this._keys;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			T[] vals = this.vals;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int[] hashes = this.hashes;
			//line 205 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int newMask = ( newNBuckets - 1 );
			//line 206 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			while ((  ++ j < nBuckets ))
			{
				//line 208 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int k1 = 0;
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				boolean __temp_stmt1 = false;
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				{
					//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					int v1 = k1 = hashes[j];
					//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					__temp_stmt1 = ( (( v1 & -2 )) == 0 );
				}
				
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if ( ! (__temp_stmt1) ) 
				{
					//line 211 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					java.lang.String key = _keys[j];
					//line 212 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					T val = vals[j];
					//line 214 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					hashes[j] = 1;
					//line 215 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					while (true)
					{
						//line 217 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						int nProbes = 0;
						//line 219 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						int i = ( k1 & newMask );
						//line 221 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						while ( ! ((( newHash[i] == 0 ))) )
						{
							//line 222 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							i = ( ( i +  ++ nProbes ) & newMask );
						}
						
						//line 224 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						newHash[i] = k1;
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						boolean __temp_boolv4 = ( i < nBuckets );
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						boolean __temp_boolv3 = false;
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (__temp_boolv4) 
						{
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							boolean __temp_stmt5 = false;
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							{
								//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								int v2 = k1 = hashes[i];
								//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								__temp_stmt5 = ( (( v2 & -2 )) == 0 );
							}
							
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_boolv3 =  ! (__temp_stmt5) ;
						}
						
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						boolean __temp_stmt2 = ( __temp_boolv4 && __temp_boolv3 );
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (__temp_stmt2) 
						{
							//line 228 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							{
								//line 229 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								java.lang.String tmp = _keys[i];
								//line 230 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								_keys[i] = key;
								//line 231 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								key = tmp;
							}
							
							//line 233 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							{
								//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								T tmp1 = vals[i];
								//line 235 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								vals[i] = val;
								//line 236 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
								val = tmp1;
							}
							
							//line 239 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							hashes[i] = 1;
						}
						else
						{
							//line 241 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							_keys[i] = key;
							//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							vals[i] = val;
							//line 243 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
							break;
						}
						
					}
					
				}
				
			}
			
			//line 249 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( nBuckets > newNBuckets )) 
			{
				//line 251 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				{
					//line 252 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					java.lang.String[] k2 = new java.lang.String[newNBuckets];
					//line 253 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (_keys) ), ((int) (0) ), ((java.lang.Object) (k2) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 254 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					this._keys = k2;
				}
				
				//line 256 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				{
					//line 257 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					T[] v3 = ((T[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 258 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (vals) ), ((int) (0) ), ((java.lang.Object) (v3) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 259 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					this.vals = v3;
				}
				
			}
			
			//line 263 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.hashes = newHash;
			//line 264 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.nBuckets = newNBuckets;
			//line 265 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.nOccupied = this.size;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.upperBound = ((int) (( ( newNBuckets * 0.77 ) + .5 )) );
		}
		
	}
	
	
	public java.lang.Object get(java.lang.String key)
	{
		//line 272 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		int idx = -1;
		//line 273 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( haxe.lang.Runtime.valEq(this.cachedKey, key) && ( (idx = this.cachedIndex) != -1 ) )) 
		{
			//line 275 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			return this.vals[idx];
		}
		
		//line 278 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		idx = this.lookup(key);
		//line 279 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		if (( idx != -1 )) 
		{
			//line 281 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedKey = key;
			//line 282 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			this.cachedIndex = idx;
			//line 284 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			return this.vals[idx];
		}
		
		//line 287 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return null;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.cachedIndex = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.nBuckets = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.upperBound = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.size = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.nOccupied = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.cachedIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1224424900:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("hashes")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.hashes = ((int[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.cachedKey = haxe.lang.Runtime.toString(value);
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("_keys")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this._keys = ((java.lang.String[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.upperBound = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("vals")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.vals = ((T[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.nOccupied = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.nBuckets = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.size = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			switch (field.hashCode())
			{
				case 102230:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("get")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1224424900:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("hashes")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.hashes;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -934437708:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("resize")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("_keys")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this._keys;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1097094790:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("lookup")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lookup")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("vals")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.vals;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("set")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.nBuckets;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.cachedIndex;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.size;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.cachedKey;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.nOccupied;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.upperBound;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((double) (this.cachedIndex) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((double) (this.nBuckets) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((double) (this.upperBound) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((double) (this.size) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return ((double) (this.nOccupied) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			switch (field.hashCode())
			{
				case 102230:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("get")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.get(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("set")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.set(haxe.lang.Runtime.toString(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -934437708:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("resize")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						this.resize(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
				case -1097094790:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					if (field.equals("lookup")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
						return this.lookup(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("cachedIndex");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("cachedKey");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("upperBound");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("nOccupied");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("size");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("nBuckets");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("vals");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("_keys");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("hashes");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/StringMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


