package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main1 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public Main1(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main1()
	{
		//line 9 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		haxe.root.Main1.__hx_ctor__Main1(this);
	}
	
	
	public static void __hx_ctor__Main1(haxe.root.Main1 __temp_me3)
	{
	}
	
	
	public static void main()
	{
		//line 11 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		try 
		{
			//line 13 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			org.vertx.java.core.Vertx vertx = org.vertx.java.core.VertxFactory.newVertx();
			//line 14 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			org.vertx.java.core.http.HttpServer server = vertx.createHttpServer();
			//line 16 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			server.requestHandler(((org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>) (new haxe.root.Main1_Handler_517()) ));
			//line 39 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			server.listen(((int) (1234) ));
			//line 40 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			System.in.read();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 11 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			{
				//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				java.lang.Object e = __temp_catchall2;
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		return new haxe.root.Main1(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		return new haxe.root.Main1();
	}
	
	
}


