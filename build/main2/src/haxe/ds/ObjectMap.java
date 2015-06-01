package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ObjectMap<K, V> extends haxe.lang.HxObject implements haxe.IMap<K, V>
{
	public ObjectMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ObjectMap()
	{
		//line 59 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		haxe.ds.ObjectMap.__hx_ctor_haxe_ds_ObjectMap(this);
	}
	
	
	public static <K_c, V_c> void __hx_ctor_haxe_ds_ObjectMap(haxe.ds.ObjectMap<K_c, V_c> __temp_me13)
	{
		//line 61 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		__temp_me13.cachedIndex = -1;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		return new haxe.ds.ObjectMap<java.lang.Object, java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		return new haxe.ds.ObjectMap<java.lang.Object, java.lang.Object>();
	}
	
	
	public int[] hashes;
	
	public K[] _keys;
	
	public V[] vals;
	
	public int nBuckets;
	
	public int size;
	
	public int nOccupied;
	
	public int upperBound;
	
	public K cachedKey;
	
	public int cachedIndex;
	
	public void set(K key, V value)
	{
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int x = 0;
		//line 66 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int k = 0;
		//line 67 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		if (( this.nOccupied >= this.upperBound )) 
		{
			//line 69 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( this.nBuckets > ( this.size << 1 ) )) 
			{
				//line 70 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				this.resize(( this.nBuckets - 1 ));
			}
			else
			{
				//line 72 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				this.resize(( this.nBuckets + 2 ));
			}
			
		}
		
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int[] hashes = this.hashes;
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		K[] keys = this._keys;
		//line 75 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int[] hashes1 = hashes;
		//line 76 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int mask = 0;
			//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( this.nBuckets == 0 )) 
			{
				//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				mask = 0;
			}
			else
			{
				//line 77 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				mask = ( this.nBuckets - 1 );
			}
			
			//line 78 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int site = x = this.nBuckets;
			//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			{
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int k1 = key.hashCode();
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 + 2127912214 ) + (( k1 << 12 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 ^ -949894596 ) ^ ( k1 >> 19 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 + 374761393 ) + (( k1 << 5 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 + -744332180 ) ^ ( k1 << 9 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 + -42973499 ) + (( k1 << 3 )) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k1 = ( ( k1 ^ -1252372727 ) ^ ( k1 >> 16 ) );
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int ret = k1;
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				if (( (( ret & -2 )) == 0 )) 
				{
					//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (( ret == 0 )) 
					{
						//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						ret = 2;
					}
					else
					{
						//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						ret = -1;
					}
					
				}
				
				//line 79 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				k = ret;
			}
			
			//line 80 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int i = ( k & mask );
			//line 80 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int nProbes = 0;
			//line 82 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int delKey = -1;
			//line 84 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( hashes1[i] == 0 )) 
			{
				//line 85 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x = i;
			}
			else
			{
				//line 88 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int last = i;
				//line 88 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int flag = 0;
				//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				do 
				{
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					boolean __temp_stmt2 = false;
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					{
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						int v = flag = hashes1[i];
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_stmt2 = ( v == 0 );
					}
					
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					boolean __temp_boolv3 = false;
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if ( ! (__temp_stmt2) ) 
					{
						//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_boolv3 = ( ( flag == k ) && keys[i].equals(key) );
					}
					
					//line 89 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					boolean __temp_stmt1 = ( __temp_stmt2 || __temp_boolv3 );
					//line 90 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if ( ! ((__temp_stmt1)) ) 
					{
						//line 91 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						if (( ( flag == 1 ) && ( delKey == -1 ) )) 
						{
							//line 92 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							delKey = i;
						}
						
						//line 93 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						i = ( ( i +  ++ nProbes ) & mask );
					}
					else
					{
						//line 90 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						break;
					}
					
				}
				while (true);
				//line 101 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				if (( ( flag == 0 ) && ( delKey != -1 ) )) 
				{
					//line 102 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					x = delKey;
				}
				else
				{
					//line 104 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					x = i;
				}
				
			}
			
		}
		
		//line 114 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int flag1 = hashes1[x];
		//line 115 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		if (( flag1 == 0 )) 
		{
			//line 117 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			keys[x] = key;
			//line 118 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.vals[x] = value;
			//line 119 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			hashes1[x] = k;
			//line 120 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.size++;
			//line 121 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.nOccupied++;
		}
		else
		{
			//line 122 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( flag1 == 1 )) 
			{
				//line 123 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				keys[x] = key;
				//line 124 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				this.vals[x] = value;
				//line 125 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				hashes1[x] = k;
				//line 126 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				this.size++;
			}
			else
			{
				//line 129 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				this.vals[x] = value;
			}
			
		}
		
		//line 132 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		this.cachedIndex = x;
		//line 133 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		this.cachedKey = key;
	}
	
	
	public void resize(int newNBuckets)
	{
		//line 170 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int[] newHash = null;
		//line 171 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		int j = 1;
		//line 172 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			{
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int x = newNBuckets;
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				 -- x;
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x |= ( x >>> 1 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x |= ( x >>> 2 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x |= ( x >>> 4 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x |= ( x >>> 8 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				x |= ( x >>> 16 );
				//line 173 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				newNBuckets =  ++ x;
			}
			
			//line 174 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( newNBuckets < 4 )) 
			{
				//line 174 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				newNBuckets = 4;
			}
			
			//line 175 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( this.size >= ( ( newNBuckets * 0.77 ) + 0.5 ) )) 
			{
				//line 177 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				j = 0;
			}
			else
			{
				//line 179 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int nfSize = newNBuckets;
				//line 180 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				newHash = new int[nfSize];
				//line 181 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				if (( this.nBuckets < newNBuckets )) 
				{
					//line 183 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					K[] k = ((K[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 184 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (( this._keys != null )) 
					{
						//line 185 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this._keys) ), ((int) (0) ), ((java.lang.Object) (k) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 186 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					this._keys = k;
					//line 188 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					V[] v = ((V[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 189 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (( this.vals != null )) 
					{
						//line 190 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						java.lang.System.arraycopy(((java.lang.Object) (this.vals) ), ((int) (0) ), ((java.lang.Object) (v) ), ((int) (0) ), ((int) (this.nBuckets) ));
					}
					
					//line 191 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					this.vals = v;
				}
				
			}
			
		}
		
		//line 196 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		if (( j != 0 )) 
		{
			//line 199 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.cachedKey = null;
			//line 200 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.cachedIndex = -1;
			//line 202 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			j = -1;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int nBuckets = this.nBuckets;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			K[] _keys = this._keys;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			V[] vals = this.vals;
			//line 203 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int[] hashes = this.hashes;
			//line 205 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int newMask = ( newNBuckets - 1 );
			//line 206 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			while ((  ++ j < nBuckets ))
			{
				//line 208 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int k1 = 0;
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				boolean __temp_stmt1 = false;
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				{
					//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					int v1 = k1 = hashes[j];
					//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					__temp_stmt1 = ( (( v1 & -2 )) == 0 );
				}
				
				//line 209 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				if ( ! (__temp_stmt1) ) 
				{
					//line 211 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					K key = _keys[j];
					//line 212 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					V val = vals[j];
					//line 214 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					hashes[j] = 1;
					//line 215 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					while (true)
					{
						//line 217 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						int nProbes = 0;
						//line 219 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						int i = ( k1 & newMask );
						//line 221 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						while ( ! ((( newHash[i] == 0 ))) )
						{
							//line 222 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							i = ( ( i +  ++ nProbes ) & newMask );
						}
						
						//line 224 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						newHash[i] = k1;
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						boolean __temp_boolv4 = ( i < nBuckets );
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						boolean __temp_boolv3 = false;
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						if (__temp_boolv4) 
						{
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							boolean __temp_stmt5 = false;
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							{
								//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								int v2 = k1 = hashes[i];
								//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								__temp_stmt5 = ( (( v2 & -2 )) == 0 );
							}
							
							//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							__temp_boolv3 =  ! (__temp_stmt5) ;
						}
						
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						boolean __temp_stmt2 = ( __temp_boolv4 && __temp_boolv3 );
						//line 226 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						if (__temp_stmt2) 
						{
							//line 228 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							{
								//line 229 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								K tmp = _keys[i];
								//line 230 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								_keys[i] = key;
								//line 231 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								key = tmp;
							}
							
							//line 233 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							{
								//line 234 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								V tmp1 = vals[i];
								//line 235 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								vals[i] = val;
								//line 236 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
								val = tmp1;
							}
							
							//line 239 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							hashes[i] = 1;
						}
						else
						{
							//line 241 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							_keys[i] = key;
							//line 242 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							vals[i] = val;
							//line 243 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
							break;
						}
						
					}
					
				}
				
			}
			
			//line 249 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (( nBuckets > newNBuckets )) 
			{
				//line 251 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				{
					//line 252 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					K[] k2 = ((K[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 253 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (_keys) ), ((int) (0) ), ((java.lang.Object) (k2) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 254 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					this._keys = k2;
				}
				
				//line 256 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				{
					//line 257 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					V[] v3 = ((V[]) (((java.lang.Object) (new java.lang.Object[newNBuckets]) )) );
					//line 258 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					java.lang.System.arraycopy(((java.lang.Object) (vals) ), ((int) (0) ), ((java.lang.Object) (v3) ), ((int) (0) ), ((int) (newNBuckets) ));
					//line 259 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					this.vals = v3;
				}
				
			}
			
			//line 263 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.hashes = newHash;
			//line 264 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.nBuckets = newNBuckets;
			//line 265 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.nOccupied = this.size;
			//line 266 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			this.upperBound = ((int) (( ( newNBuckets * 0.77 ) + .5 )) );
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.cachedIndex = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.nBuckets = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.cachedKey = ((K) (((java.lang.Object) (value) )) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.size = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.upperBound = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.nOccupied = ((int) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.cachedIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1224424900:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("hashes")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.hashes = ((int[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.cachedKey = ((K) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("_keys")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this._keys = ((K[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.upperBound = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("vals")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.vals = ((V[]) (value) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.nOccupied = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.nBuckets = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.size = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return value;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			switch (field.hashCode())
			{
				case -934437708:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("resize")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1224424900:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("hashes")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.hashes;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("set")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 91023059:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("_keys")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this._keys;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.cachedIndex;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3612018:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("vals")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.vals;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.cachedKey;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.nBuckets;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.upperBound;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.size;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return this.nOccupied;
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			switch (field.hashCode())
			{
				case 1005083856:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedIndex")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (this.cachedIndex) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 325636987:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nBuckets")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (this.nBuckets) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -553141795:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("cachedKey")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (this.cachedKey) ))) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("size")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (this.size) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -1690761732:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("upperBound")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (this.upperBound) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case -394102484:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("nOccupied")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						return ((double) (this.nOccupied) );
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			switch (field.hashCode())
			{
				case -934437708:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("resize")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.resize(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					if (field.equals("set")) 
					{
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
						this.set(((K) (dynargs.__get(0)) ), ((V) (dynargs.__get(1)) ));
					}
					
					//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("cachedIndex");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("cachedKey");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("upperBound");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("nOccupied");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("size");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("nBuckets");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("vals");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("_keys");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		baseArr.push("hashes");
		//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 26 "/usr/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


