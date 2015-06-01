package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FieldLookup extends haxe.lang.HxObject
{
	public FieldLookup(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FieldLookup()
	{
		//line 28 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		haxe.lang.FieldLookup.__hx_ctor_haxe_lang_FieldLookup(this);
	}
	
	
	public static void __hx_ctor_haxe_lang_FieldLookup(haxe.lang.FieldLookup __temp_me10)
	{
	}
	
	
	public static int hash(java.lang.String s)
	{
		
		return s.hashCode();
	
	}
	
	
	public static int findHash(java.lang.String hash, java.lang.String[] hashs, int length)
	{
		//line 41 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		int min = 0;
		//line 42 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		int max = length;
		//line 44 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		while (( min < max ))
		{
			//line 46 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			int mid = ((int) (( (( max + min )) / 2 )) );
			//line 47 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			int classify = hash.compareTo(hashs[mid]);
			//line 48 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			if (( classify < 0 )) 
			{
				//line 50 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				max = mid;
			}
			else
			{
				//line 51 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( classify > 0 )) 
				{
					//line 52 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					min = ( mid + 1 );
				}
				else
				{
					//line 54 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					return mid;
				}
				
			}
			
		}
		
		//line 58 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		return  ~ (min) ;
	}
	
	
	public static void removeString(java.lang.String[] a, int length, int pos)
	{
		//line 62 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (( pos + 1 )) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
		//line 63 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		a[( length - 1 )] = null;
	}
	
	
	public static void removeFloat(double[] a, int length, int pos)
	{
		//line 67 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (( pos + 1 )) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
		//line 68 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		a[( length - 1 )] = ((double) (0) );
	}
	
	
	public static void removeDynamic(java.lang.Object[] a, int length, int pos)
	{
		//line 72 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (( pos + 1 )) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
		//line 73 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		a[( length - 1 )] = null;
	}
	
	
	public static java.lang.String[] insertString(java.lang.String[] a, int length, int pos, java.lang.String x)
	{
		//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		{
			//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			java.lang.String[] a1 = a;
			//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			int capacity = a1.length;
			//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			if (( pos == length )) 
			{
				//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( capacity == length )) 
				{
					//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					java.lang.String[] newarr = new java.lang.String[( (( length << 1 )) + 1 )];
					//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (a1.length) ));
					//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					a1 = newarr;
				}
				
			}
			else
			{
				//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( pos == 0 )) 
				{
					//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.String[] newarr1 = new java.lang.String[( (( length << 1 )) + 1 )];
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr1) ), ((int) (1) ), ((int) (length) ));
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr1;
					}
					else
					{
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else
				{
					//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.String[] newarr2 = new java.lang.String[( (( length << 1 )) + 1 )];
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr2) ), ((int) (0) ), ((int) (pos) ));
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr2;
					}
					else
					{
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (0) ), ((int) (pos) ));
					}
					
				}
				
			}
			
			//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			a1[pos] = x;
			//line 121 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			return a1;
		}
		
	}
	
	
	public static double[] insertFloat(double[] a, int length, int pos, double x)
	{
		//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		{
			//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			double[] a1 = a;
			//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			int capacity = a1.length;
			//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			if (( pos == length )) 
			{
				//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( capacity == length )) 
				{
					//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					double[] newarr = new double[( (( length << 1 )) + 1 )];
					//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (a1.length) ));
					//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					a1 = newarr;
				}
				
			}
			else
			{
				//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( pos == 0 )) 
				{
					//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						double[] newarr1 = new double[( (( length << 1 )) + 1 )];
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr1) ), ((int) (1) ), ((int) (length) ));
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr1;
					}
					else
					{
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else
				{
					//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						double[] newarr2 = new double[( (( length << 1 )) + 1 )];
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr2) ), ((int) (0) ), ((int) (pos) ));
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr2;
					}
					else
					{
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (0) ), ((int) (pos) ));
					}
					
				}
				
			}
			
			//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			a1[pos] = x;
			//line 122 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			return a1;
		}
		
	}
	
	
	public static java.lang.Object[] insertDynamic(java.lang.Object[] a, int length, int pos, java.lang.Object x)
	{
		//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		{
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			java.lang.Object[] a1 = a;
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			java.lang.Object x1 = x;
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			int capacity = a1.length;
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			if (( pos == length )) 
			{
				//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( capacity == length )) 
				{
					//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					java.lang.Object[] newarr = new java.lang.Object[( (( length << 1 )) + 1 )];
					//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (a1.length) ));
					//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					a1 = newarr;
				}
				
			}
			else
			{
				//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
				if (( pos == 0 )) 
				{
					//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.Object[] newarr1 = new java.lang.Object[( (( length << 1 )) + 1 )];
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr1) ), ((int) (1) ), ((int) (length) ));
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr1;
					}
					else
					{
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else
				{
					//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
					if (( capacity == length )) 
					{
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.Object[] newarr2 = new java.lang.Object[( (( length << 1 )) + 1 )];
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (newarr2) ), ((int) (0) ), ((int) (pos) ));
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						a1 = newarr2;
					}
					else
					{
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (pos) ), ((java.lang.Object) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
						//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
						java.lang.System.arraycopy(((java.lang.Object) (a1) ), ((int) (0) ), ((java.lang.Object) (a1) ), ((int) (0) ), ((int) (pos) ));
					}
					
				}
				
			}
			
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			a1[pos] = x1;
			//line 123 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
			return a1;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		return new haxe.lang.FieldLookup(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "/usr/lib/haxe/std/java/internal/FieldLookup.hx"
		return new haxe.lang.FieldLookup();
	}
	
	
}


