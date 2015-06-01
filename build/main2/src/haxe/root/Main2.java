package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main2 extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public Main2(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main2()
	{
		//line 24 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		haxe.root.Main2.__hx_ctor__Main2(this);
	}
	
	
	public static void __hx_ctor__Main2(haxe.root.Main2 __temp_me6)
	{
	}
	
	
	public static void main()
	{
		//line 26 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		try 
		{
			//line 28 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			org.vertx.java.core.Vertx vertx = org.vertx.java.core.VertxFactory.newVertx();
			//line 29 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			org.vertx.java.core.http.HttpServer server = vertx.createHttpServer();
			//line 31 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			server.requestHandler(((org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>) (new haxe.root.Main2_Handler_669()) ));
			//line 50 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			server.listen(((int) (1234) ));
			//line 51 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			System.in.read();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 26 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 53 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 53 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 53 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 53 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			{
				//line 53 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				java.lang.Object e = __temp_catchall2;
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		return new haxe.root.Main2(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		return new haxe.root.Main2();
	}
	
	
}


